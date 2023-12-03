package kz.just_code.hilt.data.network

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface MovieApi {
    @GET("current.json")
    suspend fun getMoviesByYear(
        @Query("year") year: Int,
    ): Response<MovieResponse>

    @GET("search.json")
    suspend fun searchMovie(
        @Query("title") title: String,
    ): Response<MovieResponse>
}