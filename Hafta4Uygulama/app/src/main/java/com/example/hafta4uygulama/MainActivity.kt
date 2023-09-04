package com.example.hafta4uygulama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hafta4uygulama.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var design:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        design =ActivityMainBinding.inflate(layoutInflater)
        setContentView(design.root)

        design.btnPuan.setOnClickListener{
            val puanIntent = Intent(this@MainActivity,PuanActivity::class.java)
            startActivity(puanIntent)
        }
        design.btnFikstur.setOnClickListener {
            val fiksturIntent = Intent(this@MainActivity,FiksturActivity::class.java)
            startActivity(fiksturIntent)
        }
        design.btnTransferler.setOnClickListener {
            val transferIntent = Intent(this@MainActivity,TransferActivity::class.java)
            startActivity(transferIntent)
        }
    }
}