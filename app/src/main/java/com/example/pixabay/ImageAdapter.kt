package com.example.pixabay

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.pixabay.databinding.ItemImageBinding
import com.example.pixabay.model.ImageModel

class ImageAdapter(private val list : List<ImageModel>)
    : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val binding = ItemImageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ImageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ImageViewHolder(private val binding : ItemImageBinding) : RecyclerView.ViewHolder(binding.root){
        fun onBind(model : ImageModel){
            binding.pixabayImage.load(model.largeImageURL)
        }
    }
}

