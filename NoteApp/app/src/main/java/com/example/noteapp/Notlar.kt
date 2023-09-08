package com.example.noteapp

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties

data class Notlar(var not_id: String?= "",
                  var not_icerik: String?="") {
}