package kz.just_code.hilt

import dagger.hilt.android.lifecycle.HiltViewModel
import kz.just_code.hilt.base.BaseViewModel
import kz.just_code.hilt.data.useCases.GetMovieByYearUseCase
import kz.just_code.hilt.data.useCases.SearchMovieUseCase
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    private val getMovieByYear: GetMovieByYearUseCase,
    private val searchMovie: SearchMovieUseCase
): BaseViewModel() {


    fun getMovieByYear(year:Int){
        launch(
            request = {
                getMovieByYear.execute(year)
            },
            onSuccess = {

            }
        )
    }
}