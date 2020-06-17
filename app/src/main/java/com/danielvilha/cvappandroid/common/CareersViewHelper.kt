package com.danielvilha.cvappandroid.common

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.danielvilha.cvappandroid.R
import com.danielvilha.cvappandroid.net.dtos.CareerHistory
import com.danielvilha.cvappandroid.net.getString
import com.danielvilha.cvappandroid.net.stringSkills
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

    private var txv_technical_skills_text: TextView? = null
    private var txv_key_achievements_text: TextView? = null

    init {
        txv_career_name = itemView.findViewById(R.id.txv_career_name)
        txv_date = itemView.findViewById(R.id.txv_date)
        txv_description = itemView.findViewById(R.id.txv_description)
        txv_description_points = itemView.findViewById(R.id.txv_description_points)
        txv_technical_skills = itemView.findViewById(R.id.txv_technical_skills)
        txv_key_achievements = itemView.findViewById(R.id.txv_key_achievements)

        txv_technical_skills_text = itemView.findViewById(R.id.txv_technical_skills_text)
        txv_key_achievements_text = itemView.findViewById(R.id.txv_key_achievements_text)
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

        if (career.description.isNullOrBlank()) {
            txv_description?.visibility = View.GONE
        } else {
            txv_description?.text = career.description
        }

        if (career.description_points.isNullOrEmpty()) {
            txv_description_points?.visibility = View.GONE
        } else {
            txv_description_points?.text = getString(career.description_points)
        }

        if (career.technical_skills.isNullOrEmpty()) {
            txv_technical_skills_text?.visibility = View.GONE
            txv_technical_skills?.visibility = View.GONE
        } else {
            txv_technical_skills?.text = stringSkills(career.technical_skills)
        }

        if (career.key_achievements.isNullOrEmpty()) {
            txv_key_achievements_text?.visibility = View.GONE
            txv_key_achievements?.visibility = View.GONE
        } else {
            txv_key_achievements?.text = getString(career.key_achievements)
        }
    }
}