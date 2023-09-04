package com.example.contextkullanm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.contextkullanm.databinding.ActivityMainBinding

//Context içinde bulunduğumuz activityden bir parça
//kullanılan bazı yapılar context girmemizi bekler(yani activitymizden bir parça bekler)
//genellikle parametre olarak değeri veririz.
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            //1. kullanım this
        //Toast.makeText(this,"merhaba",Toast.LENGTH_SHORT).show()
          //2. kullanım
            //Toast.makeText(this@MainActivity,"merhaba",Toast.LENGTH_SHORT).show()
            //3. kullanım
           // Toast.makeText(applicationContext,"merhaba",Toast.LENGTH_SHORT).show()
        }
    }
}