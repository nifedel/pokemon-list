package com.example.poketlist.data.api

import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.converter.kotlinx.serialization.asConverterFactory


// TODO тут реализовано сетевое обращение, только для PokeList. Переписать для обращение к конкретныем покемонам.
object RetrofitClient{
    private const val POKE_LIST_URL = "https://pokeapi.co"

    // Настройка Json: игнорирование неизвестных полей
    private val json = Json { ignoreUnknownKeys = true }

    // Задаем MIME тип как JSON
    val contentType = "application/json".toMediaType()

    val api: PokeListAPI by lazy{
        Retrofit.Builder()
            .baseUrl(POKE_LIST_URL)
            .addConverterFactory(json.asConverterFactory(contentType))
            .build()
            .create(PokeListAPI::class.java)
    }
}