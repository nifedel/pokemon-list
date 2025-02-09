package com.example.poketlist.data.model.pokemonList

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PokeListDTO(
    val count: Int,
    val next: String? = null,
    val previous: String? = null,
    @SerialName("results")
    val resultsDTO: List<ResultDTO>
)