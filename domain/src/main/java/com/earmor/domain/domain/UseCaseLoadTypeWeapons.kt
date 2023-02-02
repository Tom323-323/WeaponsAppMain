package com.earmor.domain.domain

import com.earmor.domain.domain.model.WeaponsModelType
import com.earmor.domain.domain.repository.DataRepository

class UseCaseLoadTypeWeapons  (private val dataRepository: DataRepository){

    fun loadTypeWeapons(id_land: Int, id_type: Int): MutableList<WeaponsModelType>{

        return dataRepository.loadTypeWeapons(id_land = id_land, id_type = id_type)

    }
}