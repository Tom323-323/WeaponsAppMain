package com.tomaslab.app.presenter

import android.os.Bundle
import android.util.Log
import android.view.View
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
        const val ID_LAND = "id_land"
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSelectTypeWeaponsBinding.bind(view)

        val id_type = requireArguments().getInt(ID_TYPE) // Get argument from FragmentSelectWeapons
        val id_land = requireArguments().getInt(ID_LAND)
        Log.e("AAA","Select type: $id_land")
        landManager(id_land)

        loadWeapons(id_type.toString())// need fix!!!!!!!!!!!!!!!!

        //RecyclerView________________________________
        val rv = binding!!.rvTypeWeapons
        rv.layoutManager = LinearLayoutManager(requireContext(),
            LinearLayoutManager.VERTICAL,false)
        rv.setHasFixedSize(true)
        rv.adapter = AdapterFragmentSelectTypeWeapons(dataWeaponsType as ArrayList<WeaponsModelType>,this)
        //__________________________________________________



    }

    private fun loadWeapons(id: String){//need fix!!!!!!!!!!!!!

        for(i in 0..5){dataWeaponsType.add(WeaponsModelType(
            id = "id",
            name ="Maschinenpistole MP-40",
            title = "Maschinenpistole MP-40",
            calibr = "Calibr: 9 mm",
            year = "Year: 1938",
            men = "Development: Hugo Schmeisser",
            image = 77))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
        dataWeaponsType.clear()
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



}