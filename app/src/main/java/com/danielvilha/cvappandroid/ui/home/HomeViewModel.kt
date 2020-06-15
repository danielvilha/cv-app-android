package com.danielvilha.cvappandroid.ui.home

import android.content.Context
import androidx.lifecycle.ViewModel
import com.danielvilha.cvappandroid.net.dtos.User
import com.danielvilha.cvappandroid.net.getJsonDataFromAsset
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class HomeViewModel(context: Context) : ViewModel() {
    private val jsonFileString = getJsonDataFromAsset(context, "home.json")
    private val gson = Gson()
    private val userType = object : TypeToken<User>() {}.type

    var user: User = gson.fromJson(jsonFileString, userType)
}