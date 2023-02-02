package com.armor.data.data.storage

import android.content.Context
import com.armor.data.data.storage.models.DataModelTypeWeapons
import com.armor.data.data.storage.models.DataModelWeapons

interface DataStorage {

    fun loadWeaponsFromData(id: Int, context: Context): MutableList<DataModelWeapons>

    fun loadTitleLand(idLand: Int,context: Context):Pair<Int, String>

    fun loadTypeWeapons(id_land: Int, id_type: Int): MutableList<DataModelTypeWeapons>

}