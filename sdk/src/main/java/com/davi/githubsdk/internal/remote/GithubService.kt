package com.davi.githubsdk.internal.remote

import com.davi.githubsdk.internal.remote.model.EmojiMapResponse
import com.davi.githubsdk.internal.remote.model.RepoResponse
import com.davi.githubsdk.internal.remote.model.UserResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface GithubService {

    @GET("emojis")
    suspend fun fetchEmojis(): EmojiMapResponse

    @GET("users/{username}")
    suspend fun fetchUser(
        @Path("username") username: String
    ): UserResponse

    @GET("users/{username}/repos")
    suspend fun fetchRepoList(
        @Path("username") username: String = "google",
        @Query("page") page: Int = 1,
        @Query("per_page") size: Int = 10
    ): List<RepoResponse>
}
