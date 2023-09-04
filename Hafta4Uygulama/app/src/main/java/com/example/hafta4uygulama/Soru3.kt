package com.example.hafta4uygulama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hafta4uygulama.databinding.ActivityMain2Binding
import com.example.hafta4uygulama.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class Soru3 : AppCompatActivity() {
    private lateinit var tasarim: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(tasarim.root)
        val tc = tasarim.textTc
        val sifre = tasarim.textSifre

        tasarim.btnGiris.setOnClickListener {
            if (tc.text.isEmpty() || sifre.text.isEmpty()){
                Snackbar.make(it,"lütfen eksik yer bırakmayınız!!",Snackbar.LENGTH_SHORT).show()
            }else{
                val detayIntent = Intent(this@Soru3,soru3Detay::class.java)
                startActivity(detayIntent)
            }
        }
    }
}