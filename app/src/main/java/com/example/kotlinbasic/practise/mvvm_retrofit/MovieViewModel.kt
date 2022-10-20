package com.example.kotlinbasic.practise.mvvm_retrofit

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MovieViewModel: ViewModel() {

    private var movieLiveData = MutableLiveData<List<Result>>()

    fun getPopularMovies()
    {
        RetrofitInstance.Api.getPopularMovies("37cb4e298ae780484e23d50470a6f3ee").enqueue(object :
            Callback<Movie>{
            override fun onResponse(call: Call<Movie>, response: Response<Movie>) {
                Log.d("TAG",response.body()!!.results.size.toString())
                if (response.body() != null)
                {
                    movieLiveData.value = response.body()!!.results
                }
                else {
                    return
                }

            }

            override fun onFailure(call: Call<Movie>, t: Throwable) {
                Log.d("TAG",t.message.toString())
            }
        })
    }
    fun observeMovieLiveData(): LiveData<List<Result>>{
        return movieLiveData
    }
}