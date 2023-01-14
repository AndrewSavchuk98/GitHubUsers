package com.example.githubuserstesttask.presentation.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.example.githubuserstesttask.presentation.UserUi
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserDetailFragment : Fragment() {

    //todo viewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    companion object {

        const val USER_KEY = "com.example.githubuserstesttask.presentation.detail.USER_KEY"

        fun newInstance(user: UserUi): UserDetailFragment {
            val fragment = UserDetailFragment()
            val args = bundleOf(USER_KEY to user)
            fragment.arguments = args
            return fragment
        }

    }
}