package com.example.cocukeglence.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.cocukeglence.R
import com.example.cocukeglence.data.repo.Bilgiler
import com.example.cocukeglence.data.entity.Icerikler
import com.example.cocukeglence.databinding.ActivityDetayBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.getValue
import javax.sql.StatementEvent

class DetayActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetayBinding
    private lateinit var bilgiler: Bilgiler
    private lateinit var textViewDetay: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        textViewDetay = findViewById(R.id.textViewDetay)

        bilgiler = Bilgiler()

        val icerik = intent.getSerializableExtra("icerikNesne") as Icerikler


        masalDoldur(icerik)
        fikraDoldur(icerik)
        bilmeceDoldur(icerik)
        tekerlemeDoldur(icerik)

    }

    fun masalDoldur(icerik: Icerikler){

        if (icerik.icerik_ad == "Prens"){

            val database = FirebaseDatabase.getInstance()
            val dbMasalRef = database.getReference().child("Masal/prens")
            dbMasalRef.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(snapshot: DataSnapshot) {
                    val prens = snapshot.getValue<String>().toString()
                    textViewDetay.text = prens


                }

                override fun onCancelled(error: DatabaseError) {

                }

            })

        }

        else if (icerik.icerik_ad == "Rapunzel"){
            val database = FirebaseDatabase.getInstance()
            val dbMasalRef = database.getReference().child("Masal/rapunzel")
            dbMasalRef.addValueEventListener(object : ValueEventListener{
                override fun onDataChange(snapshot: DataSnapshot) {
                    val rapunzel = snapshot.getValue<String>().toString()
                    textViewDetay.text = rapunzel
                }

                override fun onCancelled(error: DatabaseError) {

                }

            })
        }

        else if (icerik.icerik_ad == "Yavru Kuş"){
            val database = FirebaseDatabase.getInstance()
            val dbMasalRef = database.getReference().child("Masal/yavru_kus")
            dbMasalRef.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(snapshot: DataSnapshot) {
                    val yavru_kus = snapshot.getValue<String>().toString()
                    textViewDetay.text = yavru_kus
                }

                override fun onCancelled(error: DatabaseError) {

                }

            })
        }

        else if (icerik.icerik_ad == "Üzgün Ördek"){
            val database = FirebaseDatabase.getInstance()
            val dbMasalRef = database.getReference().child("Masal/uzgun_ordek")
            dbMasalRef.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(snapshot: DataSnapshot) {
                    val uzgun_ordek = snapshot.getValue<String>().toString()
                    textViewDetay.text = uzgun_ordek
                }

                override fun onCancelled(error: DatabaseError) {

                }

            })
        }
    }

    fun fikraDoldur(icerik: Icerikler){

        if (icerik.icerik_ad == "Ağır"){
            val database = FirebaseDatabase.getInstance()
            val dbFikraRef = database.getReference().child("Fikra/agir")
            dbFikraRef.addValueEventListener(object : ValueEventListener{
                override fun onDataChange(snapshot: DataSnapshot) {
                    val agir = snapshot.getValue<String>().toString()
                    textViewDetay.text = agir
                }

                override fun onCancelled(error: DatabaseError) {

                }

            })
        }

        else if(icerik.icerik_ad == "Maymun"){
            val database = FirebaseDatabase.getInstance()
            val dbFikraRef = database.getReference().child("Fikra/maymun")
            dbFikraRef.addValueEventListener(object : ValueEventListener{
                override fun onDataChange(snapshot: DataSnapshot) {
                    val maymun = snapshot.getValue<String>().toString()
                    textViewDetay.text = maymun
                }

                override fun onCancelled(error: DatabaseError) {

                }

            })
        }

        else if (icerik.icerik_ad == "Papağan"){
            val database = FirebaseDatabase.getInstance()
            val dbFikraRef = database.getReference().child("Fikra/papagan")
            dbFikraRef.addValueEventListener(object : ValueEventListener{
                override fun onDataChange(snapshot: DataSnapshot) {
                    val papagan = snapshot.getValue<String>().toString()
                    textViewDetay.text = papagan
                }

                override fun onCancelled(error: DatabaseError) {

                }

            })
        }

        else if (icerik.icerik_ad == "Temel"){
            val database = FirebaseDatabase.getInstance()
            val dbFikraRef = database.getReference().child("Fikra/saat")
            dbFikraRef.addValueEventListener(object : ValueEventListener{
                override fun onDataChange(snapshot: DataSnapshot) {
                    val temel = snapshot.getValue<String>().toString()
                    textViewDetay.text = temel
                }

                override fun onCancelled(error: DatabaseError) {

                }

            })
        }

    }

    fun bilmeceDoldur(icerik: Icerikler){

        if (icerik.icerik_isim == "at"){
            val database = FirebaseDatabase.getInstance()
            val dbBilmeceRef = database.getReference().child("Bilmece/at")
            dbBilmeceRef.addValueEventListener(object : ValueEventListener{
                override fun onDataChange(snapshot: DataSnapshot) {
                    val at = snapshot.getValue<String>().toString()
                    textViewDetay.text = at
                }

                override fun onCancelled(error: DatabaseError) {

                }

            })

        }

        else if (icerik.icerik_isim == "bilgisayar"){
            val database = FirebaseDatabase.getInstance()
            val dbBilmeceRef = database.getReference().child("Bilmece/bilgisayar")
            dbBilmeceRef.addValueEventListener(object : ValueEventListener{
                override fun onDataChange(snapshot: DataSnapshot) {
                    val bilgisayar = snapshot.getValue<String>().toString()
                    textViewDetay.text = bilgisayar
                }

                override fun onCancelled(error: DatabaseError) {

                }
            })
        }

        else if (icerik.icerik_isim == "kelebek"){
            val database = FirebaseDatabase.getInstance()
            val dbBilmeceRef = database.getReference().child("Bilmece/kelebek")
            dbBilmeceRef.addValueEventListener(object : ValueEventListener{
                override fun onDataChange(snapshot: DataSnapshot) {
                    val kelebek = snapshot.getValue<String>().toString()
                    textViewDetay.text = kelebek
                }

                override fun onCancelled(error: DatabaseError) {

                }

            })
        }

        else if (icerik.icerik_isim == "oyuncak"){
            val database = FirebaseDatabase.getInstance()
            val dbBilmeceRef = database.getReference().child("Bilmece/oyuncak")
            dbBilmeceRef.addValueEventListener(object : ValueEventListener{
                override fun onDataChange(snapshot: DataSnapshot) {
                    val oyuncak = snapshot.getValue<String>().toString()
                    textViewDetay.text = oyuncak
                }

                override fun onCancelled(error: DatabaseError) {

                }

            })
        }

    }

    fun tekerlemeDoldur(icerik: Icerikler){

        if (icerik.icerik_isim == "ordek"){
            val database = FirebaseDatabase.getInstance()
            val dbTekerlemeRef = database.getReference().child("Tekerleme/ordek")
            dbTekerlemeRef.addValueEventListener(object : ValueEventListener{
                override fun onDataChange(snapshot: DataSnapshot) {
                    val ordek = snapshot.getValue<String>().toString()
                    textViewDetay.text = ordek
                }

                override fun onCancelled(error: DatabaseError) {

                }

            })
        }

        else if (icerik.icerik_isim == "pirinc"){
            val database = FirebaseDatabase.getInstance()
            val dbTekerlemeRef = database.getReference().child("Tekerleme/pirinc")
            dbTekerlemeRef.addValueEventListener(object : ValueEventListener{
                override fun onDataChange(snapshot: DataSnapshot) {
                    val pirinc = snapshot.getValue<String>().toString()
                    textViewDetay.text = pirinc
                }

                override fun onCancelled(error: DatabaseError) {

                }

            })
        }

        else if (icerik.icerik_isim == "sise"){
            val database = FirebaseDatabase.getInstance()
            val dbTekerlemeRef = database.getReference().child("Tekerleme/sise")
            dbTekerlemeRef.addValueEventListener(object : ValueEventListener{
                override fun onDataChange(snapshot: DataSnapshot) {
                    val sise = snapshot.getValue<String>().toString()
                    textViewDetay.text = sise
                }

                override fun onCancelled(error: DatabaseError) {

                }

            })
        }

        else if (icerik.icerik_isim == "yogurt"){
            val database = FirebaseDatabase.getInstance()
            val dbTekerlemeRef = database.getReference().child("Tekerleme/yogurt")
            dbTekerlemeRef.addValueEventListener(object : ValueEventListener{
                override fun onDataChange(snapshot: DataSnapshot) {
                    val yogurt = snapshot.getValue<String>().toString()
                    textViewDetay.text = yogurt
                }

                override fun onCancelled(error: DatabaseError) {

                }

            })
        }

    }

}
