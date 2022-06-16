package com.learning.doctorapp

object Hospital {
    private val listOfDoctors: MutableList<Doctor> = mutableListOf()

    fun loadTestData() {
        listOfDoctors.clear()

        val doctor1 = Doctor(10001,
            "محمد اکبری",
            "Iran, Tehran",
            989121231231)

        val doctor2 = Doctor(10002,
            "صادق اصغری",
            "Iran, Mashhad",
            989121231232)

        val doctor3 = Doctor(10003,
            "امین شجاعی",
            "Iran, Tabriz",
            989121231233)

        listOfDoctors.add(doctor1)
        listOfDoctors.add(doctor2)
        listOfDoctors.add(doctor3)
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