package com.example.featureb

import androidx.navigation.NavController
import com.example.core.FeatureRouteScreenB
import javax.inject.Inject

class FeatureRouteBImplementer @Inject constructor() : FeatureRouteScreenB {
    override fun showScreen(params: String?, findNavController: NavController) {
        findNavController.navigate(R.id.nav_graph_b)
    }
}