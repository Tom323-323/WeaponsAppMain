package com.tomaslab.app.presenter

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.tomaslab.app.R
import com.tomaslab.app.databinding.FragmentSelectTypeWeaponsBinding
import com.tomaslab.app.domain.AdapterFragmentSelectTypeWeapons
import com.tomaslab.app.presenter.model.WeaponsModel
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

        loadWeapons(id_type)// need fix!!!!!!!!!!!!!!!!

        //RecyclerView________________________________
        val rv = binding!!.rvTypeWeapons
        rv.layoutManager = LinearLayoutManager(requireContext(),
            LinearLayoutManager.HORIZONTAL,false)
        rv.setHasFixedSize(true)
        rv.adapter = AdapterFragmentSelectTypeWeapons(dataWeaponsType as ArrayList<WeaponsModelType>,this)
        //__________________________________________________

    }

    private fun loadWeapons(id: Int){//need fix!!!!!!!!!!!!!
        val img_arr_weapons_0 = arrayListOf<Int>(R.drawable.img_german_pistol,R.drawable.img_pistol_usa,R.drawable.img_ussr_pistol,R.drawable.img_main_usa,R.drawable.img_main_fin,
            R.drawable.img_main_jp)
        val img_arr_weapons_1 = arrayListOf<Int>(R.drawable.img_german_pistol,R.drawable.img_pistol_usa,R.drawable.img_ussr_pistol,R.drawable.img_main_usa,R.drawable.img_main_fin,
            R.drawable.img_main_jp)
        val img_arr_weapons_2 = arrayListOf<Int>(R.drawable.img_german_pistol,R.drawable.img_pistol_usa,R.drawable.img_ussr_pistol,R.drawable.img_main_usa,R.drawable.img_main_fin,
            R.drawable.img_main_jp)
        val img_arr_weapons_3 = arrayListOf<Int>(R.drawable.img_german_pistol,R.drawable.img_pistol_usa,R.drawable.img_ussr_pistol,R.drawable.img_main_usa,R.drawable.img_main_fin,
            R.drawable.img_main_jp)
        val img_arr_weapons_4 = arrayListOf<Int>(R.drawable.img_german_pistol,R.drawable.img_pistol_usa,R.drawable.img_ussr_pistol,R.drawable.img_main_usa,R.drawable.img_main_fin,
            R.drawable.img_main_jp)
        val img_arr_weapons_5 = arrayListOf<Int>(R.drawable.img_german_pistol,R.drawable.img_pistol_usa,R.drawable.img_ussr_pistol,R.drawable.img_main_usa,R.drawable.img_main_fin,
            R.drawable.img_main_jp)
        val img_arr_weapons_6 = arrayListOf<Int>(R.drawable.img_german_pistol,R.drawable.img_pistol_usa,R.drawable.img_ussr_pistol,R.drawable.img_main_usa,R.drawable.img_main_fin,
            R.drawable.img_main_jp)
        val img_arr_weapons_7 = arrayListOf<Int>(R.drawable.img_german_pistol,R.drawable.img_pistol_usa,R.drawable.img_ussr_pistol,R.drawable.img_main_usa,R.drawable.img_main_fin,
            R.drawable.img_main_jp)

        val title_arr = resources.getStringArray(R.array.land_title)
        val content_arr = resources.getStringArray(R.array.land_content)

        var array = arrayListOf<Int>()
        when(id){
            0 ->  array = img_arr_weapons_0
            1 ->  array = img_arr_weapons_1
            2 ->  array = img_arr_weapons_2
            3 ->  array = img_arr_weapons_3
            4 ->  array = img_arr_weapons_4
            5 ->  array = img_arr_weapons_5
            6 ->  array = img_arr_weapons_6
            7 ->  array = img_arr_weapons_7
        }
        for(i in 0..5){dataWeaponsType.add(WeaponsModelType(
            id = id,
            name ="",
            title = "",
            calibr = "",
            year = 9999,
            men = "",
            image = 77))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
        //dataWeapons.clear() /// НЕ ЗАБЫТЬ ОЧИСТИТЬ РЕСАЙКЛ!!!!!!!!!!!!!!!!!!!!!!!!
    }

}