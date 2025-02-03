package com.example.poketlist.data.model.pokemonList

import kotlinx.serialization.Serializable

@Serializable
data class PokeListDTO(
    val count: Int,
    val next: String,
    val previous: String? = null,
    val resultsDTO: List<ResultDTO>
)