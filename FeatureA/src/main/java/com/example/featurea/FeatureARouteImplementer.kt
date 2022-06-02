package com.example.featurea

import androidx.core.os.bundleOf
import androidx.navigation.NavController
import com.example.core.FeatureRouteScreenA
import javax.inject.Inject


class FeatureARouteImplementer @Inject constructor() : FeatureRouteScreenA {
    override fun showScreen(params: String?, navController: NavController) {
        navController.navigate(R.id.nav_graph_a, bundleOf("argAValue" to params))
    }
}