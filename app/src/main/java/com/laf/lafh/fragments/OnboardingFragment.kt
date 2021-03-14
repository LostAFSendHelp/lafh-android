package com.laf.lafh.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.laf.lafh.adapters.OnboardingAdapter
import com.laf.lafh.databinding.FragmentOnboardingBinding
import com.laf.lafh.models.OnboardingModel
import com.laf.lafh.repo.OnboardingRepository

class OnboardingFragment() : Fragment() {

    private lateinit var binding: FragmentOnboardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentOnboardingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.onboardingViewPager.adapter = OnboardingAdapter(activity as AppCompatActivity, OnboardingRepository(requireContext()).onboardingModels)
    }
}