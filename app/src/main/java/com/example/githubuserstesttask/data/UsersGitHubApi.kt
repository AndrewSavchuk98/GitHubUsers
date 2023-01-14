package com.example.githubuserstesttask.data

import com.example.githubuserstesttask.data.entities.UserResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface UsersGitHubApi {
    @GET("/users")
    suspend fun getUsers(): List<UserResponse>

    @GET("/users/{username}")
    suspend fun getUserByUsername(@Path("username") username: String): UserResponse
}