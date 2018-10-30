package com.kmteck.imagepicker.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kmteck.imagepicker.R
import com.otaliastudios.cameraview.CameraView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cameraView = findViewById<CameraView>(R.id.cameraView)
        cameraView.setLifecycleOwner(this)
        cameraView.capturePicture()
    }

}
