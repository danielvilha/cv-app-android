package com.danielvilha.cvappandroid.common

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.danielvilha.cvappandroid.net.dtos.Language

/**
 * Created by danielvilha on 18/06/20
 */
class LanguagesAdapter(private val list: List<Language>): RecyclerView.Adapter<LanguagesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguagesViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return LanguagesViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: LanguagesViewHolder, position: Int) {
        val language = list[position]
        holder.bind(language)
    }

    override fun getItemCount(): Int = list.size
}