package com.example.royal_app_g2.data.retrofit.entity

data class Result(
    val id: Int?,
    val name: String?,
    val status: String?,
    val species: String?,
    val type: String?,
    val gender: String?,
    val origin: Origin?,
    val location: Location?,
    val image: String?,
    val episode: List<String?>?,
    val url: String?,
    val created: String?
)