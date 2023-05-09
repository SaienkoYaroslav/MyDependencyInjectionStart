package com.example.dependencyinjectionstart.example2.di

import com.example.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSource
import com.example.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSourceImpl
import com.example.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSource
import com.example.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSourceImpl
import com.example.dependencyinjectionstart.example2.data.datasource.ExampleTestRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindExampleLocalDataSource(impl: ExampleLocalDataSourceImpl) : ExampleLocalDataSource

    @ApplicationScope
    @Binds
    @WorkRemoteDataQualifier
    fun bindExampleRemoteDataSource(impl: ExampleRemoteDataSourceImpl) : ExampleRemoteDataSource

    @ApplicationScope
    @Binds
    @TestRemoteDataQualifier
    fun bindExampleTestRemoteDataSource(impl: ExampleTestRemoteDataSourceImpl) : ExampleRemoteDataSource

}