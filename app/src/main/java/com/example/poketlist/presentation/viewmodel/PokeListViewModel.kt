package com.example.poketlist.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.poketlist.data.repository.RepositoryProvider
import com.example.poketlist.domain.model.pokemonList.PokeList
import com.example.poketlist.domain.usecase.GetPokeListUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class PokeListViewModel(
    private val getPokeListUseCase: GetPokeListUseCase = GetPokeListUseCase(RepositoryProvider.pokeListRepository)
): ViewModel(){
    private val _pokeList = MutableStateFlow(
        PokeList(
            count = 0,
            next = "",
            previous = "",
            results = emptyList()
    ))

    val pokeList: StateFlow<PokeList> = _pokeList
    init {
        viewModelScope.launch {
            _pokeList.value = getPokeListUseCase()
        }
    }
}