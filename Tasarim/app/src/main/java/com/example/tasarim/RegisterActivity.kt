package com.example.tasarim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tasarim.databinding.ActivityMainBinding
import com.example.tasarim.databinding.ActivityRegisterBinding
import com.google.android.material.snackbar.Snackbar

class RegisterActivity : AppCompatActivity() {
    private lateinit var tasarim:ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        val editText = tasarim.editText
        val editText2 = tasarim.editText2
        val editText3 = tasarim.editText3
        val editText4 = tasarim.editText4

        tasarim.button.setOnClickListener {
            if (editText.text.isEmpty() || editText2.text.isEmpty() || editText3.text.isEmpty() || editText4.text.isEmpty()){
                Snackbar.make(it,"eksik bilgi girdiniz.!",Snackbar.LENGTH_SHORT).show()
            }else{
                // tüm bilgiler girildiyse ve butona basıldıysa gitmesini istediğim ekrana yönlendiriyorum
                val yeniIntent = Intent(this@RegisterActivity,MainActivity::class.java)
                startActivity(yeniIntent)
            }



        }

    }
}