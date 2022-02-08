package com.example.covidvaccineapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class RealRegistrationFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        val view: View = inflater.inflate(R.layout.fragment_real_registration, container, false)

       /* val already_exist_acc = view.findViewById<Button>(R.id.already_login)
        already_exist_acc.setOnClickListener { view ->
            requireActivity().run {
                startActivity(Intent(this, Login::class.java))
                finish()
            }
        }
        val no_acc_register = view.findViewById<Button>(R.id.no_acc_register)
        no_acc_register.setOnClickListener { view ->
            requireActivity().run {
                startActivity(Intent(this, RealRegistrationActivity::class.java))
                finish()
            }
        }*/
        return view

    }
}

