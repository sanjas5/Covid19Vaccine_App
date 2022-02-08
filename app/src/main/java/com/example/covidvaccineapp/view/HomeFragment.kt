package com.example.covidvaccineapp.view

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import com.example.covidvaccineapp.R

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View =  inflater.inflate(R.layout.fragment_home, container, false)
        // kliknemo na dugme i salje nas na video activity
        val dugme = view.findViewById<ImageButton>(R.id.imageButton2)
        dugme.setOnClickListener { view ->
            requireActivity().run{
                startActivity(Intent(this, VideoActivity::class.java))
                finish()
            }
        }
        return view
    }

}