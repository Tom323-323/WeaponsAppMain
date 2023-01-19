package com.tomaslab.app.domain


import android.content.Context
import com.tomaslab.app.R
import com.tomaslab.app.domain.model.WeaponsModel
import com.tomaslab.app.domain.repository.DataRepository

class UseCaseLoadWeapons (private val dataRepository: DataRepository){


    fun loadWeapons(id:Int, context: Context): MutableList<WeaponsModel> {

        val weaponsModel = dataRepository.loadWeaponsFromData(id = id,context = context)

        return weaponsModel
    }

}