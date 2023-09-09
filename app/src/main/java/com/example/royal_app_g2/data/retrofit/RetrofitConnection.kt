package com.example.royal_app_g2.data.retrofit

import com.example.royal_app_g2.data.retrofit.domain.GetCharacterList
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetrofitConnection {

    var retrofit = Retrofit.Builder().apply {
        baseUrl("https://rickandmortyapi.com/api/")
        addConverterFactory(GsonConverterFactory.create())
    }.build()

    val rickAndMortyApiService: GetCharacterList = retrofit.create(GetCharacterList::class.java)

}