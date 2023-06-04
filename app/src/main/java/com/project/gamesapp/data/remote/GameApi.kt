package com.project.gamesapp.data.remote

import com.project.gamesapp.data.remote.models.GameModel
import com.project.gamesapp.data.remote.models.SpecificGameModel
import com.project.gamesapp.util.Constants.Companion.GAMES_ENDPOINT
import com.project.gamesapp.util.Constants.Companion.GAME_ID_ENDPOINT
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface GameApi {

    @GET(GAMES_ENDPOINT)
    suspend fun getGames(): Response<List<GameModel>>

    @GET(GAME_ID_ENDPOINT)
    suspend fun getGamesById(@Query(value = "id") id: Int): Response<SpecificGameModel>
}