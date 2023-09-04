package com.example.alertdialogexample

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.alertdialogexample.databinding.AlertDialogBinding
import com.example.alertdialogexample.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        binding.textView2.setOnClickListener {
            showCustomAlertDialog()
        }
        return binding.root
    }

    private fun showCustomAlertDialog() {
        val dialogBinding = AlertDialogBinding.inflate(layoutInflater)

        // Create an AlertDialog
        val alertDialog = AlertDialog.Builder(requireContext())
            .setView(dialogBinding.root)

            .create()

        alertDialog.show()
    }
}