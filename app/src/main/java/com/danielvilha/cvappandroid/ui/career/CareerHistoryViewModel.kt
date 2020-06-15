package com.danielvilha.cvappandroid.ui.career

import android.content.Context
import androidx.lifecycle.ViewModel
import com.danielvilha.cvappandroid.net.dtos.CareerHistory
import com.danielvilha.cvappandroid.net.getJsonDataFromAsset
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class CareerHistoryViewModel(context: Context) : ViewModel() {
    private val jsonFileString = getJsonDataFromAsset(context, "career_history.json")
    private val gson = Gson()
    private val careerHistoryType = object : TypeToken<List<CareerHistory>>() {}.type

    var careerHistoryList: List<CareerHistory> = gson.fromJson(jsonFileString, careerHistoryType)
}