package com.project.gamesapp.domain.items

import com.project.gamesapp.data.remote.models.SpecificGameModel

data class SpecificGameItem(

    val id: Int,
    val title: String,
    val thumbnail: String,
    val description: String

)

fun SpecificGameModel.toSpecificGameItem() = SpecificGameItem(id, title, thumbnail, description)