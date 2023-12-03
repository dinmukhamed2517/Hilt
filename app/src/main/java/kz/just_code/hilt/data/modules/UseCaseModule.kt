package kz.just_code.hilt.data.modules

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kz.just_code.hilt.data.repositories.MovieRepository
import kz.just_code.hilt.data.useCases.GetMovieByYearInteraction
import kz.just_code.hilt.data.useCases.GetMovieByYearUseCase
import kz.just_code.hilt.data.useCases.SearchMovieInteraction
import kz.just_code.hilt.data.useCases.SearchMovieUseCase


@InstallIn(SingletonComponent::class)
@Module
object UseCaseModule {
    @Provides
    fun provideSearchMovieUseCase(repo:MovieRepository):SearchMovieUseCase =
        SearchMovieInteraction(repo)
    @Provides
    fun provideGetMovieByYearUseCase(repo:MovieRepository):GetMovieByYearUseCase =
        GetMovieByYearInteraction(repo)

}