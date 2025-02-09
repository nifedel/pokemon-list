package com.example.poketlist.data.api

import com.example.poketlist.data.model.pokemonList.PokeListDTO

import retrofit2.http.GET
import retrofit2.http.Query


interface PokeListAPI {

    // To take a list of all pokemons and they total number, It's a JSON file.
    /* Data Example:

    count	1304
    next	null
    previous	null
    results	[…]
    */

    @GET("api/v2/pokemon")
    suspend fun getPokeList(
        @Query("limit") limit: Int = 10000,
        @Query("offset") offset: Int = 0
    ): PokeListDTO
}