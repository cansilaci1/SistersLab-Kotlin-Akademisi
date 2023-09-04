package com.example.firebaserealtimekullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.firebaserealtimekullanimi.databinding.ActivityMainBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val database = FirebaseDatabase.getInstance()  //firebase üzerine çalışmak için yetki alma işlemi
        val refKisiler = database.getReference("kisiler")
        //kayıt işlemi oluşturma
        // val kisi = Kisiler("ilayda",20)
        // refKisiler.push().setValue(kisi)

        // id'si bilinen verinin silinme işlemi
        //refKisiler.child("-NdGdelPUOZ01IeXPWa0").removeValue()

        // veri güncelleme işlemi
        // hashmap oluşturmamız gerekiyor. Hashmap'i oluşturma nedenimiz hangi alana güncelleme olduğunu belirtmek için
        //val updateInfo = HashMap<String,Any>() // key kısmı her zaman string, veriler değişken
        //updateInfo["kisiAd"] = "Can"
        //updateInfo["kisiYas"] = 21
        //refKisiler.child("-NdGeDrR_2zquXCQko-c").updateChildren(updateInfo)
    /*
       // veri okuma işlemi
      refKisiler.addValueEventListener(object : ValueEventListener{
           override fun onDataChange(snapshot: DataSnapshot) {
           //veri değişikliği olduğunda ve verileri almak istediğimizde bu kod bloğu çalışır
           //for döngüsüyle kayıtlar alınacak
               for (p in snapshot.children){
                   val kisi = p.getValue(Kisiler::class.java)
                   if (kisi != null) {
                       val key = p.key
                       Log.e("---------------","deneme")
                       Log.e("Kisi key",key.toString())
                       Log.e("kisi ad",kisi.kisiAd.toString())
                       Log.e("Kisi yas",kisi.kisiYas.toString())
                   }
               }
           }

           override fun onCancelled(error: DatabaseError) {
           //hata aldığımızda çalışacak olan metodumuzdur.
           }

       })
*/      // verdiğimiz değer kadar listenin başından itibaren gösterir
        //1. sorgu val sorgu = refKisiler.limitToFirst(1)
        //2. sorguval sorgu = refKisiler.limitToLast(1)
        //3. sorgu
        val sorgu = refKisiler.orderByChild("kisiYas").startAt(17.0).endAt(101.0)
        sorgu.addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                //veri değişikliği olduğunda ve verileri almak istediğimizde bu kod bloğu çalışır
                //for döngüsüyle kayıtlar alınacak
                for (p in snapshot.children){
                    val kisi = p.getValue(Kisiler::class.java)
                    if (kisi != null) {
                        val key = p.key
                        Log.e("---------------","deneme")
                        Log.e("Kisi key",key.toString())
                        Log.e("kisi ad",kisi.kisiAd.toString())
                        Log.e("Kisi yas",kisi.kisiYas.toString())
                    }
                }
            }

            override fun onCancelled(error: DatabaseError) {
                //hata aldığımızda çalışacak olan metodumuzdur.
            }

        })
   }
}