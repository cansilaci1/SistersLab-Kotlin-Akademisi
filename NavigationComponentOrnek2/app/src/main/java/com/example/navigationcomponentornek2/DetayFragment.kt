package com.example.navigationcomponentornek2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationcomponentornek2.databinding.FragmentDetayBinding


private lateinit var binding: FragmentDetayBinding

class DetayFragment : Fragment() {


    class DetayFragment : Fragment() {
        private lateinit var tasarim: FragmentDetayBinding
        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
        ): View? {
            tasarim = FragmentDetayBinding.inflate(inflater,container,false)

            tasarim.buttonCiktiSayfasiGecisYap.setOnClickListener {

            }
            return tasarim.root
        }
    }
}