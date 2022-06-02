package com.example.featureb

import com.example.core.FeatureRouteScreenB
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object FeatureBModule {
    @Provides
    fun getFeatureBShowScreen(): FeatureRouteScreenB = FeatureRouteBImplementer()
}