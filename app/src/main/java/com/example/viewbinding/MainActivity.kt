package com.example.viewbinding

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var  binding : ActivityMainBinding
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        binding.button.setOnClickListener {

            if(binding.checkBox.isChecked){
                // open a new screen
            } else {
                binding.checkBox.buttonTintList = ColorStateList.valueOf(Color.RED)
                  Toast.makeText( this, "Please accept th T&C", Toast.LENGTH_SHORT).show()
            }

        }
    }
}