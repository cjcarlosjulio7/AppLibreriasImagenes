package com.carlos.bayas.applibreriasimagenes

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.carlos.bayas.applibreriasimagenes.R


class GlideActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private val imageUrl = "https://assets.goal.com/images/v3/blt2aaca933046f8b00/Cristiano%20Ronaldo%20Portugal%202024%20(4).jpg"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_glide)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        imageView = findViewById(R.id.imageViewGlide)

        // Carga inicial
        loadNormalImage()

        findViewById<Button>(R.id.btnCircleCrop).setOnClickListener {
            Glide.with(this)
                .load(imageUrl)
                .transform(CircleCrop())
                .into(imageView)
        }

        findViewById<Button>(R.id.btnRoundedCorners).setOnClickListener {
            Glide.with(this)
                .load(imageUrl)
                .transform(CenterCrop(), RoundedCorners(100)) // esquinas redondeadas
                .into(imageView)
        }
    }

    private fun loadNormalImage() {
        Glide.with(this)
            .load(imageUrl)
            .into(imageView)
    }
}