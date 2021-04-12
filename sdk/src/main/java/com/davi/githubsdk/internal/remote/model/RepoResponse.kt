package com.davi.githubsdk.internal.remote.model

import com.squareup.moshi.Json

data class RepoResponse(
    @Json(name = "full_name") val fullName: String,
    @Json(name = "html_url") val url: String,
    @Json(name = "stargazers_count") val stars: String,
)
