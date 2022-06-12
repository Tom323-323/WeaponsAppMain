package com.tomaslab.app.presenter

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.tomaslab.app.R
import com.tomaslab.app.databinding.FragmentMainMenuLandBinding

class FragmentMainMenu: Fragment(R.layout.fragment_main_menu_land), View.OnClickListener {

    private  var binding: FragmentMainMenuLandBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainMenuLandBinding.bind(view)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    override fun onClick(p0: View?) {
        when(p0){
            binding?.im1 -> selectLand(1)
            binding?.im2 -> selectLand(2)
            binding?.im3 -> selectLand(3)
            binding?.im4 -> selectLand(4)
            binding?.im5 -> selectLand(5)
            binding?.im6 -> selectLand(6)
            binding?.im7 -> selectLand(7)
            binding?.im8 -> selectLand(8)
        }
    }

    private fun selectLand(id: Int){

    }
}