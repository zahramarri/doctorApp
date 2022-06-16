package com.learning.doctorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.learning.doctorapp.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {
    private lateinit var binding: Activity2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val doctor = intent.getParcelableExtra<Doctor>(EXTRA_NAME) as Doctor
        binding.textViewName.text = doctor.name
        binding.textViewAddress.text = doctor.address
        binding.textViewPhoneNumber.text = doctor.phoneNumber

    }
}