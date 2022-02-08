package com.example.covidvaccineapp.view

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.covidvaccineapp.Login
import com.example.covidvaccineapp.R
import com.example.covidvaccineapp.Registration

class RegisterFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view: View =  inflater.inflate(R.layout.fragment_register, container, false)
        // kliknemo na dugme i salje nas na video activity
        val dugme_register = view.findViewById<Button>(R.id.register_button)
        dugme_register.setOnClickListener { view ->
            requireActivity().run{
                startActivity(Intent(this, Registration::class.java))
                finish()
            }
        }

        val dugme_login = view.findViewById<Button>(R.id.login_button)
        dugme_login.setOnClickListener { view ->
            requireActivity().run{
                startActivity(Intent(this, Login::class.java))
                finish()
            }
        }
        return view
    }
}