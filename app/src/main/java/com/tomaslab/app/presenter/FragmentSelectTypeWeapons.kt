package com.tomaslab.app.presenter

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.tomaslab.app.R
import com.tomaslab.app.databinding.FragmentSelectTypeWeaponsBinding

class FragmentSelectTypeWeapons: Fragment(R.layout.fragment_select_type_weapons) {

    private var binding: FragmentSelectTypeWeaponsBinding? = null

    companion object {
        const val ID_TYPE = "id_type"
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSelectTypeWeaponsBinding.bind(view)

        val id_type = requireArguments().getInt(FragmentSelectTypeWeapons.ID_TYPE) // Get argument from FragmentSelectWeapons
        Toast.makeText(requireContext(), "id_type - ${id_type}",Toast.LENGTH_LONG).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
        //dataWeapons.clear() /// НЕ ЗАБЫТЬ ОЧИСТИТЬ РЕСАЙКЛ!!!!!!!!!!!!!!!!!!!!!!!!
    }

}