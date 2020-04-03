package com.news.daggereg.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

/**
 * This class returns the provider of VM Create method accepts the viemodel class object as i/p and
 * returns its corrosponding provider
 */

class ViemmodelProviderFactory @Inject constructor(
    private val creators: Map<Class<out ViewModel>,
            @JvmSuppressWildcards Provider<ViewModel>>
) : ViewModelProvider.Factory {

    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        /*val creator = creators[modelClass as Class<ViewModel>]
            ?: creators.entries.firstOrNull { (c, _) -> modelClass.isAssignableFrom(c) }?.value
            ?: throw IllegalArgumentException("Unknown model class $modelClass")

        return creator.get() as T*/

        var mCreator = creators[modelClass]
        if (mCreator == null) {
            for ((key, value) in creators) {
                if (modelClass.isAssignableFrom(key)) {
                    mCreator = value
                    break
                }
            }
        }
        try {
            return (mCreator?.get() as T)
        } catch (e: Exception) {
            throw RuntimeException()

        }
    }
}
