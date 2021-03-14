package com.laf.lafh.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.laf.lafh.databinding.FragmentOnboardingScreenBinding
import com.laf.lafh.models.OnboardingModel

class OnboardingScreenFragment(private val model: OnboardingModel) : Fragment() {

    private lateinit var binding: FragmentOnboardingScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOnboardingScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.onboardingButton.text = model.buttonText
        binding.onboardingDescriptionTextView.text = model.descriptionText
    }
}