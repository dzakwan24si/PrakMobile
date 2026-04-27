package com.example.dzakwan_apps.Home.pertemuan_2

import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dzakwan_apps.R
import com.example.dzakwan_apps.databinding.ActivityFifthBinding
import com.example.dzakwan_apps.databinding.ActivitySecondBinding
import com.example.dzakwan_apps.databinding.ActivityThirdBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        setSupportActionBar(binding.toolbar)
        supportActionBar?.apply {
            setHomeAsUpIndicator(R.drawable.ic_arrow_back)
            title = "Activity Second"
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }

        // Inisialisasi komponen
        val inputNama: EditText = findViewById(R.id.inputNama)
        val btnSubmit: Button = findViewById(R.id.btnSubmit)

        btnSubmit.setOnClickListener {
            //Mengambil value dari inputNama dan menampilkan di Logcat
            val nama = inputNama.text
            Log.e("Klik btnSubmit","Tombol berhasil di tekan. Isi dari inputNama = $nama")

            Toast.makeText(this, "$nama telah melakukan klik pada tombol Submit", Toast.LENGTH_SHORT).show()
        }
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                onBackPressedDispatcher.onBackPressed()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}