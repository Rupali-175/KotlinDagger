package com.news.daggereg.ui.auth

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.lifecycle.ViewModelProvider
import com.news.daggereg.R
import com.news.daggereg.viewmodel.ViemmodelProviderFactory


import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class AuthActivity : DaggerAppCompatActivity() {

    @Inject
    @JvmField
    var someInt: Int = 0

    @Inject
    @JvmField
    var logo: Drawable? = null

    @Inject
    lateinit var vmProviderfactory: ViemmodelProviderFactory

    lateinit var mAuthViewModel: AuthViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v("demo", "AuthActivity " + someInt)

        var img: ImageView = findViewById(R.id.logo)
        img?.setImageDrawable(logo)


        mAuthViewModel = ViewModelProvider(this, vmProviderfactory).get(AuthViewModel::class.java)
        mAuthViewModel.getString()
    }


}

