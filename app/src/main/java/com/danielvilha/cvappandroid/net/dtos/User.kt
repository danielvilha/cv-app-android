package com.danielvilha.cvappandroid.net.dtos

/**
 * Created by danielvilha on 12/06/20
 */
data class User(
    val address: Address?,
    val email: String?,
    val name: String?,
    val job_title: String?,
    val permission: String?,
    val phone: String?,
    val profile: String?,
    val links: List<Link>,
    val image: String?
)

data class Address(
    val city: String?,
    val country: String?,
    val street: String?
)

data class Link(
    val name: String?,
    val link: String?
)