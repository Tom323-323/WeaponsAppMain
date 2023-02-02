package com.earmor.domain.domain


import android.content.Context
import com.earmor.domain.domain.model.WeaponsModel
import com.earmor.domain.domain.repository.DataRepository

class UseCaseLoadWeapons (private val dataRepository: DataRepository){

    fun loadWeapons(id: Int, context: Context): MutableList<WeaponsModel> {
        return dataRepository.loadWeaponsFromData(id = id, context = context)
    }

    fun loadLand (idLand:Int, context:Context):Pair<Int,String>{
        val pair = dataRepository.landManager(idLand = idLand, context = context)
        return Pair(pair.first,pair.second)
    }
}