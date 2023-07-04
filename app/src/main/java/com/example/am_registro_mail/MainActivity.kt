package com.example.am_registro_mail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.am_registro_mail.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnregistrar.setOnClickListener{
            Toast.makeText(this,"Gracias por registrarte "+ binding.enterName.text + " y "+ binding.enterEmail.text, Toast.LENGTH_LONG).show()
        }

    }
}