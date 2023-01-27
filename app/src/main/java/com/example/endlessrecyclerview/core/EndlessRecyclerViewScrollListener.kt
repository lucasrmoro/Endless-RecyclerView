package com.example.endlessrecyclerview.core

import androidx.core.view.size
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EndlessRecyclerViewScrollListener(
    private val endlessRecyclerViewScrollInterface: EndlessRecyclerViewScrollInterface
) : RecyclerView.OnScrollListener() {

    private val threshold = 5

    override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
        super.onScrolled(recyclerView, dx, dy)
        if (!endlessRecyclerViewScrollInterface.isLoading() &&
            endlessRecyclerViewScrollInterface.hasItemsToLoad() &&
            isLastItemVisible(recyclerView)
        ) {
            endlessRecyclerViewScrollInterface.loadMoreItems()
        }
    }

    private fun isLastItemVisible(recyclerView: RecyclerView): Boolean {
        val layoutManager = (recyclerView.layoutManager as? LinearLayoutManager)
        val recyclerViewRealSize = recyclerView.size - threshold
        return (layoutManager?.findLastCompletelyVisibleItemPosition() ?: 0) >= recyclerViewRealSize
    }

}