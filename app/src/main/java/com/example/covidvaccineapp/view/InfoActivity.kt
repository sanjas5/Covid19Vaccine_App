package com.example.covidvaccineapp.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.covidvaccineapp.Login
import com.example.covidvaccineapp.R
import com.example.covidvaccineapp.Registration

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_information)

        var login_btn = findViewById(R.id.login_inf) as Button
        login_btn.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, Login::class.java)
            startActivity(intent);
        }
        var register_btn = findViewById(R.id.register_inf) as Button
        register_btn.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, Registration::class.java)
            startActivity(intent);
        }
    }

}