package com.example.ornekprojeler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ornekprojeler.databinding.ActivityBBinding
import com.example.ornekprojeler.databinding.ActivityMainBinding

class ActivityB : AppCompatActivity() {
    private lateinit var binding: ActivityBBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonGoToC.setOnClickListener {
            finish()
            startActivity(Intent(this@ActivityB,ActivityC::class.java))
        }
    }
}