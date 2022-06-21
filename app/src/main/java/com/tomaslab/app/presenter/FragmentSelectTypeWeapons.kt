package com.tomaslab.app.presenter

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.tomaslab.app.R
import com.tomaslab.app.databinding.FragmentSelectTypeWeaponsBinding
import com.tomaslab.app.domain.AdapterFragmentSelectTypeWeapons
import com.tomaslab.app.presenter.model.WeaponsModelType

class FragmentSelectTypeWeapons: Fragment(R.layout.fragment_select_type_weapons) {

    private var binding: FragmentSelectTypeWeaponsBinding? = null

    val dataWeaponsType = mutableListOf<WeaponsModelType>()

    companion object {
        const val ID_TYPE = "id_type"
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSelectTypeWeaponsBinding.bind(view)

        val id_type = requireArguments().getInt(ID_TYPE) // Get argument from FragmentSelectWeapons
        Toast.makeText(requireContext(), "id_type - ${id_type}",Toast.LENGTH_LONG).show()// TEST

        //RecyclerView________________________________
        val rv = binding!!.rvTypeWeapons
        rv.layoutManager = LinearLayoutManager(requireContext(),
            LinearLayoutManager.HORIZONTAL,false)
        rv.setHasFixedSize(true)
        rv.adapter = AdapterFragmentSelectTypeWeapons(dataWeaponsType as ArrayList<WeaponsModelType>,this)
        //__________________________________________________

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
        //dataWeapons.clear() /// НЕ ЗАБЫТЬ ОЧИСТИТЬ РЕСАЙКЛ!!!!!!!!!!!!!!!!!!!!!!!!
    }

}