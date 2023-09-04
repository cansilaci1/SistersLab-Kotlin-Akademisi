package com.example.sayfalararasiveritasima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sayfalararasiveritasima.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonGonder.setOnClickListener {

            val kisiler = Kisiler(918273,"ahmet",1.82)
            val yeniIntent = Intent(this@MainActivity,ActivityB::class.java)
            yeniIntent.putExtra("mesaj","merhaba")
            yeniIntent.putExtra("yaş",20)
           // yeniIntent.putExtra("boy",1.80)
            yeniIntent.putExtra("nesne",kisiler)

            startActivity(yeniIntent)
        }
    }
}