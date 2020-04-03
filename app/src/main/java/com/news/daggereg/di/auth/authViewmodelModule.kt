package com.news.daggereg.di.auth

import androidx.lifecycle.ViewModel
import com.news.daggereg.di.ViewModelKey
import com.news.daggereg.ui.auth.AuthViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class authViewmodelModule {
    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel::class)
    abstract fun bindAuthViewModel(authViewModel: AuthViewModel) : ViewModel
}