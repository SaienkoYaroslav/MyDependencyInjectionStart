package com.example.dependencyinjectionstart.example2.di

import android.content.Context
import com.example.dependencyinjectionstart.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface ApplicationComponentBuilder {

        @BindsInstance
        fun timeMillis(timeMillis: Long) : ApplicationComponentBuilder

        @BindsInstance
        fun context(context: Context) : ApplicationComponentBuilder

        fun build() : ApplicationComponent
    }

}