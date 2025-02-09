package com.example.poketlist.data.repository

import com.example.poketlist.data.api.RetrofitClient

object RepositoryProvider {
    // DI
    val pokeListRepository = PokeListRepositoryImp(RetrofitClient.api)
}