package com.learning.doctorapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.learning.doctorapp.databinding.FragmentDoctorInfoBinding

class DoctorInfoFragment : Fragment() {

    private lateinit var binding: FragmentDoctorInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDoctorInfoBinding.inflate(inflater, container, false)
        return binding.root
    }
}