package com.tomaslab.app.presenter

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tomaslab.app.R
import com.tomaslab.app.databinding.FragmentSplashBinding

class FragmentSplash: Fragment(R.layout.fragment_splash) {

    private lateinit var binding:FragmentSplashBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSplashBinding.bind(view)

        binding.fragmentSplashScreen.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentSplash_to_fragmentMainMenu)
        }

    }




}