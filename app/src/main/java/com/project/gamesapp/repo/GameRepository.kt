package com.project.gamesapp.repo

import com.project.gamesapp.data.remote.GameService
import com.project.gamesapp.domain.items.GameItem
import com.project.gamesapp.domain.items.SpecificGameItem
import com.project.gamesapp.domain.items.toGameItem
import com.project.gamesapp.domain.items.toSpecificGameItem
import javax.inject.Inject

class GameRepository @Inject constructor(private val gameService: GameService) {

    suspend fun getGames(): List<GameItem> {

        return gameService.getGames().map {
            it.toGameItem()
        }
    }

    suspend fun getGameById(id: Int): SpecificGameItem {

        return gameService.getGameById(id).toSpecificGameItem()

    }
}