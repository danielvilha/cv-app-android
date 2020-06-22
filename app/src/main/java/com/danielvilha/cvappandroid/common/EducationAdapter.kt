package com.danielvilha.cvappandroid.common

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.danielvilha.cvappandroid.net.dtos.EducationTraining

/**
 * Created by danielvilha on 16/06/20
 */
class EducationAdapter(private val list: List<EducationTraining>): RecyclerView.Adapter<EducationViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EducationViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return EducationViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: EducationViewHolder, position: Int) {
        val education: EducationTraining = list[position]
        holder.bind(education)
    }

    override fun getItemCount(): Int = list.size
}