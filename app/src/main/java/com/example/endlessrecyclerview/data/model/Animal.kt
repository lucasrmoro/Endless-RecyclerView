package com.example.endlessrecyclerview.data.model

import com.example.endlessrecyclerview.ui.adapter.AdapterItem
import com.example.endlessrecyclerview.ui.adapter.AdapterItemType
import java.util.*

data class Animal(
    val name: String,
    val id: String = UUID.randomUUID().toString()
) : AdapterItem {

    override val itemId: String
        get() = id
    override val adapterItemType: Int
        get() = AdapterItemType.ANIMAL_ITEM

}