package com.learning.doctorapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.learning.doctorapp.databinding.FragmentDoctorInfoBinding

class DoctorInfoFragment : Fragment() {

    private lateinit var binding: FragmentDoctorInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDoctorInfoBinding.inflate(inflater, container, false)
        binding.buttonFragmentTest.setOnClickListener {
            Toast.makeText(activity, "clicked", Toast.LENGTH_SHORT).show()
        }
        return binding.root
    }
}