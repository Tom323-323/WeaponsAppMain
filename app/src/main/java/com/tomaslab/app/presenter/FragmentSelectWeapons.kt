package com.tomaslab.app.presenter

import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AccelerateInterpolator
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper
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
        loadWeapons(id_land)

        // ReccyclerView___________________________________________________
        val rv = binding!!.rvTypeWeapons
        rv.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
        rv.setHasFixedSize(true)
        rv.adapter = AdapterFragmentSelectWeapons(dataWeapons as ArrayList<WeaponsModel>,this, id_land)
        //_________________________________________________________________

        // Animation recycler view__________________________________________________________________
        rv.setPadding(110, 0, 110, 0)
        val shapHelper: SnapHelper = LinearSnapHelper()
        shapHelper.attachToRecyclerView(rv)
        Handler().postDelayed({
            val viewHolder: RecyclerView.ViewHolder? = rv.findViewHolderForPosition(0)
            val card = viewHolder?.itemView?.findViewById<CardView>(R.id.constrain_element_viewholder_select_weapons)
            card?.animate()?.setDuration(250)?.scaleX(1f)?.scaleY(1f)
                ?.setInterpolator(AccelerateInterpolator())?.start()
        }, 80)

        rv.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                val v = shapHelper.findSnapView(rv.layoutManager)
                val pos: Int = (rv.layoutManager as LinearLayoutManager).getPosition(v!!)
                val viewHolder: RecyclerView.ViewHolder = rv.findViewHolderForPosition(pos)!!
                val card = viewHolder.itemView.findViewById<CardView>(R.id.constrain_element_viewholder_select_weapons)
                if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                    card.animate().setDuration(250).scaleX(1f).scaleY(1f)
                        .setInterpolator(AccelerateInterpolator()).start()
                } else {
                    card.animate().setDuration(250).scaleX(0.85f).scaleY(0.85f)
                        .setInterpolator(AccelerateInterpolator()).start()
                }
            }

            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
            }
        })
        // Animation recycler view__________________________________________________________________
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

    private fun loadWeapons(id: Int){
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
            for(i in 0..5){dataWeapons.add(WeaponsModel(id = id, title = title_arr[i], img = array[i], content = content_arr[i]))}
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
        dataWeapons.clear()
    }

}