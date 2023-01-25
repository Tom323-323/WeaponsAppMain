package com.tomaslab.app.presenter

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.tomaslab.app.R
import com.tomaslab.app.data.DataRepository.DataRepositoryImp
import com.tomaslab.app.data.storage.CollectionsDataStorage
import com.tomaslab.app.databinding.FragmentSelectTypeWeaponsBinding
import com.tomaslab.app.domain.AdapterFragmentSelectTypeWeapons
import com.tomaslab.app.domain.UseCaseLoadTypeWeapons
import com.tomaslab.app.domain.UseCaseLoadWeapons
import com.tomaslab.app.domain.model.WeaponsModelType


class FragmentWeapons: Fragment(R.layout.fragment_select_type_weapons) {
    private var binding: FragmentSelectTypeWeaponsBinding? = null

    private val dataRepository = DataRepositoryImp(dataStorage = CollectionsDataStorage())
    companion object {
        const val ID_TYPE = "id_type"
        const val ID_LAND = "id_land"
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSelectTypeWeaponsBinding.bind(view)

        val id_type = requireArguments().getInt(ID_TYPE) // Get argument from FragmentSelectWeapons
        val id_land = requireArguments().getInt(ID_LAND)

        landManager(UseCaseLoadWeapons(dataRepository = dataRepository).loadLand(id_land,requireContext()))

        val dataWeaponsType = UseCaseLoadTypeWeapons(dataRepository = dataRepository).loadTypeWeapons(id_land = id_land, id_type = id_type)

        //RecyclerView________________________________
        val rv = binding!!.rvTypeWeapons
        rv.layoutManager = LinearLayoutManager(requireContext(),
            LinearLayoutManager.VERTICAL,false)
        rv.setHasFixedSize(true)
        rv.adapter = AdapterFragmentSelectTypeWeapons(dataWeaponsType as ArrayList<WeaponsModelType>,this,id_type,id_land)
        //__________________________________________________

    }

    // Set Title and ImageLand in fragment (Headline)
    private fun landManager(id: Pair<Int, String>){
        if(id.second == getString(R.string.land_0)) {binding?.titleLand?.textSize = 22F} // Text size from long land - Great Brit
        binding?.titleLand?.text = id.second // Set title text in Head Line
        binding?.imgLand?.setImageResource(id.first)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
        //dataWeaponsType.clear()
    }

}