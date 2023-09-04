package com.example.viewbinding2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.viewbinding2.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

            val editTextAd = tasarim.editTextAd
            val editTextSoyad = tasarim.editTextSoyad
            val editTextTc = tasarim.editTextTc
            tasarim.kayitBtn.setOnClickListener{
                if (editTextAd.text.isEmpty() || editTextSoyad.text.isEmpty() ||editTextTc.text.isEmpty()){
                    Snackbar.make(it,"kayıt alanlarını doldurunuz", Snackbar.LENGTH_SHORT).show()
                    Log.d("test","if bloğuna düştü")
                }else{
                    //BİLGİLER GİRİLDİYSE SONRAKİ EKRANA GEÇER
                    val yeniIntent = Intent(this@MainActivity,RegisterActivity::class.java)
                    startActivity(yeniIntent)
                    Log.d("test","else bloğuna düştü")// logcat sekmesinde gözükür
                }
        }
    }
}