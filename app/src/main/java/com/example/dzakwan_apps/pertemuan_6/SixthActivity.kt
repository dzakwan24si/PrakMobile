package com.example.dzakwan_apps.pertemuan_6

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dzakwan_apps.R
import com.example.dzakwan_apps.databinding.ActivityAuthBinding
import com.example.dzakwan_apps.databinding.ActivityFourthBinding
import com.example.dzakwan_apps.databinding.ActivitySixthBinding

class SixthActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySixthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySixthBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}