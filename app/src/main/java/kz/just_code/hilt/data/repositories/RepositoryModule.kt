package kz.just_code.hilt.data.repositories

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kz.just_code.hilt.data.network.MovieApi
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object RepositoryModule {

    @Singleton
    @Provides
    fun provideWeatherRepository(api: MovieApi): MovieRepository = MovieRepositoryImpl(api)
}