package com.learning.doctorapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Doctor(
    val iD: Int,
    val name: String,
    val address: String,
    val phoneNumber: String
) : Parcelable
