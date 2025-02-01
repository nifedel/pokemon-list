package com.example.poketlist.domain.model.pokemonList

data class PokeListDomain(
    val count: Int,
    val next: String,
    val previous: String? = null,
    val resultDomains: List<ResultDomain>
)