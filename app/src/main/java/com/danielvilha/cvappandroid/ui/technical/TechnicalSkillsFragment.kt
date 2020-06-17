package com.danielvilha.cvappandroid.ui.technical

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.danielvilha.cvappandroid.R

class TechnicalSkillsFragment : Fragment() {

    companion object {
        fun newInstance() = TechnicalSkillsFragment()
    }

    private lateinit var viewModel: TechnicalSkillsViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_technical_skills, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = TechnicalSkillsViewModel(requireContext())
    }
}