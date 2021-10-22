package com.okellosoftwarez.complynx_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.okellosoftwarez.complynx_test.databinding.ActivityLastTransactionBinding
import com.okellosoftwarez.complynx_test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.loginButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)
        })
    }
}