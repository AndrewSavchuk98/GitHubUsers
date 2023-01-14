package com.example.githubuserstesttask.presentation

data class UserDetailUi(
    val id: Int,
    val avatar: String,
    val email: String,
    val organization: String?,
    val dateOfCreated: String,
    val followers: Int,
    val following: Int
)
