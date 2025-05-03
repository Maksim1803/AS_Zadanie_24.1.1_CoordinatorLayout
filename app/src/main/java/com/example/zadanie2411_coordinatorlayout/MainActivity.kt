package com.example.zadanie2411_coordinatorlayout

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.zadanie2411_coordinatorlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding  // Объявляем переменную binding

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // Инициализируем binding
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar) // Используем binding для доступа к toolbar
    }
}
