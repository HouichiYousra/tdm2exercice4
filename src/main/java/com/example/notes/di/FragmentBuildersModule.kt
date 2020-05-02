package com.example.notes.di


import com.example.notes.ui.AddFragment
import com.example.notes.ui.EditFragment
import com.example.notes.ui.ListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector



@Module
abstract class FragmentBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeListFragment(): ListFragment

    // Method #2
    @ContributesAndroidInjector
    abstract fun contributeAddFragment(): AddFragment

    // Method #3
    @ContributesAndroidInjector
    abstract fun contributeEditFragment(): EditFragment
}