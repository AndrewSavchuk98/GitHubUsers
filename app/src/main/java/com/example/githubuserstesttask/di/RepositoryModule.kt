package com.example.githubuserstesttask.di

import com.example.githubuserstesttask.data.GitHubUserRepositoryImpl
import com.example.githubuserstesttask.domain.GitHubUserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun bindsRepository(
        gitHubUserRepository: GitHubUserRepositoryImpl
    ): GitHubUserRepository
}