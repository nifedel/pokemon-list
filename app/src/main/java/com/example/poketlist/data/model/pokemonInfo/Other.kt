package com.example.poketlist.data.model.pokemonInfo

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Other(
    @SerialName("dream_world")
    val dreamWorld: DreamWorld,
    val home: Home,
    @SerialName("official-artwork")
    val officialArtwork: OfficialArtwork,
    val showdown: Showdown
)