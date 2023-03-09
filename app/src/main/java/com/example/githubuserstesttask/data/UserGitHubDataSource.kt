package com.example.githubuserstesttask.data

import com.example.githubuserstesttask.data.remote.entities.UserDetailResponse
import com.example.githubuserstesttask.data.remote.entities.UserResponse

interface UserGitHubDataSource {

    suspend fun getUsers(): List<UserResponse>

    suspend fun getUserByUsername(username: String): UserDetailResponse
}