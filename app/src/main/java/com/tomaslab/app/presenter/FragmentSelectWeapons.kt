package com.tomaslab.app.presenter

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.tomaslab.app.R
import com.tomaslab.app.databinding.FragmentSelectWeaponsLandBinding
import com.tomaslab.app.domain.AdapterFragmentSelectWeapons
import com.tomaslab.app.presenter.model.WeaponsModel

class FragmentSelectWeapons: Fragment(R.layout.fragment_select_weapons_land) {

    private var binding: FragmentSelectWeaponsLandBinding? = null
    val dataWeapons = mutableListOf<WeaponsModel>()

    val title_arr = resources.getStringArray(R.array.land_title)
    val content_arr = resources.getStringArray(R.array.land_content)

    companion object {
        const val ID_LAND = "id_land"
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSelectWeaponsLandBinding.bind(view)


        val id_land = requireArguments().getInt(ID_LAND) // Get argument from FragmentMainMenu
        onDataInit(id_land)
        landManager(id_land)

        // ReccyclerView___________________________________________________
        val rv = binding!!.rvTypeWeapons
        rv.layoutManager = LinearLayoutManager(requireContext())
        rv.setHasFixedSize(true)
        rv.adapter = AdapterFragmentSelectWeapons(dataWeapons as ArrayList<WeaponsModel>) //Need crate ADAPTER!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        //_________________________________________________________________

    }

    private fun landManager(id: Int){

        val img_array_land = arrayListOf<Int>(R.drawable.img_main_gb,R.drawable.img_main_fr,R.drawable.img_main_ger,R.drawable.img_main_usa,R.drawable.img_main_fin,
            R.drawable.img_main_jp,R.drawable.img_main_ussr,R.drawable.img_main_ital)

        val title_array_land = resources.getStringArray(R.array.land_name_title)

        if(id == 0) {
            binding?.titleLand?.textSize = 22F
            binding?.titleLand?.text = title_array_land[id]} // Text size from long land - Great Brit
        else {
            binding?.titleLand?.text = title_array_land[id]} // Set title text in Head Line

        binding?.imgLand?.setImageResource(img_array_land[id]) // Set image in Head Line
    }

    // RecyclerView add data________________________________________________
    private fun onDataInit(id: Int){
        when(id){
            0 ->
            1 ->
            2 ->
            3 ->
            4 ->
            5 ->
            6 ->
            7 ->
        }

    }

    private fun buildData (id: Int){
        dataWeapons.add(WeaponsModel(id = 0, title = title_arr[0], img = 0, content = content_arr[0]))
        dataWeapons.add(WeaponsModel(id = 1, title = title_arr[1], img = 1, content = content_arr[1]))
        dataWeapons.add(WeaponsModel(id = 2, title = title_arr[2], img = 2, content = content_arr[2]))
        dataWeapons.add(WeaponsModel(id = 3, title = title_arr[3], img = 3, content = content_arr[3]))
        dataWeapons.add(WeaponsModel(id = 4, title = title_arr[4], img = 4, content = content_arr[4]))
        dataWeapons.add(WeaponsModel(id = 5, title = title_arr[5], img = 5, content = content_arr[5]))
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}