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

fun stringSkills(list: List<String>?): String? {
    var str = ""
    try {
        if (!list.isNullOrEmpty()) {
            for (item in list) {
                str += if (list.last() == item) {
                    item
                } else {
                    "$item - "
                }
            }
        }
    } catch (e: IOException) {

        return null
    }

    return str
}

fun getString(list: List<String>?): String? {
    var str = ""
    try {
        if (!list.isNullOrEmpty()) {
            for (item in list) {
                str += if (list.last() == item) {
                    "\u2022 $item"
                } else {
                    "\u2022 $item\n"
                }
            }
        }
    } catch (e: IOException) {

        return null
    }

    return str
}