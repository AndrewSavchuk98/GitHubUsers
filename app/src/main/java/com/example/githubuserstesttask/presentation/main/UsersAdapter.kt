package com.example.githubuserstesttask.presentation.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.githubuserstesttask.R
import com.example.githubuserstesttask.presentation.UserUi

class UsersAdapter : ListAdapter<UserUi, UsersAdapter.UserViewHolder>(userDiffUtil) {
    private var listener: OnItemClickListener? = null

    class UserViewHolder(itemView: View) : ViewHolder(itemView) {
        //Todo do it with viewBinding

        private val imageView = itemView.findViewById<ImageView>(R.id.avatarImageView)
        private val titleTextView = itemView.findViewById<TextView>(R.id.nameTextView)
        private val subtitleTextView = itemView.findViewById<TextView>(R.id.subtitleTextView)
        fun bind(user: UserUi) {
            //Todo do image with Koin or Glide
            imageView.setImageURI(user.avatar.toUri())
            titleTextView.text = user.title
            subtitleTextView.text = user.subtitle

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        return UserViewHolder(
            LayoutInflater
                .from(parent.context).inflate(R.layout.item_user, parent, false)
        )
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(getItem(position))
        holder.itemView.setOnClickListener {
            listener?.onItemClick(position)
        }
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        this.listener = listener
    }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }
}

val userDiffUtil = object : DiffUtil.ItemCallback<UserUi>() {
    override fun areItemsTheSame(oldItem: UserUi, newItem: UserUi): Boolean {
        return oldItem.subtitle == newItem.subtitle
    }

    override fun areContentsTheSame(oldItem: UserUi, newItem: UserUi): Boolean {
        return oldItem == newItem
    }

}
