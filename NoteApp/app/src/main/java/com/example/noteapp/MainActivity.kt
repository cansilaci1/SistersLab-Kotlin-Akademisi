package com.example.noteapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.noteapp.databinding.ActivityMainBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var notlarListe: ArrayList<Notlar>
    private lateinit var adapter: NotlarAdapter
    private lateinit var refNotlar: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager = LinearLayoutManager(this)

        val db = FirebaseDatabase.getInstance()

        refNotlar =db.getReference("notlar")

        notlarListe = ArrayList()

        adapter = NotlarAdapter(this,notlarListe,refNotlar)
        binding.rv.adapter = adapter

        tumNotlar()

        binding.imageViewAdd.setOnClickListener{
            notEkle()

        }

    }
    fun notEkle(){
        val tasarim = LayoutInflater.from(this).inflate(R.layout.alert_tasarim,null)
        val editTextText = tasarim.findViewById(R.id.editTextText) as EditText

        val alertDialog = AlertDialog.Builder(this)
        alertDialog.setTitle("Not Ekle")
        alertDialog.setView(tasarim)
        alertDialog.setPositiveButton("EKLE"){dialogInterface, i ->
            val notText = editTextText.text.toString().trim()

            val not = Notlar("",notText)
            refNotlar.push().setValue(not)
            Toast.makeText(applicationContext,"$notText", Toast.LENGTH_SHORT).show()
        }

        alertDialog.setNegativeButton("İptal") { dialogInterface, i ->
        }
        alertDialog.create().show()
    }
    fun tumNotlar(){
        refNotlar.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                notlarListe.clear()

                for (c in snapshot.children){
                    val not = c.getValue(Notlar::class.java)
                    if (not != null){
                        not.not_id = c.key
                        notlarListe.add(not)
                    }

                }
                adapter.notifyDataSetChanged()

            }
            override fun onCancelled(error: DatabaseError) {
            }
        })
    }
}