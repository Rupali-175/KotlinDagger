package com.news.daggereg.di

import androidx.lifecycle.ViewModelProvider
import com.news.daggereg.viewmodel.ViemmodelProviderFactory
import dagger.Binds
import dagger.Module

@Module
abstract class VmProviderFactoryModule {
    @Binds
    abstract fun bindVMProviderfactory(factoryModel: ViemmodelProviderFactory): ViewModelProvider.Factory
}