package com.tomaslab.app.presenter

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.tomaslab.app.R
import com.tomaslab.app.databinding.FragmentSelectWeaponsLandBinding
import com.tomaslab.app.domain.AdapterFragmentSelectWeapons
import com.tomaslab.app.presenter.model.WeaponsModel

class FragmentSelectWeapons: Fragment(R.layout.fragment_select_weapons_land) {

    private var binding: FragmentSelectWeaponsLandBinding? = null
    val dataWeapons = mutableListOf<WeaponsModel>()

    companion object {
        const val ID_LAND = "id_land"
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSelectWeaponsLandBinding.bind(view)



        val id_land = requireArguments().getInt(ID_LAND) // Get argument from FragmentMainMenu

        landManager(id_land) // Load headline and content.

        // ReccyclerView___________________________________________________
        val rv = binding!!.rvTypeWeapons
        rv.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
        rv.setHasFixedSize(true)
        rv.adapter = AdapterFragmentSelectWeapons(dataWeapons as ArrayList<WeaponsModel>) //Need crate ADAPTER!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        //_________________________________________________________________

    }

    private fun landManager(id: Int){

        val title_arr = resources.getStringArray(R.array.land_title)
        val content_arr = resources.getStringArray(R.array.land_content)
        val img_arr = arrayListOf<Int>(R.drawable.img_main_gb,R.drawable.img_main_fr,R.drawable.img_main_ger,R.drawable.img_main_usa,R.drawable.img_main_fin,
            R.drawable.img_main_jp)// Here need add picture with weapons -- rifle, pistols....

        val img_array_land = arrayListOf<Int>(R.drawable.img_main_gb,R.drawable.img_main_fr,R.drawable.img_main_ger,R.drawable.img_main_usa,R.drawable.img_main_fin,
            R.drawable.img_main_jp,R.drawable.img_main_ussr,R.drawable.img_main_ital)

        val title_array_land = resources.getStringArray(R.array.land_name_title)

        if(id == 0) {
            binding?.titleLand?.textSize = 22F
            binding?.titleLand?.text = title_array_land[id]} // Text size from long land - Great Brit
        else {
            binding?.titleLand?.text = title_array_land[id]} // Set title text in Head Line

        binding?.imgLand?.setImageResource(img_array_land[id]) // Set image in Head Line

        for(i in 0..5){
            dataWeapons.add(WeaponsModel(id = id, title = title_arr[i], img = img_arr[i], content = content_arr[i])) // RecyclerView data
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}