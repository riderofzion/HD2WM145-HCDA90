package com.eni.mod5tpcolorme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class RedFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_red, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val redButton = view.findViewById<Button>(R.id.buttonRed)
        redButton.setOnClickListener {
            when((1..2).random()){
                1 -> Navigation.findNavController(view).navigate(R.id.actionRedToBlue)
                2 -> Navigation.findNavController(view).navigate(R.id.actionRedToOrange)
            }
        }
    }
}