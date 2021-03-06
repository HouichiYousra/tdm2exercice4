package com.example.notes.di

import com.example.notes.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector



@Module
abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(modules = [ViewModelModule::class,FragmentBuildersModule::class])
    abstract fun contributeMainActivity(): MainActivity

}