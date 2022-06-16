package com.learning.doctorapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.learning.doctorapp.databinding.ActivityMainBinding

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


        binding.buttonDoctor1.setOnClickListener(::goToActivity2)
    }

    private fun goToActivity2(view: View) {
        val intent = Intent(this, Activity2::class.java)
        startActivity(intent)
    }
}