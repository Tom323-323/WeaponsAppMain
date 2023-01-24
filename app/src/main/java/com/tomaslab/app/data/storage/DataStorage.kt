package com.tomaslab.app.data.storage

import android.content.Context
import com.tomaslab.app.domain.model.WeaponsModel

interface DataStorage {

    fun loadWeaponsFromData(id: Int, context: Context): MutableList<WeaponsModel>

    fun loadTitleLand(idLand: Int,context: Context):Pair<Int, String>

}