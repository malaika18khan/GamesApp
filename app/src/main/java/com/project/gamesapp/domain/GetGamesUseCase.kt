package com.project.gamesapp.domain

import com.project.gamesapp.domain.items.GameItem
import com.project.gamesapp.repo.GameRepository
import javax.inject.Inject

class GetGamesUseCase @Inject constructor(private val gameRepository: GameRepository){

    suspend operator fun invoke(): List<GameItem> {

        return gameRepository.getGames().shuffled()
    }

}