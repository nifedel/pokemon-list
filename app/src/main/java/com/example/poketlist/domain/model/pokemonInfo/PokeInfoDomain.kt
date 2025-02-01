package com.example.poketlist.domain.model.pokemonInfo

data class PokeInfoDomain(
    val id: Int,
    val name: Int,
    val typeContainers: List<TypeContainerDomain>,
    val sprites: SpritesDomain,
    val baseExperience: Int,
    val statContainers: List<StatContainerDomain>
)
