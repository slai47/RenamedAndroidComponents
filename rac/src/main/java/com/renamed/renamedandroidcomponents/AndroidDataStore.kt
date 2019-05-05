package com.renamed.renamedandroidcomponents

import android.app.Application
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.*

open class AndroidDataStore(application: Application) : AndroidViewModel(application)

open class DataStores{

    fun of(frag : Fragment): DataStoreProvider {
        return ViewModelProviders.of(frag) as DataStoreProvider
    }
    fun of(frag : FragmentActivity): DataStoreProvider {
        return ViewModelProviders.of(frag) as DataStoreProvider
    }
    fun of(frag : Fragment, factory : ViewModelProvider.Factory): DataStoreProvider {
        return ViewModelProviders.of(frag, factory) as DataStoreProvider
    }
    fun of(frag : FragmentActivity, factory : ViewModelProvider.Factory): DataStoreProvider {
        return ViewModelProviders.of(frag, factory) as DataStoreProvider
    }
}

open class DataStoreProvider : ViewModelProvider {

    constructor(owner : ViewModelStoreOwner, factory : Factory) : super(owner, factory)

    constructor(store : ViewModelStore, factory : Factory) : super(store, factory)

    fun <T : AndroidDataStore> get(modelClass : Class<T>) : AndroidDataStore {
        return super.get(modelClass)
    }

    fun <T : AndroidDataStore> get(key : String, modelClass : Class<T>) : AndroidDataStore {
        return super.get(key, modelClass)
    }
}