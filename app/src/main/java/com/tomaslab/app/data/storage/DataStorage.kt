package com.tomaslab.app.data.storage

import android.content.Context
import com.tomaslab.app.domain.model.WeaponsModel
import com.tomaslab.app.domain.model.WeaponsModelType

interface DataStorage {

    fun loadWeaponsFromData(id: Int, context: Context): MutableList<WeaponsModel>

    fun loadTitleLand(idLand: Int,context: Context):Pair<Int, String>

    fun loadTypeWeapons(id_land: Int, id_type: Int): MutableList<WeaponsModelType>

}