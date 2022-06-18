package com.tomaslab.app.domain

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.tomaslab.app.R
import com.tomaslab.app.presenter.FragmentSelectTypeWeapons
import com.tomaslab.app.presenter.model.WeaponsModel

class AdapterFragmentSelectWeapons(private val dataWeapons: ArrayList<WeaponsModel>, val parentFragment: Fragment) : RecyclerView.Adapter<AdapterFragmentSelectWeapons.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AdapterFragmentSelectWeapons.ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_holder_fragment_select_weapons, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataWeapons[position], position)
    }

    override fun getItemCount(): Int {
        return dataWeapons.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(dataWeapons: WeaponsModel, index: Int) {
            val image = itemView.findViewById<ImageView>(R.id.img_viewHolder)
            val title = itemView.findViewById<TextView>(R.id.tv_title_holder)
            val content = itemView.findViewById<TextView>(R.id.tv_opisanie_holder)
            val btn_more = itemView.findViewById<Button>(R.id.btn_viewHolder)

            image.setImageResource(dataWeapons.img) // Set Image, title and text in Holder
            title.text = dataWeapons.title
            content.text = dataWeapons.content

            btn_more.setOnClickListener {
                onClick(index)
            }
        }
    }

    private fun onClick(index: Int) {
        // Need take send index to next Fragment
        val navCon = parentFragment.findNavController()
        navCon.navigate(R.id.action_fragmentSelectWeapons_to_fragmentSelectTypeWeapons,
            bundleOf(FragmentSelectTypeWeapons.ID_TYPE to index)
        )
    }

}




