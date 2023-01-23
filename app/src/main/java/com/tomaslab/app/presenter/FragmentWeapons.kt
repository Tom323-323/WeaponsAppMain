package com.tomaslab.app.presenter

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.tomaslab.app.R
import com.tomaslab.app.data.DataRepository.DataRepositoryImp
import com.tomaslab.app.databinding.FragmentSelectTypeWeaponsBinding
import com.tomaslab.app.domain.AdapterFragmentSelectTypeWeapons
import com.tomaslab.app.domain.UseCaseLoadWeapons
import com.tomaslab.app.domain.model.WeaponsModelType

class FragmentWeapons: Fragment(R.layout.fragment_select_type_weapons) {
    private var binding: FragmentSelectTypeWeaponsBinding? = null

    private val dataWeaponsType = mutableListOf<WeaponsModelType>()
    private val dataRepository = DataRepositoryImp()

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

        loadWeapons(id_land = id_land,id_type = id_type)

        //RecyclerView________________________________
        val rv = binding!!.rvTypeWeapons
        rv.layoutManager = LinearLayoutManager(requireContext(),
            LinearLayoutManager.VERTICAL,false)
        rv.setHasFixedSize(true)
        rv.adapter = AdapterFragmentSelectTypeWeapons(dataWeaponsType as ArrayList<WeaponsModelType>,this,id_type,id_land)
        //__________________________________________________

    }

    private fun loadWeapons(id_land: Int, id_type: Int){       //Need fix this fun. Send fun to domain layer!!!!!!!!!!!!!!!!!!!!!!!!!! and data in data layer..

        for(i in 0..5){
            dataWeaponsType.add(
                WeaponsModelType(
                id = "",
                name ="Maschinenpistole MP-40",
                title = i.toString(),
                calibr = id_land.toString(),
                year = "Year: 1938",
                men = "Designer: Hugo Schmeisser",
                image = 77)
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
        dataWeaponsType.clear()
    }

    // Set Title in activity (Headline)
    private fun landManager(id: Pair<Int, String>){
        if(id.second == getString(R.string.land_0)) {binding?.titleLand?.textSize = 22F} // Text size from long land - Great Brit
        binding?.titleLand?.text = id.second // Set title text in Head Line
        binding?.imgLand?.setImageResource(id.first)
    }



}