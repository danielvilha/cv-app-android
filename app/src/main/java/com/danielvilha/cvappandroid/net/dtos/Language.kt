package com.danielvilha.cvappandroid.net.dtos

/**
 * Created by danielvilha on 18/06/20
 */
data class Language(
    val language: String?,
    val item: String?,
    val level: Int?
)

enum class Item {
    Native,
    Fluent,
    Elementary,
    Basic,
    None
}