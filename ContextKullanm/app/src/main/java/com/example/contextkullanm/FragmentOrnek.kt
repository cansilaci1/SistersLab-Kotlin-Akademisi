package com.example.contextkullanm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
//fragmentlarda context yapısı için activity kullanımı

class FragmentOrnek: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        Toast.makeText(activity,"merhaba",Toast.LENGTH_SHORT).show()
        return super.onCreateView(inflater, container, savedInstanceState)

    }

}