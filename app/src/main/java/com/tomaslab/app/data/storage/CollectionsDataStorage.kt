package com.tomaslab.app.data.storage

import android.content.Context
import com.tomaslab.app.R
import com.tomaslab.app.domain.model.WeaponsModel

class CollectionsDataStorage (): DataStorage{

    val img_arr_weapons_0 = arrayListOf<Int>(
        R.drawable.img_german_pistol,
        R.drawable.img_pistol_usa,
        R.drawable.img_ussr_pistol,
        R.drawable.img_main_usa,
        R.drawable.img_main_fin,
        R.drawable.img_main_jp)
    val img_arr_weapons_1 = arrayListOf<Int>(
        R.drawable.img_german_pistol,
        R.drawable.img_pistol_usa,
        R.drawable.img_ussr_pistol,
        R.drawable.img_main_usa,
        R.drawable.img_main_fin,
        R.drawable.img_main_jp)
    val img_arr_weapons_2 = arrayListOf<Int>(
        R.drawable.img_german_pistol,
        R.drawable.img_pistol_usa,
        R.drawable.img_ussr_pistol,
        R.drawable.img_main_usa,
        R.drawable.img_main_fin,
        R.drawable.img_main_jp)
    val img_arr_weapons_3 = arrayListOf<Int>(
        R.drawable.img_german_pistol,
        R.drawable.img_pistol_usa,
        R.drawable.img_ussr_pistol,
        R.drawable.img_main_usa,
        R.drawable.img_main_fin,
        R.drawable.img_main_jp)
    val img_arr_weapons_4 = arrayListOf<Int>(
        R.drawable.img_german_pistol,
        R.drawable.img_pistol_usa,
        R.drawable.img_ussr_pistol,
        R.drawable.img_main_usa,
        R.drawable.img_main_fin,
        R.drawable.img_main_jp)
    val img_arr_weapons_5 = arrayListOf<Int>(
        R.drawable.img_german_pistol,
        R.drawable.img_pistol_usa,
        R.drawable.img_ussr_pistol,
        R.drawable.img_main_usa,
        R.drawable.img_main_fin,
        R.drawable.img_main_jp)
    val img_arr_weapons_6 = arrayListOf<Int>(
        R.drawable.img_german_pistol,
        R.drawable.img_pistol_usa,
        R.drawable.img_ussr_pistol,
        R.drawable.img_main_usa,
        R.drawable.img_main_fin,
        R.drawable.img_main_jp)
    val img_arr_weapons_7 = arrayListOf(
        R.drawable.img_german_pistol,
        R.drawable.img_pistol_usa,
        R.drawable.img_ussr_pistol,
        R.drawable.img_main_usa,
        R.drawable.img_main_fin,
        R.drawable.img_main_jp)

    var array: ArrayList<Int> = arrayListOf()

    override fun loadWeaponsFromData(id: Int, context: Context): MutableList<WeaponsModel> {
        val title_arr = context.resources.getStringArray(R.array.land_title)
        val content_arr = context.resources.getStringArray(R.array.land_content)
        when(id){
            0 -> array = img_arr_weapons_0
            1 -> array = img_arr_weapons_1
            2 -> array = img_arr_weapons_2
            3 -> array = img_arr_weapons_3
            4 -> array = img_arr_weapons_4
            5 -> array = img_arr_weapons_5
            6 -> array = img_arr_weapons_6
            7 -> array = img_arr_weapons_7
        }
        val dataWeapons = mutableListOf<WeaponsModel>()
        for(i in 0..5){dataWeapons.add(WeaponsModel(id = id, title = title_arr[i], img = array[i], content = content_arr[i]))}
        return dataWeapons
    }

    override fun loadTitleLand(idLand: Int, context: Context): Pair<Int, String> {
        val img_array_land = arrayListOf(R.drawable.img_main_gb,R.drawable.img_main_fr,R.drawable.img_main_ger,R.drawable.img_main_usa,R.drawable.img_main_fin,
            R.drawable.img_main_jp,R.drawable.img_main_ussr,R.drawable.img_main_ital)
        val title_array_land = context.resources.getStringArray(R.array.land_name_title)
        return Pair(img_array_land[idLand],title_array_land[idLand])
    }


}