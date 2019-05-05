package com.renamed.renamedandroidcomponents

import android.app.Application
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.*

open class AndroidDataBinder(application: Application) : AndroidViewModel(application)

open class DataBinders{

    fun of(frag : Fragment): DataBinderProvider {
        return ViewModelProviders.of(frag) as DataBinderProvider
    }
    fun of(frag : FragmentActivity): DataBinderProvider {
        return ViewModelProviders.of(frag) as DataBinderProvider
    }
    fun of(frag : Fragment, factory : ViewModelProvider.Factory): DataBinderProvider {
        return ViewModelProviders.of(frag, factory) as DataBinderProvider
    }
    fun of(frag : FragmentActivity, factory : ViewModelProvider.Factory): DataBinderProvider {
        return ViewModelProviders.of(frag, factory) as DataBinderProvider
    }
}

open class DataBinderProvider : ViewModelProvider {

    constructor(owner : ViewModelStoreOwner, factory : Factory) : super(owner, factory)

    constructor(store : ViewModelStore, factory : Factory) : super(store, factory)

    fun <T : AndroidDataBinder> get(modelClass : Class<T>) : AndroidDataBinder {
        return super.get(modelClass)
    }

    fun <T : AndroidDataBinder> get(key : String, modelClass : Class<T>) : AndroidDataBinder {
        return super.get(key, modelClass)
    }
}