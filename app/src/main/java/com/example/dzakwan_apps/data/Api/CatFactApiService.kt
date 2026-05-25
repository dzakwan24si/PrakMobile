package com.example.dzakwan_apps.data.Api

import com.example.dzakwan_apps.data.Model.CatFactModel
import retrofit2.http.GET

interface CatFactApiService {
    @GET("fact")
    suspend fun getCatFact(): CatFactModel
}