package com.danielvilha.cvappandroid.common

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.danielvilha.cvappandroid.net.dtos.TechnicalSkills

/**
 * Created by danielvilha on 18/06/20
 */
class TechnicalSkillsAdapter(private val list: List<TechnicalSkills>): RecyclerView.Adapter<TechnicalSkillsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TechnicalSkillsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return TechnicalSkillsViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: TechnicalSkillsViewHolder, position: Int) {
        val technical = list[position]
        holder.bind(technical)
    }

    override fun getItemCount(): Int = list.size
}