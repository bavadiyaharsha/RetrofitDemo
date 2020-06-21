package com.example.retrofitdemo

import retrofit2.Response
import retrofit2.http.GET

interface AblemService {

    @GET("/Albems")
    suspend fun getAlbems():Response<Albems>
}