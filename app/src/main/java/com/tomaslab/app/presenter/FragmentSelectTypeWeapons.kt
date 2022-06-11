package com.tomaslab.app.presenter

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.tomaslab.app.R
import com.tomaslab.app.databinding.FragmentSelectTypeWeaponsBinding

class FragmentSelectTypeWeapons: Fragment(R.layout.fragment_select_type_weapons) {

    private var binding: FragmentSelectTypeWeaponsBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSelectTypeWeaponsBinding.bind(view)
    }


}