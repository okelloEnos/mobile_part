package com.okellosoftwarez.complynx_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.okellosoftwarez.complynx_test.databinding.ActivityHomepageBinding
import com.okellosoftwarez.complynx_test.databinding.ActivityLastTransactionBinding

class Homepage : AppCompatActivity() {
    private lateinit var binding: ActivityHomepageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomepageBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.sendButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, SendMoney::class.java)
//                .apply {
//                putExtra(EXTRA_MESSAGE, message)
//            }
            startActivity(intent)
        })

        binding.lastButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, LastTransaction::class.java)

            startActivity(intent)
        })
    }
}