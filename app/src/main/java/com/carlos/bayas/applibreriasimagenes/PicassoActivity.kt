package com.carlos.bayas.applibreriasimagenes

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.squareup.picasso.Picasso
import com.carlos.bayas.applibreriasimagenes.R
import android.widget.ImageView


class PicassoActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView
    private val imageUrl = "https://i.pinimg.com/1200x/77/a7/7e/77a77ed29a0b41610de5338b70b055e7.jpg"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_picasso)
        imageView = findViewById(R.id.imageViewPicasso)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        // Carga inicial de imagen
        loadNormalImage()

        // Botón Redimensionar
        findViewById<Button>(R.id.btnResize).setOnClickListener {
            Picasso.get()
                .load(imageUrl)
                .resize(150, 150) // Redimensiona a 150x150
                .into(imageView)
        }

        // Botón Recorte (centerCrop)
        findViewById<Button>(R.id.btnCrop).setOnClickListener {
            Picasso.get()
                .load(imageUrl)
                .resize(100, 100)
                .centerCrop()// Recorta desde el centro
                .into(imageView)
        }

        //botón para Girar imagen
        findViewById<Button>(R.id.btnRotate).setOnClickListener {
            Picasso.get()
                .load(imageUrl)
                .rotate(90f) // Gira la imagen en 90 grados
                .into(imageView)
        }
    }

    private fun loadNormalImage() {
        Picasso.get()
            .load(imageUrl)
            .into(imageView)
    }

}