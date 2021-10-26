package com.jan.jmoviesdb.usecases

import com.jan.jmoviesdb.data.domain.repository.MovieRepository

class CheckRequireMoviesNewPageUseCase(private val movieRepository: MovieRepository) {

    suspend fun invoke(lastVisible: Int) {
        movieRepository.checkRequireNewPage(lastVisible)
    }
}