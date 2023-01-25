package com.tomaslab.app.data.DataRepository

import android.content.Context
import com.tomaslab.app.R
import com.tomaslab.app.data.storage.DataStorage
import com.tomaslab.app.domain.repository.DataRepository
import com.tomaslab.app.domain.model.WeaponsModel
import com.tomaslab.app.domain.model.WeaponsModelType

class DataRepositoryImp(private val dataStorage: DataStorage): DataRepository {

    override fun loadWeaponsFromData(id: Int, context: Context): MutableList<WeaponsModel> {
        return dataStorage.loadWeaponsFromData(id = id, context = context)
    }

    override fun landManager(idLand: Int,context: Context): Pair<Int, String> {
        return dataStorage.loadTitleLand(idLand = idLand, context = context)
    }

    override fun loadTypeWeapons(id_land: Int, id_type: Int): MutableList<WeaponsModelType> {
        return dataStorage.loadTypeWeapons(id_land = id_land,id_type = id_type)
    }
}