package com.example.cocukeglence.data.entity

import java.io.Serializable

data class Icerikler(var icerik_id:Int,
                     var icerik_ad:String,
                     var icerik_isim:String,
                     var icerik_resim:String,
                     var kategoriler: Kategoriler,
                     var icerikDetay: IcerikDetay
) : Serializable {
}