package com.example.yasamdongusu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

//Android uygulamasının bir parçası
//Activity -> kullanıcının gördüğü arayüz
//Bir uygulama birden fazla activity içerebilir.
//Activity yaşam döngüsü
//Activitynin yaratılması, duraklatılması, yeniden başlatılması
// ve yok edilmesi gibi işlemler.
//onCreate() bu metod ile birlikte aktivite yaratılır
//onStart() bu metod ile birlikte metod artık kullanıcı tarafından görülür
//onResume() bu metod ile birlikte kullanıcı artık uygulama ile karşılıklı iletişim halindedir.




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.e("onDestroy","çalıştı")
    }

    override fun onResume() {
        super.onResume()
        Log.e("onResume"," çalıştı")
    }

    override fun onPause() {
        super.onPause()
        Log.e("onResume","çalıştı")
    }

    override fun onStop() {
        super.onStop()
        Log.e("onStop","çalıştı")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy","çalıştı")
    }
}