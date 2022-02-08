package com.example.covidvaccineapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.covidvaccineapp.view.InfoActivity

class RegisterProblemsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view: View = inflater.inflate(R.layout.fragment_register_problems, container, false)

        val yes_btn_problems = view.findViewById<Button>(R.id.btn_yes_problems)
        yes_btn_problems.setOnClickListener { view ->
            requireActivity().run {
                startActivity(Intent(this, Yes_ProblemFragment::class.java))
                finish()
            }
        }
        val no_btn_problems = view.findViewById<Button>(R.id.btn_no_problems)
        no_btn_problems.setOnClickListener { view ->
            requireActivity().run {
                startActivity(Intent(this, No_ProblemFragment::class.java))
                finish()
            }
        }
        return view

    }
}