package com.example.githubuserstesttask.data.remote

import com.example.githubuserstesttask.data.UserGitHubDataSource
import com.example.githubuserstesttask.data.remote.entities.UserDetailResponse
import com.example.githubuserstesttask.data.remote.entities.UserResponse
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserGitHubRemoteDataSource @Inject constructor(private val service: UsersGitHubApi) :
    UserGitHubDataSource {

    override suspend fun getUsers(): List<UserResponse> {
        return service.getUsers()
    }

    override suspend fun getUserByUsername(username: String): UserDetailResponse {
        return service.getUserByUsername(username)
    }
}