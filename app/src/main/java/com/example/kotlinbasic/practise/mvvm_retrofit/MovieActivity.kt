package com.example.kotlinbasic.practise.mvvm_retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.kotlinbasic.R
import com.example.kotlinbasic.databinding.ActivityMovieBinding

class MovieActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMovieBinding
    private lateinit var viewModel: MovieViewModel
    private lateinit var movieAdapter: MovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        prepareRecylerView()

        viewModel = ViewModelProvider(this)[MovieViewModel::class.java]
        viewModel.getPopularMovies()
        viewModel.observeMovieLiveData().observe(this, Observer {   movieList->
            movieAdapter.setMovieList(movieList)
        })
    }

    private fun prepareRecylerView() {
        movieAdapter = MovieAdapter()
        binding.rvMovies.apply { layoutManager = GridLayoutManager(applicationContext,2)
        adapter = movieAdapter
        }
    }
}