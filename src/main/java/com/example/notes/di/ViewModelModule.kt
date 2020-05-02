package com.example.notes.di

import androidx.lifecycle.ViewModel
import com.example.notes.ui.NoteViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(NoteViewModel::class)
    abstract fun bindMainViewModel(notesViewModel: NoteViewModel): ViewModel
}
