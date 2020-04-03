package com.news.daggereg.ui.auth

import android.util.Log
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class AuthViewModel public @Inject constructor(
    @Inject
    @JvmField
    var someInt: String
) : ViewModel() {
    init {
        Log.v("demo", "init AuthViewModel " +someInt.toUpperCase())
    }
    fun getString() {
        Log.v("demo", "AuthViewModel " + someInt)
    }
}