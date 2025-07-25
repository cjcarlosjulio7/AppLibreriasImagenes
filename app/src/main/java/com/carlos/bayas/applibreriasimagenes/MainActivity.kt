package com.carlos.bayas.applibreriasimagenes

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<Button>(R.id.btnPicasso).setOnClickListener {
            startActivity(Intent(this, PicassoActivity::class.java))
        }

        findViewById<Button>(R.id.btnGlide).setOnClickListener {
            startActivity(Intent(this, GlideActivity::class.java))
        }

        findViewById<Button>(R.id.btnPhotoEditor).setOnClickListener {
            startActivity(Intent(this, GpuImageActivity::class.java))
        }
    }
}