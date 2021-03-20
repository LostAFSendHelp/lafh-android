package com.laf.lafh.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.laf.lafh.databinding.FragmentOnboardingScreenBinding
import com.laf.lafh.models.OnboardingModel

class OnboardingScreenFragment() : Fragment() {

    private lateinit var binding: FragmentOnboardingScreenBinding
    private lateinit var model: OnboardingModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val descText = arguments?.getString(ARGS_KEY_DESC_TEXT) ?: "Error"
        val buttonText = arguments?.getString(ARGS_KEY_BUTTON_TEXT) ?: "Error"
        model = OnboardingModel(descText, buttonText)
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

    companion object {
        const val ARGS_KEY_BUTTON_TEXT = "buttonText"
        const val ARGS_KEY_DESC_TEXT = "descriptionText"

        fun createInstance(onboardingModel: OnboardingModel): OnboardingScreenFragment {
            val screenFragment = OnboardingScreenFragment()
            val bundle = Bundle()
            bundle.putString(ARGS_KEY_BUTTON_TEXT, onboardingModel.buttonText)
            bundle.putString(ARGS_KEY_DESC_TEXT, onboardingModel.descriptionText)

            screenFragment.arguments = bundle
            return screenFragment
        }
    }
}