package com.renamed.renamedandroidcomponents

import android.app.Application
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders

open class AndroidDataStore(application: Application) : AndroidViewModel(application)

open class DataStores{

    fun of(frag : Fragment): ViewModelProvider {
        return ViewModelProviders.of(frag)
    }
    fun of(frag : FragmentActivity): ViewModelProvider {
        return ViewModelProviders.of(frag)
    }
    fun of(frag : Fragment, factory : ViewModelProvider.Factory): ViewModelProvider {
        return ViewModelProviders.of(frag, factory)
    }
    fun of(frag : FragmentActivity, factory : ViewModelProvider.Factory): ViewModelProvider {
        return ViewModelProviders.of(frag, factory)
    }
}