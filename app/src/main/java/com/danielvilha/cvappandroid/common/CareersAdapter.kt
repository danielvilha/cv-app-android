package com.danielvilha.cvappandroid.common

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.danielvilha.cvappandroid.net.dtos.CareerHistory

/**
 * Created by danielvilha on 15/06/20
 */
class CareersAdapter(private val list: List<CareerHistory>): RecyclerView.Adapter<CareersViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CareersViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return CareersViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: CareersViewHolder, position: Int) {
        val career: CareerHistory = list[position]
        holder.bind(career)
    }

    override fun getItemCount(): Int = list.size
}