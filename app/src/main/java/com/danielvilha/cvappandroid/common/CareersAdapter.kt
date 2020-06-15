package com.danielvilha.cvappandroid.common

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.danielvilha.cvappandroid.net.dtos.CareerHistory

/**
 * Created by danielvilha on 15/06/20
 */
class CareersAdapter(private val list: List<CareerHistory>): RecyclerView.Adapter<CareersViewHelper>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CareersViewHelper {
        val inflater = LayoutInflater.from(parent.context)
        return CareersViewHelper(inflater, parent)
    }

    override fun onBindViewHolder(holder: CareersViewHelper, position: Int) {
        val career: CareerHistory = list[position]
        holder.bind(career)
    }

    override fun getItemCount(): Int = list.size
}