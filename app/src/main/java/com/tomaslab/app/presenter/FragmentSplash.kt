package com.tomaslab.app.presenter

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tomaslab.app.R
import com.tomaslab.app.databinding.FragmentSplashBinding
import com.earmor.domain.domain.UseCaseLoadSplashScreen
import kotlin.random.Random

class FragmentSplash: Fragment(R.layout.fragment_splash) {

    private var binding:FragmentSplashBinding? = null
    private val useCaseLoadSplashScreen = com.earmor.domain.domain.UseCaseLoadSplashScreen()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSplashBinding.bind(view)
        binding!!.fragmentSplashScreen.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentSplash_to_fragmentMainMenu)
        }
        init()
    }

    private fun init(){ // Set random text in SplashScreen
        binding?.tvContentSplash?.text = useCaseLoadSplashScreen.loadSplashScreen(requireContext())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}