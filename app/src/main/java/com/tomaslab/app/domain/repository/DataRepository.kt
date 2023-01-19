package com.tomaslab.app.domain.repository

import android.content.Context
import com.tomaslab.app.domain.model.WeaponsModel

interface DataRepository {

    fun loadWeaponsFromData(id: Int, context: Context): MutableList<WeaponsModel>

    fun landManager (idLand: Int, context: Context): Pair<Int,String>

}