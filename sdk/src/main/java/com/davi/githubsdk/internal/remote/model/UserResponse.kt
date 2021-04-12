package com.davi.githubsdk.internal.remote.model

import com.squareup.moshi.Json

data class UserResponse(
    @Json(name = "name") val name: String,
    @Json(name = "avatar_url") val avatarUrl: String,
    @Json(name = "html_url") val url: String
)
