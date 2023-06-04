package com.project.gamesapp.domain

import com.project.gamesapp.domain.items.SpecificGameItem
import com.project.gamesapp.repo.GameRepository
import javax.inject.Inject

class GetGameByIdUseCase @Inject constructor(private val gameRepository: GameRepository){

    suspend operator fun invoke(id: Int): SpecificGameItem {

        return gameRepository.getGameById(id)
    }
}