package com.app.upcomingmovies.network

import com.app.upcomingmovies.response.Movie
import com.app.upcomingmovies.response.MovieImagesResponse
import com.app.upcomingmovies.response.MovieResponse
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {
    @GET("movie/upcoming")
    fun getMoviesAsync(): Deferred<MovieResponse>

    @GET("movie/{movie_id}")
    fun getMovieDetailAsync(@Path("movie_id") movieId: Long): Deferred<Movie>

    @GET("movie/{movie_id}/images")
    fun getImagesByMovieIdAsync(@Path("movie_id") movieId: Long): Deferred<MovieImagesResponse>

    companion object {
        const val BASE_URL = "https://api.themoviedb.org/3/"
        const val REQUEST_TIMEOUT = 60L
    }
}