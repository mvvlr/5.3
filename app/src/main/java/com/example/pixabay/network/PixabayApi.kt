package com.example.pixabay.network

import com.example.pixabay.model.PixabayModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PixabayApi {

    @GET("api/")
    fun getImagesByWord(
        @Query("key") key: String = "28971822-35022383c0475f4deeeee565f",
        @Query("q") keyWord: String,
        @Query("page") page: Int,
        @Query("per_page") perPage: Int = 10
    ): Call<PixabayModel>

}