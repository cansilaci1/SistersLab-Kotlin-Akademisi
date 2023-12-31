package com.example.kisileruygulamasimvvm.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.core.view.MenuProvider
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kisileruygulamasimvvm.R
import com.example.kisileruygulamasimvvm.data.entity.Kisiler
import com.example.kisileruygulamasimvvm.databinding.FragmentAnasayfaBinding
import com.example.kisileruygulamasimvvm.ui.adapter.KisilerAdapter
import com.example.kisileruygulamasimvvm.util.gecisYap
import com.example.kisileruygulamasimvvm.viewmodel.AnasayfaViewModel

class AnasayfaFragment : Fragment(),SearchView.OnQueryTextListener {
    private lateinit var viewModel: AnasayfaViewModel
    private lateinit var tasarim: FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = DataBindingUtil.inflate(inflater,R.layout.fragment_anasayfa,container,false)
        tasarim.anasayfaFragment = this

        tasarim.anasayfaToolbarBaslik = "Kişiler"
        (activity as AppCompatActivity).setSupportActionBar(tasarim.toolbarAnasayfa)



            val kisilerListesi = ArrayList<Kisiler>()
            val k1 = Kisiler(1, "Ahmet", "1111")
            val k2 = Kisiler(2, "Helin", "2222")
            val k3 = Kisiler(3, "Orcan", "444")
            val k5 = Kisiler(4, "Döne", "7777")
            val k6 = Kisiler(5, "Büşra", "6666")
            val k7 = Kisiler(6, "Nazlıcan", "0000")
            val k8 = Kisiler(7, "Türkan", "8598")
            val k9 = Kisiler(8, "Can", "85847")

            kisilerListesi.add(k1)
            kisilerListesi.add(k2)
            kisilerListesi.add(k3)
            kisilerListesi.add(k5)
            kisilerListesi.add(k6)
            kisilerListesi.add(k7)
            kisilerListesi.add(k8)
            kisilerListesi.add(k9)

        viewModel.kisilerListesi.observe(viewLifecycleOwner){
            // adapter classına eklediğimiz her şey için alttaki kod satırının sonuna eklemeler yapılmalıdır. bkz: viewModel
            val adapter = KisilerAdapter(requireContext(), it, viewModel)
            tasarim.kisilerAdapter = adapter
        }




        requireActivity().addMenuProvider(object : MenuProvider{
            override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
                menuInflater.inflate(R.menu.toolbar_menu, menu)

                val item = menu.findItem(R.id.action_ara)
                val searchView = item.actionView as SearchView

                searchView.setOnQueryTextListener(this@AnasayfaFragment)
            }

            override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
                return false
            }

        },viewLifecycleOwner,Lifecycle.State.RESUMED)

        return tasarim.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel : AnasayfaViewModel by viewModels ()
        viewModel = tempViewModel
    }

    fun fabTikla(it:View){
        Navigation.gecisYap(R.id.kisiKayitGecis, it)
    }

    override fun onQueryTextSubmit(query: String): Boolean {
        viewModel.ara(query)
        return true
    }

    override fun onQueryTextChange(newText: String): Boolean {
        viewModel.ara(newText)
        return true
    }



    override fun onResume() {
        super.onResume()
        Log.e("Kişi Anasayfa", "Dönüldü")
    }

}