package com.example.dzakwan_apps

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dzakwan_apps.databinding.ActivityAuthBinding
import com.example.dzakwan_apps.databinding.ActivityMainBinding
import com.example.dzakwan_apps.pertemuan_3.ThirdActivity
import com.example.dzakwan_apps.pertemuan_3.ThirdResultActivity
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import androidx.core.content.edit

class AuthActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAuthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Kode ini harus selalu dipanggil saat butuh akses "user_pref"
        val sharedPref = getSharedPreferences("user_pref", MODE_PRIVATE)

//        //Kondisi jika isLogin bernilai true
//        val isLogin = sharedPref.getBoolean("isLogin", false)
//        if (isLogin) {
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//            finish() // Kill AuthActivity
//        }

        binding.btnLogin.setOnClickListener {
            val username = binding.inputusername.text.toString()
            val password = binding.inputpassword.text.toString()
            if (username == password) {
                sharedPref.edit {
                    putBoolean("isLogin", true)
                    putString("username", username)
                }
                Toast.makeText(this, "Login Berhasil", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()

            } else {
                MaterialAlertDialogBuilder(this)
                    .setTitle("Login Gagal")
                    .setMessage("Silahkan coba lagi")
                    .setNegativeButton("Ok") { dialog, _ ->
                        dialog.dismiss()
                    }
                    .show()
            }
        }
    }
}