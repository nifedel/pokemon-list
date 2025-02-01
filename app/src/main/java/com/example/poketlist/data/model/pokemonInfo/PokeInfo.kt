package com.example.poketlist.data.model.pokemonInfo

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PokeInfo(
    val abilities: List<AbilityDescription>,
    @SerialName("base_experience")
    val baseExperience: Int,
    val cries: Cries,
    val forms: List<Form>,
    @SerialName("game_indices")
    val gameIndices: List<GameIndice>,
    val height: Int,
    val id: Int,
    @SerialName("is_default")
    val isDefault: Boolean,
    @SerialName("location_area_encounters")
    val locationAreaEncounters: String,
    val moves: List<MoveContainer>,
    val name: String,
    val order: Int,
    val species: Species,
    val sprites: Sprites,
    val statContainers: List<StatContainer>,
    val typeContainers: List<TypeContainer>,
    val weight: Int
)