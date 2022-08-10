package com.tomaslab.app.presenter

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.tomaslab.app.R
import com.tomaslab.app.databinding.FragmentContentWeaponsBinding
import com.tomaslab.app.presenter.model.ContentModel

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
        val id_type = requireArguments().getInt(ID_TYPE, 999)
        val id_land = requireArguments().getInt(ID_LAND,999)


        //val id_main = id_land.toString()+id_type.toString()+id_weapon.toString()


        crateContent(id_land,id_type,id_land) // Create content

    }

    private fun crateContent(land: Int, type: Int, weapons: Int){
       ContentModel(land = land, type = type, weapons = weapons)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}