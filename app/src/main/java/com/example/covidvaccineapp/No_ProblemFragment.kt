package com.example.covidvaccineapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class No_ProblemFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_no__problem, container, false)

        val yes_btn_priority = view.findViewById<Button>(R.id.btn_yes_priority)
        yes_btn_priority.setOnClickListener { view ->
            requireActivity().run {
                startActivity(Intent(this, RealRegistrationActivity::class.java))
                finish()
            }
        }
        val none_btn_priority = view.findViewById<Button>(R.id.btn_none_priority)
        none_btn_priority.setOnClickListener { view ->
            requireActivity().run {
                startActivity(Intent(this, RealRegistrationActivity::class.java))
                finish()
            }
        }
        return view

    }
}