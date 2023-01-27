package com.example.endlessrecyclerview.core

interface EndlessRecyclerViewScrollInterface {

    fun loadMoreItems()
    fun hasItemsToLoad(): Boolean
    fun isLoading(): Boolean

}