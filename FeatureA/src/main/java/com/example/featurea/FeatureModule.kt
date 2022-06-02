package com.example.featurea

import com.example.core.FeatureRouteScreenA
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object FeatureModule {
    @Singleton
    @Provides
    fun provideFeatureShowScreen(): FeatureRouteScreenA = FeatureARouteImplementer()
}