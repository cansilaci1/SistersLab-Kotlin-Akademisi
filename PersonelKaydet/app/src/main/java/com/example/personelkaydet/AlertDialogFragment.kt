package com.example.personelkaydet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.personelkaydet.databinding.FragmentAlertDialogBinding

class AlertDialogFragment : Fragment() {
   private lateinit var binding: FragmentAlertDialogBinding

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAlertDialogBinding.inflate(inflater,container,false)

        return binding.root
    }

}