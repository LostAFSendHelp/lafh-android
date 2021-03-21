package com.laf.lafh.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.laf.lafh.databinding.FragmentOnboardingScreenBinding
import com.laf.lafh.models.OnboardingModel
import com.laf.lafh.utils.LafStdLog

class OnboardingScreenFragment : Fragment() {

    private lateinit var binding: FragmentOnboardingScreenBinding
    private lateinit var model: OnboardingModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val descText = arguments?.getString(ARGS_KEY_DESC_TEXT) ?: "Error"
        val buttonText = arguments?.getString(ARGS_KEY_BUTTON_TEXT) ?: "Error"
        model = OnboardingModel(descText, buttonText)

        LafStdLog.debugFuncCalled(this, this::onCreate.name)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        LafStdLog.debugFuncCalled(this, this::onCreateView.name)
        // Inflate the layout for this fragment
        binding = FragmentOnboardingScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.onboardingButton.text = model.buttonText
        binding.onboardingDescriptionTextView.text = model.descriptionText
        LafStdLog.debugFuncCalled(this, this::onViewCreated.name)
    }

    override fun onDestroy() {
        super.onDestroy()
        LafStdLog.debugFuncCalled(this, this::onDestroy.name)
    }

    companion object {
        const val ARGS_KEY_BUTTON_TEXT = "buttonText"
        const val ARGS_KEY_DESC_TEXT = "descriptionText"

        fun newInstance(onboardingModel: OnboardingModel): OnboardingScreenFragment {
            LafStdLog.debugFuncCalled(this, this::newInstance.name)

            val screenFragment = OnboardingScreenFragment()
            val bundle = Bundle()
            bundle.putString(ARGS_KEY_BUTTON_TEXT, onboardingModel.buttonText)
            bundle.putString(ARGS_KEY_DESC_TEXT, onboardingModel.descriptionText)

            screenFragment.arguments = bundle
            return screenFragment
        }
    }
}