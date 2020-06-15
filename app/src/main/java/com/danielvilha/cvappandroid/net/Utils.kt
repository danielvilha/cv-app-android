package com.danielvilha.cvappandroid.net

import android.content.Context
import java.io.IOException

/**
 * Created by danielvilha on 15/06/20
 */
fun getJsonDataFromAsset(context: Context, fileName: String): String? {
    val jsonString: String
    try {
        jsonString = context.assets.open(fileName).bufferedReader().use { it.readText() }
    } catch (ioException: IOException) {
        ioException.printStackTrace()
        return null
    }
    return jsonString
}

fun getKeyAchievements(keyAchievements: List<String>): String? {
    var str: String = ""
    try {
        for (key in keyAchievements) {

        }
    } catch (e: IOException) {

        return null
    }

    return str
}