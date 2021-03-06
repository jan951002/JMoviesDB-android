package com.jan.jmoviesdb.apimanager.movie.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.jan.jmoviesdb.apimanager.movie.model.MovieResponse

data class MoviesPopularResponse(
    @SerializedName("results")
    @Expose
    var results: List<MovieResponse>,

    @SerializedName("page")
    @Expose
    var page: Int,

    @SerializedName("total_pages")
    @Expose
    var totalPages: Int,

    @SerializedName("total_results")
    @Expose
    var totalResults: Int
)