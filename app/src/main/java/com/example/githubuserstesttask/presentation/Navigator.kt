package com.example.githubuserstesttask.presentation

import androidx.fragment.app.Fragment

fun Fragment.navigator() = requireActivity() as Navigator

interface Navigator {

    fun goToUserDetailFragment(user: UserUi)

    fun goBack()
}