package com.jan.jmoviesdb.di

import android.app.Application
import com.jan.jmoviesdb.R
import com.jan.jmoviesdb.databasemanager.AppDatabase
import com.jan.jmoviesdb.databasemanager.provideDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    @Named("movieDBBaseUrl")
    fun movieDBBaseUrlProvider(app: Application) = app.getString(R.string.movies_db_base_url)

    @Provides
    @Singleton
    @Named("movieDBApiKey")
    fun movieDBApiKeyProvider(app: Application) = app.getString(R.string.movies_db_api_key)

    @Provides
    @Singleton
    fun appDatabaseProvider(app: Application) = provideDatabase(app)
}