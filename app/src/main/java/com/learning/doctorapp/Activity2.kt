package com.learning.doctorapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.learning.doctorapp.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {
    private lateinit var binding: Activity2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val doctor = intent.getParcelableExtra<Doctor>(EXTRA_NAME) as Doctor

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val doctorInfoFragment = DoctorInfoFragment()
        val bundle = Bundle()
        bundle.putParcelable(EXTRA_NAME, doctor)
        doctorInfoFragment.arguments = bundle
        fragmentTransaction.add(R.id.fragment_container_view, doctorInfoFragment).commit()

    }
}