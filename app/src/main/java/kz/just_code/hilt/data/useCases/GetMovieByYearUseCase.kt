package kz.just_code.hilt.data.useCases

import kz.just_code.hilt.data.network.MovieResponse
import kz.just_code.hilt.data.repositories.MovieRepository

interface GetMovieByYearUseCase {
    suspend fun execute(year:Int):MovieResponse?
}

class GetMovieByYearInteraction(
    private val repo: MovieRepository
) : GetMovieByYearUseCase {
    override suspend fun execute(year: Int): MovieResponse? {
        return repo.getMovieByYear(year)
    }
}


interface SearchMovieUseCase {
    suspend fun execute(name:String):MovieResponse?
}

class SearchMovieInteraction(
    private val repo: MovieRepository
) : SearchMovieUseCase {
    override suspend fun execute(name: String): MovieResponse? {
        return repo.searchMovie(name)
    }
}




