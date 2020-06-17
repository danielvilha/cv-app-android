package com.danielvilha.cvappandroid.ui.education

import android.content.Context
import androidx.lifecycle.ViewModel
import com.danielvilha.cvappandroid.net.dtos.EducationTrainig
import com.danielvilha.cvappandroid.net.getJsonDataFromAsset
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class EducationTrainingViewModel(context: Context) : ViewModel() {
    private val jsonFileString = getJsonDataFromAsset(context, "education_training.json")
    private val gson = Gson()
    private val educationType = object : TypeToken<List<EducationTrainig>>() {}.type

    var educationList: List<EducationTrainig> = gson.fromJson(jsonFileString, educationType)
}