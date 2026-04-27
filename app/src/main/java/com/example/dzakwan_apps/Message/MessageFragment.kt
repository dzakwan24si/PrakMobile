package com.example.dzakwan_apps.Message

import android.content.Context.MODE_PRIVATE
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.edit
import com.example.dzakwan_apps.AuthActivity
import com.example.dzakwan_apps.Home.pertemuan_3.ThirdActivity
import com.example.dzakwan_apps.Home.pertemuan_4.FourthActivity
import com.example.dzakwan_apps.Home.pertemuan_5.FifthActivity
import com.example.dzakwan_apps.Home.pertemuan_7.SevenActivity
import com.example.dzakwan_apps.R
import com.example.dzakwan_apps.databinding.FragmentHomeBinding
import com.example.dzakwan_apps.databinding.FragmentMessageBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MessageFragment : Fragment() {
    private var _binding: FragmentMessageBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMessageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val sharedPref = requireContext().getSharedPreferences("user_pref", MODE_PRIVATE)
        (requireActivity() as AppCompatActivity).setSupportActionBar(binding.toolbar)
        (requireActivity() as AppCompatActivity).supportActionBar?.apply {
            title = "Message"
        }
    }
}