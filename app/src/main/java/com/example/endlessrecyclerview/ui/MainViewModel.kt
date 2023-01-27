package com.example.endlessrecyclerview.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.endlessrecyclerview.data.DataSource
import com.example.endlessrecyclerview.data.model.Animal
import com.example.endlessrecyclerview.data.model.Loading
import com.example.endlessrecyclerview.ui.adapter.AdapterItem
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {

    private var _adapterList = MutableLiveData<List<AdapterItem>>(emptyList())
    val adapterList: LiveData<List<AdapterItem>> = _adapterList

    var isLoading = false
        private set
    private val loadingItem = Loading()

    private var currentPage = 0

    fun fetchAnimalsList() {
        viewModelScope.launch {
            showLoading()
            // Just to see the loading, because the data is mocked.
            delay(1000)
            _adapterList.value?.filterIsInstance<Animal>()?.run {
                DataSource.animalsListMocked.getOrNull(currentPage)?.let { plus(it) }
            }?.let {
                _adapterList.postValue(it)
            }
            nextPage()
            dismissLoading()
        }
    }

    fun hasAnimalsToLoad() = (_adapterList.value?.size ?: 0) < DataSource.animalsListMocked.flatten().size

    private fun showLoading() {
        isLoading = true
        val listWithLoading =
            _adapterList.value?.plus(loadingItem)
        listWithLoading?.let { _adapterList.postValue(it) }
    }

    private fun dismissLoading() {
        isLoading = false
    }

    private fun nextPage() {
        currentPage++
    }
}