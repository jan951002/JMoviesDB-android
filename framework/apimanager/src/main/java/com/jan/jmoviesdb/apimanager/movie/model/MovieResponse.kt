package com.jan.jmoviesdb.apimanager.movie.model


import com.google.gson.annotations.SerializedName
import com.jan.jmoviesdb.domain.movie.Movie

data class MovieResponse(
    @SerializedName("adult")
    var adult: Boolean,
    @SerializedName("genre_ids")
    var genreIds: List<Int>,
    @SerializedName("id")
    var id: Long,
    @SerializedName("original_language")
    var originalLanguage: String? = "",
    @SerializedName("original_title")
    var originalTitle: String? = "",
    @SerializedName("overview")
    var overview: String? = "",
    @SerializedName("popularity")
    var popularity: Double,
    @SerializedName("poster_path")
    var posterPath: String? = "",
    @SerializedName("release_date")
    var releaseDate: String? = "",
    @SerializedName("title")
    var title: String? = "",
    @SerializedName("video")
    var video: Boolean,
    @SerializedName("vote_average")
    var voteAverage: Double,
    @SerializedName("vote_count")
    var voteCount: Int
)