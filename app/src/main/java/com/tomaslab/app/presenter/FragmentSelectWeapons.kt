package com.tomaslab.app.presenter

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.tomaslab.app.R
import com.tomaslab.app.databinding.FragmentSelectWeaponsLandBinding


class FragmentSelectWeapons: Fragment(R.layout.fragment_select_weapons_land) {

    private var binding: FragmentSelectWeaponsLandBinding? = null

    companion object {
        const val ID_LAND = "id_land"
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSelectWeaponsLandBinding.bind(view)

        val id_land = requireArguments().getInt(ID_LAND)
        landManager(id_land)

        val rv = binding!!.rvTypeWeapons
        rv.layoutManager = LinearLayoutManager(requireContext())


    }

    private fun landManager(id: Int){

        val img_array_land = arrayListOf<Int>(R.drawable.img_main_gb,R.drawable.img_main_fr,R.drawable.img_main_ger,R.drawable.img_main_usa,R.drawable.img_main_fin,
            R.drawable.img_main_jp,R.drawable.img_main_ussr,R.drawable.img_main_ital)

        val title_array_land = resources.getStringArray(R.array.land_name_title)

        if(id == 0) {
            binding?.titleLand?.textSize = 22F
            binding?.titleLand?.text = title_array_land[id]} // Text size from long land - Great Brit
        else {
            binding?.titleLand?.text = title_array_land[id]} // Set title text in Head Line

        binding?.imgLand?.setImageResource(img_array_land[id]) // Set image in Head Line

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}