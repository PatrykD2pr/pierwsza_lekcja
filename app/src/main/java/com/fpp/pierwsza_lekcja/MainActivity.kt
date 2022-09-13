package com.fpp.pierwsza_lekcja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.fpp.pierwsza_lekcja.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var next = findViewById<Button>(R.id.przycisk_Next)
        var prev = findViewById<Button>(R.id.przycisk_Prev)
        var imgview = findViewById<ImageView>(R.id.imgView)
        var zdj = 1

        imgview.setImageResource(R.drawable.ai)

        next.setOnClickListener {
            if (zdj == 1 || zdj == 5) {
                zdj = 1
                imgview.setImageResource(R.drawable.ai)
                zdj++
            }
            else if (zdj == 2)
            {
                imgview.setImageResource(R.drawable.hito)
                zdj++
            }
            else if (zdj == 3)
            {
                imgview.setImageResource(R.drawable.sad)
                zdj++
            }
            else if (zdj == 4)
            {
                imgview.setImageResource(R.drawable.truth)
                zdj++
            }
        }

        prev.setOnClickListener {
            if (zdj == 4 || zdj == 0) {
                zdj = 4
                imgview.setImageResource(R.drawable.truth)
                zdj--
            }
            else if (zdj == 3)
            {
                imgview.setImageResource(R.drawable.sad)
                zdj--
            }
            else if (zdj == 2)
            {
                imgview.setImageResource(R.drawable.hito)
                zdj--
            }
            else if (zdj == 1)
            {
                imgview.setImageResource(R.drawable.ai)
                zdj--
            }
        }
    }
}