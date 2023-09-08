package com.example.noteapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

import com.google.firebase.database.DatabaseReference

class NotlarAdapter(private val mContext: Context,
                    private val notlarListe: List<Notlar>,
                    private val refNotlar: DatabaseReference)
    : RecyclerView.Adapter<NotlarAdapter.CardTasarimTutucu>(){
    inner class CardTasarimTutucu(tasarim : View): RecyclerView.ViewHolder(tasarim){
        var textViewNot: TextView
        var imageViewNokta: ImageView

        init {
            textViewNot = tasarim.findViewById(R.id.textViewNot)
            imageViewNokta = tasarim.findViewById(R.id.imageViewNokta)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.notlar_card_tasarim, parent, false)
        return CardTasarimTutucu(tasarim)
    }

    override fun getItemCount(): Int {
        return notlarListe.size
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val not = notlarListe.get(position)

        holder.textViewNot.text = "${not.not_icerik}"
        holder.imageViewNokta.setOnClickListener {
            val popupMenu = PopupMenu(mContext,holder.imageViewNokta)
            popupMenu.menuInflater.inflate(R.menu.popup_menu,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener {menuItem ->
                when(menuItem.itemId){
                    R.id.action_sil -> {
                        Snackbar.make(holder.imageViewNokta,"${not.not_icerik} silinsin mi ? ",Snackbar.LENGTH_SHORT)
                            .setAction("EVET"){
                                refNotlar.child(not.not_id!!).removeValue()
                            }.show()
                        true
                    }
                    R.id.action_guncelle -> {
                        kisiEkle(not)
                        true
                    }

                    else -> false
                }

            }
            popupMenu.show()
        }

    }
    fun kisiEkle(not: Notlar){
        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.alert_tasarim,null)
        val editTextText = tasarim.findViewById(R.id.editTextText) as EditText

        editTextText.setText(not.not_icerik)

        val alertDialog = AlertDialog.Builder(mContext)
        alertDialog.setTitle("Not Güncelle")
        alertDialog.setView(tasarim)
        alertDialog.setPositiveButton("GÜNCELLE"){dialogInterface, i ->
            val notText = editTextText.text.toString().trim()

            val bilgiler = HashMap<String,Any>()
            bilgiler.put("not_icerik",notText)

            refNotlar.child(not.not_id!!).updateChildren(bilgiler)
            Toast.makeText(mContext,"$notText", Toast.LENGTH_SHORT).show()
        }
        alertDialog.setNegativeButton("İptal") { dialogInterface, i ->
        }
        alertDialog.create().show()
    }
}