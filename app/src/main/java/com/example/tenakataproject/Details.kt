package com.example.tenakataproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.tenakataproject.databinding.FragmentDetailsBinding


class Details : Fragment(R.layout.fragment_details) {

    private lateinit var binding: FragmentDetailsBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_details, container, false)

        val status = resources.getStringArray(R.array.status)
        val arrayAdapter = ArrayAdapter(requireContext(), R.layout.dropdown_item, status)
        binding.autoCompleteTextView.setAdapter(arrayAdapter)

//        val location = resources.getStringArray(R.array.location)
//        val arrayAdapter = ArrayAdapter(requireContext(),R.layout.dropdown_item, location)
    }


}