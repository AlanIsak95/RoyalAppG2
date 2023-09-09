package com.example.royal_app_g2.data.retrofit.domain

import com.example.royal_app_g2.data.retrofit.entity.ApiResponse
import retrofit2.Call
import retrofit2.http.GET

interface GetCharacterList {

    /* */
    @GET("character")
    fun getCharacters():Call<ApiResponse>

}