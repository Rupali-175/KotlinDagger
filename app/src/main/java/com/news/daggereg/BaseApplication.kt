package com.news.daggereg


import com.news.daggereg.di.DaggerAppComponant
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class BaseApplication : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication>? {
        return DaggerAppComponant.builder().application(this).build()
    }
/*
TODO DaggerAppComponant.builder().application(this).build()
this is generated due to AppComponant class as we have declare it as componant

here we are binding the application to that appcomponant by using BindInstance
 */
}