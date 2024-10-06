// PhotoAdapter.kt
package com.example.movb02_grupo2_pl.ui.photos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.movb02_grupo2_pl.R

data class PhotoItem(val imageResId: Int, val description: String)

class PhotoAdapter(private val photos: List<PhotoItem>) :
    RecyclerView.Adapter<PhotoAdapter.PhotoViewHolder>() {

    inner class PhotoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.photoImageView)
        val descriptionView: TextView = itemView.findViewById(R.id.photoDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_photo, parent, false)
        return PhotoViewHolder(view)
    }

    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
        val photoItem = photos[position]
        holder.imageView.setImageResource(photoItem.imageResId)
        holder.descriptionView.text = photoItem.description
    }

    override fun getItemCount() = photos.size
}
