package com.example.covidvaccineapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_register_problems)

        var yes_btn_problems = findViewById(R.id.btn_yes_problems) as Button
        yes_btn_problems.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, ProblemYesActivity::class.java)
            startActivity(intent);
        }

        var no_btn_problems = findViewById(R.id.btn_no_problems) as Button
        no_btn_problems.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, ProblemNoActivity::class.java)
            startActivity(intent);
        }
    }
}