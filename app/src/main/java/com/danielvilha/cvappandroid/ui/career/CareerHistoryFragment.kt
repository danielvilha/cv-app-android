package com.danielvilha.cvappandroid.ui.career

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.danielvilha.cvappandroid.R
import com.danielvilha.cvappandroid.common.CareersAdapter
import kotlinx.android.synthetic.main.fragment_career_history.*

class CareerHistoryFragment : Fragment() {

    companion object {
        fun newInstance() = CareerHistoryFragment()
    }

    private lateinit var viewModel: CareerHistoryViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_career_history, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = CareerHistoryViewModel(requireContext())

        recycler_career_history.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = CareersAdapter(viewModel.careerHistoryList)
        }
    }
}