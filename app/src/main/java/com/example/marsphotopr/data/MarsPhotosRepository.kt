package com.example.marsphotopr.data

import com.example.marsphotopr.model.MarsPhoto
import com.example.marsphotopr.network.MarsApiService

interface MarsPhotosRepository {
    suspend fun getMarsPhoto(): List<MarsPhoto>//возвращает список объектов марс
}

class NetworkMarsRepository(
    private val marsApiService: MarsApiService
) : MarsPhotosRepository {
    override suspend fun getMarsPhoto() : List<MarsPhoto> = marsApiService.getPhotos()//принимает параметры вызова сервера и выдаёт ответ сервера

}