package com.example.endlessrecyclerview.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.endlessrecyclerview.core.EndlessRecyclerViewScrollInterface
import com.example.endlessrecyclerview.core.EndlessRecyclerViewScrollListener
import com.example.endlessrecyclerview.databinding.ActivityMainBinding
import com.example.endlessrecyclerview.ui.adapter.RecyclerViewAdapter

class MainActivity : AppCompatActivity(), EndlessRecyclerViewScrollInterface {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val viewModel by lazy { MainViewModel() }
    private val recyclerViewAdapter = RecyclerViewAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.recyclerView.addOnScrollListener(EndlessRecyclerViewScrollListener(this))
        binding.recyclerView.adapter = recyclerViewAdapter

        viewModel.fetchAnimalsList()
        viewModel.adapterList.observe(this) {
            recyclerViewAdapter.submitList(it)
        }
    }

    override fun loadMoreItems() {
        viewModel.fetchAnimalsList()
    }

    override fun hasItemsToLoad(): Boolean {
        return viewModel.hasAnimalsToLoad()
    }

    override fun isLoading() = viewModel.isLoading

}