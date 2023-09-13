package com.example.marsphotopr.network

import com.example.marsphotopr.model.MarsPhoto
import retrofit2.http.GET

interface MarsApiService {
    @GET("photos")
    suspend fun getPhotos() : List<MarsPhoto>

}
