package com.example.sharedpreferenceskullanimi

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharedpreferenceskullanimi.databinding.ActivityMainBinding

// SharedPreferences:
// Basit verileri kalıcı tutmak için kullanılır.
// Kaydettiğimiz verileri kapatsak bile kaybetmeyiz.
// Uygulamayı (apk) sildiğimizde kayıtlar da silinir.
// SharedPreferences kayıt işlemi (key - value) şeklinde tutulur
// Daha detaylı verileri SharedPreferences yerine veritabanlarıyla kayıt altına almamız gerekir.


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPreferences = getSharedPreferences("Kişisel Bilgiler", Context.MODE_PRIVATE) //silinme önceliği belirtir en son bu kaydı sil demektir.
        val editor = sharedPreferences.edit() // veri kaydı değişikliği yetkisi almak için

        editor.remove("yas")
        editor.remove("boy")
        editor.remove("ogrenciMi")
        editor.remove("arkadasListesi")
        editor.commit()

        /*
        editor.putString("ad", "Can")
        editor.putInt("yas", 20)
        editor.putFloat("boy", 1.81f)
        editor.putBoolean("ogrenciMi", true)

        val arkadasListesi = HashSet<String>()
        arkadasListesi.add("İlayda")
        arkadasListesi.add("Erhan")
        arkadasListesi.add("Samet")

        editor.putStringSet("arkadasListesi", arkadasListesi)

        editor.commit()

         */

        binding.buttonGit.setOnClickListener {
            startActivity(Intent(this@MainActivity, ActivityDetail::class.java))

        }
    }
}