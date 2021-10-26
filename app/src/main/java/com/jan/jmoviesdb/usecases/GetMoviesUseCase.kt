package com.jan.jmoviesdb.usecases

import com.jan.jmoviesdb.data.domain.repository.MovieRepository

class GetMoviesUseCase(private val movieRepository: MovieRepository) {

    fun invoke() = movieRepository.getMovies()
}