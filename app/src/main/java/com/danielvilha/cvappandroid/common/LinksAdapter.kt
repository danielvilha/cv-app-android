package com.danielvilha.cvappandroid.common

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.danielvilha.cvappandroid.net.dtos.Link

/**
 * Created by danielvilha on 15/06/20
 */
class LinksAdapter(private val list: List<Link>): RecyclerView.Adapter<LinksViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LinksViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return LinksViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: LinksViewHolder, position: Int) {
        val link: Link = list[position]
        holder.bind(link)
    }

    override fun getItemCount(): Int = list.size
}