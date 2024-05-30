package com.example.listviewclickparcelize

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Person(
    val id: Int,
    val section: Int,
    val name: String,
    val image: String
): Parcelable