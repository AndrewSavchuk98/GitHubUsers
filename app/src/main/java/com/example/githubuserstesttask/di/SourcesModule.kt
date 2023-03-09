package com.example.githubuserstesttask.di

import com.example.githubuserstesttask.data.UserGitHubDataSource
import com.example.githubuserstesttask.data.remote.UserGitHubRemoteDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface SourcesModule {

    @Binds
    fun bindRemoteDataSource(
        remoteDataSource: UserGitHubRemoteDataSource
    ): UserGitHubDataSource
}