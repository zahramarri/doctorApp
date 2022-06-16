package com.learning.doctorapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.learning.doctorapp.databinding.ActivityMainBinding

const val EXTRA_NAME = "doctor"

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Hospital.loadTestData()
        binding.buttonDoctor2.text = Hospital.listOfDoctors[0].name
        binding.buttonDoctor3.text = Hospital.listOfDoctors[1].name
        binding.buttonDoctor4.text = Hospital.listOfDoctors[2].name
        binding.buttonDoctor5.text = Hospital.listOfDoctors[3].name


        binding.buttonDoctor2.setOnClickListener {
            goToActivity2(Hospital.listOfDoctors[0])
        }

        binding.buttonDoctor3.setOnClickListener {
            goToActivity2(Hospital.listOfDoctors[1])
        }

        binding.buttonDoctor4.setOnClickListener {
            goToActivity2(Hospital.listOfDoctors[2])
        }

        binding.buttonDoctor5.setOnClickListener {
            goToActivity2(Hospital.listOfDoctors[3])
        }
    }

    private fun goToActivity2(doctor: Doctor) {
        val intent = Intent(this, Activity2::class.java)
        intent.putExtra(EXTRA_NAME, doctor)
        startActivity(intent)
    }
}