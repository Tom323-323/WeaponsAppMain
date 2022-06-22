package com.tomaslab.app.presenter

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.tomaslab.app.R
import com.tomaslab.app.databinding.FragmentContentWeaponsBinding

class FragmentContentWeapons: Fragment(R.layout.fragment_content_weapons) {


    companion object {
        const val ID_CONTENT = "id_content"
    }

    private var binding: FragmentContentWeaponsBinding? = null

    val index_from_select = requireArguments().getInt(ID_CONTENT,0)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentContentWeaponsBinding.bind(view)
        val index_from_select = requireArguments().getInt(ID_CONTENT,0)



    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}