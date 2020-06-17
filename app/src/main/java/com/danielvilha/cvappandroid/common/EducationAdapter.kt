package com.danielvilha.cvappandroid.common

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.danielvilha.cvappandroid.net.dtos.EducationTrainig

/**
 * Created by danielvilha on 16/06/20
 */
class EducationAdapter(private val list: List<EducationTrainig>): RecyclerView.Adapter<EducationViewHelper>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EducationViewHelper {
        val inflater = LayoutInflater.from(parent.context)
        return EducationViewHelper(inflater, parent)
    }

    override fun onBindViewHolder(holder: EducationViewHelper, position: Int) {
        val education: EducationTrainig = list[position]
        holder.bind(education)
    }

    override fun getItemCount(): Int = list.size
}