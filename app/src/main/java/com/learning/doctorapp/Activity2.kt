package com.learning.doctorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.learning.doctorapp.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {
    lateinit var binding: Activity2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val iD = intent.getIntExtra("doctor's ID", 0)
        for (doctor in Hospital.listOfDoctors) {
            if (doctor.iD == iD) {
                binding.textViewName.text = doctor.name
                binding.textViewAddress.text = doctor.address
                binding.textViewPhoneNumber.text = doctor.phoneNumber
            }
        }
    }
}