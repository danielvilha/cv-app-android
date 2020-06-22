package com.danielvilha.cvappandroid.common

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.danielvilha.cvappandroid.R
import com.danielvilha.cvappandroid.net.dtos.TechnicalSkills
import com.danielvilha.cvappandroid.net.stringBullet
import com.danielvilha.cvappandroid.net.stringHyphen

/**
 * Created by danielvilha on 18/06/20
 */
class TechnicalSkillsViewHolder(inflater: LayoutInflater, parent: ViewGroup): RecyclerView.ViewHolder(inflater.inflate(R.layout.item_technical_skills, parent, false)) {
    private var txv_name: TextView? = null
    private var txv_skills: TextView? = null

    init {
        txv_name = itemView.findViewById(R.id.txv_name)
        txv_skills = itemView.findViewById(R.id.txv_skills)
    }

    fun bind(technicalSkills: TechnicalSkills) {
        txv_name?.text = technicalSkills.name

        if (technicalSkills.skills.isNullOrEmpty()) {
            txv_skills?.visibility = View.GONE
        } else {
            txv_skills?.text = stringHyphen(technicalSkills.skills)
        }
    }
}