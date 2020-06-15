package com.danielvilha.cvappandroid.ui.education

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.danielvilha.cvappandroid.R

class EducationTrainingFragment : Fragment() {

    companion object {
        fun newInstance() = EducationTrainingFragment()
    }

    private lateinit var trainingViewModel: EducationTrainingViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_education_training, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        trainingViewModel = ViewModelProviders.of(this).get(EducationTrainingViewModel::class.java)
    }
}