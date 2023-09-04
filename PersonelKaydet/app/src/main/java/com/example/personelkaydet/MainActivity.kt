package com.example.personelkaydet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.personelkaydet.databinding.ActivityMainBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var database = FirebaseDatabase.getInstance().reference

        // veri ekleme işlemi
        binding.btnEkle.setOnClickListener {
            var etNo = binding.etNo.text.toString().toInt()
            var etAdSoyad = binding.etAdSoyad.text.toString()
            var etMaas = binding.etMaas.text.toString().toInt()

            //database.setValue(Personel(etNo,etAdSoyad,etMaas))
            database.child(etNo.toString()).setValue(Personel(etAdSoyad,etMaas))
        }

        // veri okuma işlemi
        var getData = object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                var sb = StringBuilder()    // metin birleştirme sınıfı
                for (i in snapshot.children){
                    var adSoyad = i.child("padSoyad").getValue()
                    var maas = i.child("pmaas").getValue()
                    sb.append("${i.key} $adSoyad  $maas \n")
                }
                binding.tvSonuc.setText(sb)
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("NOT YET IMPLEMENTED")
            }


        }
        database.addValueEventListener(getData)
        database.addListenerForSingleValueEvent(getData)

    }
}