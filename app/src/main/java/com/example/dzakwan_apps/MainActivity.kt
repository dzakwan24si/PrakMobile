package com.example.dzakwan_apps

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dzakwan_apps.databinding.ActivityFourthBinding
import com.example.dzakwan_apps.databinding.ActivityMainBinding
import com.example.dzakwan_apps.databinding.ActivityThirdBinding
import com.example.dzakwan_apps.pertemuan_3.ThirdActivity
import com.example.dzakwan_apps.pertemuan_3.ThirdResultActivity
import com.example.dzakwan_apps.pertemuan_4.FourthActivity
import com.example.dzakwan_apps.pertemuan_5.FifthActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btnToThird.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

        binding.btnToFourth.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            intent.putExtra("nama", "Politeknik Caltex Riau")
            intent.putExtra("asal", "Rumbai")
            intent.putExtra("umur", 25)
            startActivity(intent)
        }

        binding.btnToFifth.setOnClickListener {
            val intent = Intent(this, FifthActivity::class.java)
            startActivity(intent)
        }
    }
}