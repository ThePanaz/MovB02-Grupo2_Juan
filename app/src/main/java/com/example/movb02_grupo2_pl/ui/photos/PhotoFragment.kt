// PhotoFragment.kt
package com.example.movb02_grupo2_pl.ui.photos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.movb02_grupo2_pl.R

class PhotoFragment : Fragment() {

    private lateinit var photoRecyclerView: RecyclerView
    private lateinit var photoAdapter: PhotoAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_photos, container, false)
        photoRecyclerView = view.findViewById(R.id.photoRecyclerView)

        // Configura una lista de fotos de ejemplo
        val photos = listOf(
            PhotoItem(R.drawable.sample_image_1, "Descripción de la Imagen 1"),
            PhotoItem(R.drawable.sample_image_2, "Descripción de la Imagen 2")
        )

        photoAdapter = PhotoAdapter(photos)
        photoRecyclerView.layoutManager = LinearLayoutManager(context)
        photoRecyclerView.adapter = photoAdapter

        return view
    }
}
