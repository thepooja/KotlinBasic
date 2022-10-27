package com.example.kotlinbasic.practise.Paging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlinbasic.R
import kotlinx.android.synthetic.main.activity_paging.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.collect

class PagingActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel
    lateinit var mainListAdapter: MainListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paging)

        setupViewModel()
        setupList()
        setupView()

    }

    private fun setupView() {

        lifecycleScope.launch{
            viewModel.listData.collect{
                mainListAdapter.submitData(it)
            }
        }
    }

    private fun setupList() {
        mainListAdapter = MainListAdapter()
        recyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = mainListAdapter
        }
    }

    private fun setupViewModel() {
        viewModel =
            ViewModelProvider(
                this,
                MainViewModelFactory(APIService.getApiService())
            )[MainViewModel::class.java]
    }
}