package kz.just_code.hilt.data.modules

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kz.just_code.hilt.data.network.MovieApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Qualifier


@InstallIn(SingletonComponent::class)
@Module
object NetworkModule {

    @MovieUrl
    private const val movieUrl = "https://api.movieapi.com/"
    @OtherUrl
    private const val someOtherUrl = "https://api.movieapi.com/"


    fun getMovieRetrofit(@MovieUrl url:String): Retrofit {
        return Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }


    fun getOtherRetrofit(@OtherUrl url:String): Retrofit {
        return Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }


    @Provides
    fun provideMovieApi(@MovieUrl retrofit: Retrofit): MovieApi {
        return retrofit.create(MovieApi::class.java)
    }

}



@Qualifier
annotation class MovieUrl

@Qualifier
annotation class OtherUrl