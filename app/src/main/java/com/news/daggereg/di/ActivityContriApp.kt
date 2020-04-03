package com.news.daggereg.di

import com.news.daggereg.MainActivity
import com.news.daggereg.di.auth.authViewmodelModule
import com.news.daggereg.ui.auth.AuthActivity

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class  ActivityContriApp {
    //TODO if we dont decalre it as below Caused by: java.lang.IllegalArgumentException:
    // No injector factory bound for Class<com.news.daggerexample.MainActivity>

    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity?

// so that scope of class will be to the AuthActivity and its sub-component
    @ContributesAndroidInjector(modules = [authViewmodelModule::class])
    internal abstract fun contributeAuthActivity(): AuthActivity


    // TODO I commented it becoz i used other class (named as )AppModule as dependancy which is not abstract
    // TODO and contains the string injection.. just for separation
    /* @Module
     companion object {
         @JvmStatic
         @Provides
         fun someString(): String {
             return "hey from module"
         }

         fun getNumber(): Int = 600
     }*/

}


/*
@Module
public abstract class TestApp {
    @ContributesAndroidInjector
    abstract AuthActivity contributeAuthActivity();

    @Provides
    static String someString() {
        return "hey from module";
    }
}
 */