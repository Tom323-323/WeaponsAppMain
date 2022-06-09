package com.tomaslab.app.presenter

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.tomaslab.app.R
import com.tomaslab.app.databinding.FragmentMainMenuLandBinding

class FragmentMainMenu: Fragment(R.layout.fragment_main_menu_land) {

    private lateinit var binding: FragmentMainMenuLandBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainMenuLandBinding.bind(view)




    }
}