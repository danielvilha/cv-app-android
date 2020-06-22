package com.danielvilha.cvappandroid.ui.technical

import android.content.Context
import androidx.lifecycle.ViewModel
import com.danielvilha.cvappandroid.net.dtos.Language
import com.danielvilha.cvappandroid.net.dtos.TechnicalSkills
import com.danielvilha.cvappandroid.net.getJsonDataFromAsset
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class TechnicalSkillsViewModel(context: Context) : ViewModel() {
    private val jsonTechnicalFileString = getJsonDataFromAsset(context, "technical_skills.json")
    private val jsonLanguagesFileString = getJsonDataFromAsset(context, "languages.json")
    private val gson = Gson()

    private val technicalSkillsType = object : TypeToken<List<TechnicalSkills>>() {}.type
    private val languagesType = object : TypeToken<List<Language>>() {}.type

    var technicalSkillsList: List<TechnicalSkills> = gson.fromJson(jsonTechnicalFileString, technicalSkillsType)
    var languageList: List<Language> = gson.fromJson(jsonLanguagesFileString, languagesType)
}