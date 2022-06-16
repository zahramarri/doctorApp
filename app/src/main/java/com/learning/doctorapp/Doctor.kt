package com.learning.doctorapp

import java.io.Serializable

data class Doctor(val iD: Int,
                  val name: String,
                  val address: String,
                  val phoneNumber: String): Serializable
