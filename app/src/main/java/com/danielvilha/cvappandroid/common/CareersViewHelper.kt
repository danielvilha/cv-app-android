package com.danielvilha.cvappandroid.common

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.danielvilha.cvappandroid.R
import com.danielvilha.cvappandroid.net.dtos.CareerHistory
import java.time.LocalDate
import java.time.format.DateTimeFormatter

/**
 * Created by danielvilha on 15/06/20
 */
class CareersViewHelper(inflater: LayoutInflater, parent: ViewGroup): RecyclerView.ViewHolder(inflater.inflate(R.layout.item_career_history, parent, false)) {
    private var txv_career_name: TextView? = null
    private var txv_date: TextView? = null
    private var txv_description: TextView? = null
    private var txv_description_points: TextView? = null
    private var txv_technical_skills: TextView? = null
    private var txv_key_achievements: TextView? = null

    init {
        txv_career_name = itemView.findViewById(R.id.txv_career_name)
        txv_date = itemView.findViewById(R.id.txv_date)
        txv_description = itemView.findViewById(R.id.txv_description)
        txv_description_points = itemView.findViewById(R.id.txv_description_points)
        txv_technical_skills = itemView.findViewById(R.id.txv_technical_skills)
        txv_key_achievements = itemView.findViewById(R.id.txv_key_achievements)
    }

    fun bind(career: CareerHistory) {
        txv_career_name?.text = String.format(
            "%s, %s (%s, %s)",
            career.role,
            career.company,
            career.address.city,
            career.address.country
        )
        val start = LocalDate.parse(career.date?.start, DateTimeFormatter.ofPattern("yyyy-MM-dd"))
        val end = LocalDate.parse(career.date?.end, DateTimeFormatter.ofPattern("yyyy-MM-dd"))
        txv_date?.text = String.format(
            "%s %s - %s %s",
            start.month.name,
            start.year,
            end.month.name,
            end.year
        )
        txv_description?.text = career.description
        txv_description_points?.text = "description_points"
        txv_technical_skills?.text = "technical_skills"
        txv_key_achievements?.text = "key_achievements"

    }
}