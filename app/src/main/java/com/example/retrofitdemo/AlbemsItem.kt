package com.example.retrofitdemo

import com.google.gson.annotations.SerializedName

data class AlbemsItem(
    @SerializedName("id")
    val id: Int,

    @SerializedName("title")
    val title: String,

    @SerializedName("userId")
    val userId: Int
)