package com.jan.jmoviesdb.usecases

import com.jan.jmoviesdb.data.domain.repository.MovieRepository

class UpdateMovieQuantityOnShoppingCartUseCase(private val movieRepository: MovieRepository) {

    suspend fun invoke(movieLocalId: Long, quantity: Int) {
        movieRepository.updateQuantityOnShoppingCart(movieLocalId, quantity)
    }
}