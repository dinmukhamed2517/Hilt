package kz.just_code.hilt.data.network

data class MovieResponse(
    val title:String? = null,
    val description:String? = null,
    val year:Int? = null,
    val actors:List<Actor>? = null,
    )



data class Actor(
    val firstName:String? =null,
    val lastName:String? =null,
    val age:Int? = null,
    )


data class MovieApiError(
    val error: MovieApiErrorData? = null
)

data class MovieApiErrorData(
    val code: Int? = null,
    val message: String? = null
)
