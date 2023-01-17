package com.tomaslab.app.domain

import androidx.appcompat.app.AppCompatActivity
import com.tomaslab.app.R

class UseCaseLandManager: AppCompatActivity() {

    fun loadLand(id:Int){
        val img_array_land = arrayListOf<Int>(
            R.drawable.img_main_gb,
            R.drawable.img_main_fr,
            R.drawable.img_main_ger,
            R.drawable.img_main_usa,
            R.drawable.img_main_fin,
            R.drawable.img_main_jp,
            R.drawable.img_main_ussr,
            R.drawable.img_main_ital)

        val title_array_land = resources.getStringArray(R.array.land_name_title)

/*        if(id == 0) {
            binding?.titleLand?.textSize = 22F
            binding?.titleLand?.text = title_array_land[id]} // Text size from long land - Great Brit
        else {
            binding?.titleLand?.text = title_array_land[id]} // Set title text in Head Line

        binding?.imgLand?.setImageResource(img_array_land[id]) // Set image in Head Line*/

    }
}