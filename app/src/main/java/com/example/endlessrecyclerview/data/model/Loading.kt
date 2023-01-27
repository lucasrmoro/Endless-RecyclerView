package com.example.endlessrecyclerview.data.model

import com.example.endlessrecyclerview.ui.adapter.AdapterItem
import com.example.endlessrecyclerview.ui.adapter.AdapterItemType

data class Loading(
    val id: String = "LoadingId"
) : AdapterItem {

    override val itemId: String
        get() = id
    override val adapterItemType: Int
        get() = AdapterItemType.LOADING_ITEM

}