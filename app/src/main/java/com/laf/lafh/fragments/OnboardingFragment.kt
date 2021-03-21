package com.laf.lafh.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.laf.lafh.adapters.OnboardingAdapter
import com.laf.lafh.databinding.FragmentOnboardingBinding
import com.laf.lafh.repo.OnboardingRepository
import com.laf.lafh.repo.OnboardingRepositoryExpected
import com.laf.lafh.utils.LafStdLog
import com.laf.lafh.viewModels.OnboardingFragmentViewModel

class OnboardingFragment : Fragment() {

    private lateinit var binding: FragmentOnboardingBinding
    private lateinit var vm: OnboardingFragmentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LafStdLog.debugFuncCalled(this, this::onCreate.name)

        setupViewModel()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        LafStdLog.debugFuncCalled(this, this::onCreateView.name)
        binding = FragmentOnboardingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        LafStdLog.debugFuncCalled(this, this::onViewCreated.name)
    }

    override fun onDestroy() {
        super.onDestroy()
        LafStdLog.debugFuncCalled(this, this::onDestroy.name)
    }

    private fun setupViewModel() {
        LafStdLog.debugFuncCalled(this, this::setupViewModel.name)

        vm = ViewModelProvider(this, OnboardingFragmentViewModel.Factory(OnboardingRepository(requireContext()))).get(OnboardingFragmentViewModel::class.java)

        vm.getData().observe(this, { models ->
            val adapter = OnboardingAdapter(activity as AppCompatActivity, models)
            binding.onboardingViewPager.adapter = adapter
        })

        vm.fetchAllModels()
    }

    companion object {
        fun newInstance(repo: OnboardingRepositoryExpected): OnboardingFragment {
            return OnboardingFragment()
        }
    }
}