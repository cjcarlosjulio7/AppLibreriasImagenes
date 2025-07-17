package com.carlos.bayas.applibreriasimagenes

import android.os.Bundle
import android.widget.Button

import androidx.activity.enableEdgeToEdge
import android.graphics.BitmapFactory
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import jp.co.cyberagent.android.gpuimage.GPUImage
import jp.co.cyberagent.android.gpuimage.filter.GPUImageSepiaToneFilter
import jp.co.cyberagent.android.gpuimage.filter.GPUImageGrayscaleFilter
import jp.co.cyberagent.android.gpuimage.filter.GPUImageSketchFilter
import com.carlos.bayas.applibreriasimagenes.R


class GpuImageActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView
    private lateinit var gpuImage: GPUImage

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_gpu_image)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        imageView = findViewById(R.id.imageViewGpu)

        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.elbicho)
        gpuImage = GPUImage(this)
        gpuImage.setImage(bitmap) // Bitmap base

        // Botón 3x3TextureSamplingFilter
        findViewById<Button>(R.id.btnSepia).setOnClickListener {
            gpuImage.setFilter(GPUImageSepiaToneFilter())
            imageView.setImageBitmap(gpuImage.bitmapWithFilterApplied)
        }

        // Botón Filtro Blanco y Negro
        findViewById<Button>(R.id.btnGray).setOnClickListener {
            gpuImage.setFilter(GPUImageGrayscaleFilter())
            imageView.setImageBitmap(gpuImage.bitmapWithFilterApplied)
        }

        // Botón Filtro Sketch (dibujo)
        findViewById<Button>(R.id.btnSketch).setOnClickListener {
            gpuImage.setFilter(GPUImageSketchFilter())
            imageView.setImageBitmap(gpuImage.bitmapWithFilterApplied)
        }
    }
}
