package com.example.covidvaccineapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProblemNoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_no__problem)

        var yes_btn_priority = findViewById(R.id.btn_yes_priority) as Button
        yes_btn_priority.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, RealRegistrationActivity::class.java)
            startActivity(intent);
        }

        var no_btn_problems = findViewById(R.id.btn_none_priority) as Button
        no_btn_problems.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, RealRegistrationActivity::class.java)
            startActivity(intent);
        }
    }
}