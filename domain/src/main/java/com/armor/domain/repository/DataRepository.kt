package com.earmor.domain.domain.repository

import android.content.Context
import com.earmor.domain.domain.model.WeaponsModel
import com.earmor.domain.domain.model.WeaponsModelType

interface DataRepository {

    fun loadWeaponsFromData(id: Int, context: Context): MutableList<WeaponsModel>

    fun landManager (idLand: Int, context: Context): Pair<Int,String>

    fun loadTypeWeapons (id_land: Int, id_type: Int): MutableList<WeaponsModelType>

}