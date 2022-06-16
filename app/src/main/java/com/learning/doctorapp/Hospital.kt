package com.learning.doctorapp

object Hospital {
    val listOfDoctors: MutableList<Doctor> = mutableListOf()

    fun loadTestData() {
        listOfDoctors.clear()

        val doctor1 = Doctor(
            10001,
            "محمد اکبری",
            "ایران، تهران",
            "+۹۸۹۱۲۱۲۳۱۲۳۱"
        )

        val doctor2 = Doctor(
            10002,
            "صادق اصغری",
            "ایران، مشهد",
            "+۹۸۹۱۲۱۲۳۱۲۳۲"
        )

        val doctor3 = Doctor(
            10003,
            "امین شجاعی",
            "ایران، تبریز",
            "+۹۸۹۱۲۱۲۳۱۲۳۳"
        )

        val doctor4 = Doctor(
            10004,
            "مریم غیاثی",
            "ایران، قزوین",
            "+۹۸۹۱۲۱۲۳۱۲۳۴"
        )

        listOfDoctors.add(doctor1)
        listOfDoctors.add(doctor2)
        listOfDoctors.add(doctor3)
        listOfDoctors.add(doctor4)
    }

    fun addDoctor(doctor: Doctor) {
        listOfDoctors.add(doctor)
    }

    fun getDoctor(iD: Int): Doctor? {
        var theDoctor: Doctor? = null
        for (doctor in listOfDoctors) {
            if (doctor.iD == iD) {
                theDoctor = doctor
            }
        }
        return theDoctor
    }
}