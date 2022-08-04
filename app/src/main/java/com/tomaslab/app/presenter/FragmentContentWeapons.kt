package com.tomaslab.app.presenter

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.tomaslab.app.R
import com.tomaslab.app.databinding.FragmentContentWeaponsBinding

class FragmentContentWeapons: Fragment(R.layout.fragment_content_weapons) {

    companion object {
        const val ID_CONTENT = "id_content"
        const val ID_TYPE = "id_type"
        const val ID_LAND = "id_land"
    }

    private var binding: FragmentContentWeaponsBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentContentWeaponsBinding.bind(view)

        //Get arguments
        val id_weapon= requireArguments().getInt(ID_CONTENT,999)
        val id_type = requireArguments().getInt(ID_TYPE)
        val id_land = requireArguments().getInt(ID_LAND)
        val id_main = id_land.toString()+id_type.toString()+id_weapon.toString()
        crateContent(id_main.toInt()) // Create content

    }

    private fun crateContent(id_main:Int){
       // create model content with image and text


    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}