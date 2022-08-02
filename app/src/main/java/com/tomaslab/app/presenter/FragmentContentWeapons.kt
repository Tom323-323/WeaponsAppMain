package com.tomaslab.app.presenter

import android.os.Bundle
import android.util.Log
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
        val index_from_select = requireArguments().getInt(ID_CONTENT,999)
        val id_type = requireArguments().getInt(ID_TYPE)
        val id_land = requireArguments().getInt(ID_LAND)

        Log.e("AAA","$id_land+_$id_type+_$index_from_select")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}