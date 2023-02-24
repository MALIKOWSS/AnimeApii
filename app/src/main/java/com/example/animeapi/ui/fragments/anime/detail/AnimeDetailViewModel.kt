package com.example.animeapi.ui.fragments.anime.detail

import com.example.animeapi.base.BaseViewModel
import com.example.animeapi.data.repositories.anime.AnimeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AnimeDetailViewModel @Inject constructor(private val animeRepository: AnimeRepository): BaseViewModel() {

    fun fetchAnimeById(id: Int) = animeRepository.fetchAnimeById(id)
}