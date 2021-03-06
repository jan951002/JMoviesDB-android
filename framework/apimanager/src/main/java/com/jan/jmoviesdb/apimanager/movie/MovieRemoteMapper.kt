package com.jan.jmoviesdb.apimanager.movie

import com.jan.jmoviesdb.apimanager.movie.model.MovieResponse
import com.jan.jmoviesdb.domain.movie.Movie

fun MovieResponse.toMovieDomain(): Movie = Movie(
    id = this.id,
    adult = this.adult,
    genreIds = this.genreIds,
    originalLanguage = this.originalLanguage ?: "",
    originalTitle = this.originalTitle ?: "",
    overview = this.overview ?: "",
    popularity = this.popularity,
    posterPath = this.posterPath ?: "",
    releaseDate = this.releaseDate ?: "",
    title = this.title ?: "",
    video = this.video,
    voteAverage = this.voteAverage,
    voteCount = this.voteCount,
    countOnCart = 0,
    localId = 0L
)