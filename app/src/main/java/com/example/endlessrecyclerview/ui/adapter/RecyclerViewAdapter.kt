package com.example.endlessrecyclerview.ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.endlessrecyclerview.data.model.Animal
import com.example.endlessrecyclerview.databinding.RecyclerViewItemAnimalBinding
import com.example.endlessrecyclerview.databinding.RecyclerViewItemLoadingBinding

class RecyclerViewAdapter : ListAdapter<AdapterItem, RecyclerView.ViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            AdapterItemType.ANIMAL_ITEM -> {
                AnimalViewHolder(
                    RecyclerViewItemAnimalBinding.inflate(
                        layoutInflater,
                        parent,
                        false
                    )
                )
            }
            AdapterItemType.LOADING_ITEM -> {
                LoadingViewHolder(
                    RecyclerViewItemLoadingBinding.inflate(
                        layoutInflater,
                        parent,
                        false
                    )
                )
            }
            else -> throw IllegalArgumentException()
        }
    }

    override fun getItemViewType(position: Int): Int {
        return getItem(position).adapterItemType
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is AnimalViewHolder -> {
                holder.onBind(getItem(position) as Animal)
            }
            is LoadingViewHolder -> {}
        }
    }

    inner class AnimalViewHolder(private val binding: RecyclerViewItemAnimalBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(animal: Animal) {
            binding.animalName.text = animal.name
        }

    }

    inner class LoadingViewHolder(binding: RecyclerViewItemLoadingBinding) :
        RecyclerView.ViewHolder(binding.root)

    private class DiffCallback : DiffUtil.ItemCallback<AdapterItem>() {
        override fun areItemsTheSame(oldItem: AdapterItem, newItem: AdapterItem) =
            oldItem.itemId == newItem.itemId

        @SuppressLint("DiffUtilEquals")
        override fun areContentsTheSame(oldItem: AdapterItem, newItem: AdapterItem) =
            oldItem == newItem
    }

}