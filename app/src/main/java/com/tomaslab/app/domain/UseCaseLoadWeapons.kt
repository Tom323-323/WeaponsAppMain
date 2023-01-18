package com.tomaslab.app.domain

import androidx.appcompat.app.AppCompatActivity
import com.tomaslab.app.R
import com.tomaslab.app.domain.model.WeaponsModel

class UseCaseLoadWeapons: AppCompatActivity() {
    val dataWeapons = mutableListOf<WeaponsModel>()



    fun loadWeapons(id:Int): MutableList<WeaponsModel> {

        val title_arr = arrayListOf<Int>(R.string.land_0,R.string.land_1,R.string.land_2,R.string.land_3,R.string.land_4,R.string.land_5,R.string.land_6,R.string.land_7,)
        val content_arr = arrayListOf<String>("grtsfSEfgergt","gfaesefserger","aergaesferg","grtsfSEfgergt","gfaesefserger","aergaesferg")

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

        val arrayMain = arrayListOf(img_arr_weapons_0,
                                    img_arr_weapons_1,
                                    img_arr_weapons_2,
                                    img_arr_weapons_3,
                                    img_arr_weapons_4,
                                    img_arr_weapons_5,
                                    img_arr_weapons_6,
                                    img_arr_weapons_7)

        val array = arrayMain[id]

        for(i in 0..5){dataWeapons.add(WeaponsModel(id = id, title = title_arr[i].toString(), img = array[i], content = content_arr[i]))}
        return dataWeapons
    }

}