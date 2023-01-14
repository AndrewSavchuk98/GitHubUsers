package com.example.githubuserstesttask.presentation.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.githubuserstesttask.R
import com.example.githubuserstesttask.databinding.FragmentUsersListBinding
import com.example.githubuserstesttask.presentation.UserUi
import com.example.githubuserstesttask.presentation.navigator


class UsersListFragment : Fragment() {
    private var _binding: FragmentUsersListBinding? = null
    private val binding get() = _binding!!

    private lateinit var recycler: RecyclerView
    private lateinit var usersAdapter: UsersAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentUsersListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        usersAdapter = UsersAdapter()
        //Todo put users list to adapter
        usersAdapter.submitList(
            listOf(
                UserUi("", "test", "tests"),
                UserUi("", "test", "tests"),
                UserUi("", "test", "tests")
            )
        )
        binding.usersRecyclerView.adapter = usersAdapter
        usersAdapter.setOnItemClickListener(object : UsersAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
                val user = usersAdapter.currentList[position]
                navigator().goToUserDetailFragment(user)
            }
        })

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        @JvmStatic
        fun newInstance() = UsersListFragment()
    }
}