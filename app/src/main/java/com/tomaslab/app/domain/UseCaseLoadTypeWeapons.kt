package com.tomaslab.app.domain

import com.tomaslab.app.domain.model.WeaponsModelType

class UseCaseLoadTypeWeapons  {

    fun loadTypeWeapons(id_land: Int, id_type: Int): MutableList<WeaponsModelType>{
        val dataWeaponsType = mutableListOf <WeaponsModelType>()
        for(i in 0..5){
            dataWeaponsType.add(
                WeaponsModelType(
                    id = "",
                    name ="Maschinenpistole MP-40",
                    title = i.toString(),
                    calibr = id_land.toString(),
                    year = "Year: 1938",
                    men = "Designer: Hugo Schmeisser",
                    image = 77)
            )
        }
        return dataWeaponsType
    }
}