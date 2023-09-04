package com.example.sayfalararasiveritasima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.sayfalararasiveritasima.databinding.ActivityBBinding
import com.example.sayfalararasiveritasima.databinding.ActivityMainBinding

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)


        val gelenKisi = intent.getSerializableExtra("nesne") as Kisiler
        Log.e("kisi tcno",(gelenKisi.tcno).toString())
        Log.e("kisi isim", (gelenKisi.isim))
        Log.e("kisi boy", (gelenKisi.boy).toString())
    }
}