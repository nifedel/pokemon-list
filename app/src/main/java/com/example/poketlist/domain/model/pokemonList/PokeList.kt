package com.example.poketlist.domain.model.pokemonList

data class PokeList(
    val count: Int,
    val next: String? = null,
    val previous: String? = null,
    val results: List<Result>
)