package com.example.poketlist.domain.model.pokemonInfo

data class PokeInfo(
    val id: Int,
    val name: String,
    val typeContainers: List<TypeContainer>,
    val sprites: Sprites,
    val baseExperience: Int,
    val statContainers: List<StatContainer>
)
