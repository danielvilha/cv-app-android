package com.danielvilha.cvappandroid.ui.technical

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.danielvilha.cvappandroid.R
import com.danielvilha.cvappandroid.common.LanguagesAdapter
import com.danielvilha.cvappandroid.common.TechnicalSkillsAdapter
import kotlinx.android.synthetic.main.fragment_technical_skills.*

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

        recycler_tecnical.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = TechnicalSkillsAdapter(viewModel.technicalSkillsList)
        }

        recycler_languages.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = LanguagesAdapter(viewModel.languageList)
        }
    }
}