package com.example.multimodulenav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.core.FeatureRouteScreenA
import com.example.core.FeatureRouteScreenB
import com.example.multimodulenav.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment : Fragment() {

    @Inject
    lateinit var featureARouteImplementer: FeatureRouteScreenA

    @Inject
    lateinit var featureBRouteImplementer: FeatureRouteScreenB

    lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setClickEvents()
    }

    private fun setClickEvents() = with(binding) {
        btnNavFeatureA.setOnClickListener {
            featureARouteImplementer.showScreen(null, findNavController())
        }
        btnNavFeatureB.setOnClickListener {
            featureBRouteImplementer.showScreen(null, findNavController())
        }


    }
}