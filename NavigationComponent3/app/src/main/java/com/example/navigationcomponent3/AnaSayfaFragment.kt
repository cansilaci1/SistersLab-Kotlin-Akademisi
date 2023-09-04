package com.example.navigationcomponent3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponent3.databinding.FragmentAnaSayfaBinding


class AnaSayfaFragment : Fragment() {
    private lateinit var tasarim: FragmentAnaSayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnaSayfaBinding.inflate(inflater, container, false)
        tasarim.buttonBasla.setOnClickListener {

            val gecis = AnaSayfaFragmentDirections.ikinciEkranaGecis1(nesne = Kisiler(1,"Can",24),"Mehmet","Yildiz",23)
            Navigation.findNavController(it).navigate(gecis)

        }

        return tasarim.root

            }
}