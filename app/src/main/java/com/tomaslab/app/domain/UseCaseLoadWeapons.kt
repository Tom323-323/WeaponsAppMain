package com.tomaslab.app.domain

import androidx.appcompat.app.AppCompatActivity
import com.tomaslab.app.R
import com.tomaslab.app.domain.model.WeaponsModel

class UseCaseLoadWeapons: AppCompatActivity() {
    val dataWeapons = mutableListOf<WeaponsModel>()

    val title_arr = resources.getStringArray(R.array.land_title)
    val content_arr = resources.getStringArray(R.array.land_content)

    fun loadWeapons(id:Int): MutableList<WeaponsModel> {
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
        val img_arr_weapons_7 = arrayListOf<Int>(
            R.drawable.img_german_pistol,
            R.drawable.img_pistol_usa,
            R.drawable.img_ussr_pistol,
            R.drawable.img_main_usa,
            R.drawable.img_main_fin,
            R.drawable.img_main_jp)

        var array = arrayListOf<Int>()
        when(id){
            0 ->  array = img_arr_weapons_0
            1 ->  array = img_arr_weapons_1
            2 ->  array = img_arr_weapons_2
            3 ->  array = img_arr_weapons_3
            4 ->  array = img_arr_weapons_4
            5 ->  array = img_arr_weapons_5
            6 ->  array = img_arr_weapons_6
            7 ->  array = img_arr_weapons_7
        }
        for(i in 0..5){dataWeapons.add(WeaponsModel(id = id, title = title_arr[i], img = array[i], content = content_arr[i]))}
        return dataWeapons
    }

}