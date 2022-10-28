package com.example.savchuk.githubusers.data.remote

import com.example.savchuk.githubusers.data.remote.model.GitHubUserResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubUserApi {

    @GET("/users")
    suspend fun getAllUsers(): List<GitHubUserResponse>

    @GET("/users/{login}")
    suspend fun getUser( @Path("login") login: String): GitHubUserResponse
}