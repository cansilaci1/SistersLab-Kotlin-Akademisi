package com.example.tasarim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tasarim.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val text = binding.editTextText
        val text2 = binding.editTextPassword
        binding.btnGiris.setOnClickListener{
            if (text.text.isEmpty() || text2.text.isEmpty()){
                Snackbar.make(it,"kullanıcı adı veya şifre hatalı",Snackbar.LENGTH_SHORT).show()
            }else{
                val LoginIntent = Intent(this@MainActivity,LoginActivity::class.java)
                startActivity(LoginIntent)
            }


        }
        binding.btnKayit.setOnClickListener {
            val regIntent = Intent(this@MainActivity,RegisterActivity::class.java)
            startActivity(regIntent)
        }
    }
}