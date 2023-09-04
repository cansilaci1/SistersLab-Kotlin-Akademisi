package com.example.recyclerviewvecardview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

//Adapter recycler yapısında kullanacağımız veri kümesini organize eder.
//araylist oluşturmamız gerekir.
//Adapter tarafında hangi componenti hangi veri kümesine eşitleneceğini belirtir.

class RVAdapter(private val mContext:Context,private val ulkelerDisaridanGelenListe:List<Ulkeler>)
    :RecyclerView.Adapter<RVAdapter.CardViewTasarimNesneleriniTutucu>() {
    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int
    ): RVAdapter.CardViewTasarimNesneleriniTutucu {
        //cardTasarim sııfından bir nesne girmemiz bekleniyor
        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.card_tasarim,parent,false)
        return CardViewTasarimNesneleriniTutucu(tasarim)
    }

    override fun onBindViewHolder(
        holder: RVAdapter.CardViewTasarimNesneleriniTutucu,
        position: Int
    ) {
          val ulke = ulkelerDisaridanGelenListe[position]
          holder.satirYazi.text = ulke.ulkeAdi
          holder.satirCardView.setOnClickListener{
            Toast.makeText(mContext,"seçtiğiniz ülke : ${ulke.ulkeAdi}",Toast.LENGTH_SHORT).show()

          }
        holder.noktaResim.setOnClickListener{
            val popup = PopupMenu(mContext,holder.noktaResim)
            popup.menuInflater.inflate(R.menu.popup_menu,popup.menu)
            popup.show()

            popup.setOnMenuItemClickListener { item->
                when(item.itemId){
                    R.id.action_sil -> {
                        Toast.makeText(mContext,"sil: ${ulke.ulkeAdi}",Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.action_duzenle -> {
                        true

                    }R.id.favoriyeEkle -> {
                        Toast.makeText(mContext,"favoriye ekle:  ${ulke.ulkeAdi}",Toast.LENGTH_SHORT).show()
                    true
                    }
                    else -> false
                }
            }

        }
    }

    override fun getItemCount(): Int {
        //recycler view'de kaç tane veri görüntüleyeceğimi belirttiğim yer.

        return ulkelerDisaridanGelenListe.size
    }
    inner class CardViewTasarimNesneleriniTutucu(view: View): RecyclerView.ViewHolder(view){
        var satirCardView:CardView
        var satirYazi:TextView
        var noktaResim:ImageView

        init {
            satirCardView = view.findViewById(R.id.satirCardView)
            satirYazi = view.findViewById(R.id.satirYazi)
            noktaResim = view.findViewById(R.id.noktaResim)
        }
}
    }
