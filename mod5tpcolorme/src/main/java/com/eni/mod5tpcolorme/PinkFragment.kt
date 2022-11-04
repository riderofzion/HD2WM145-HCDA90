package com.eni.mod5tpcolorme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class PinkFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pink, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val pinkButton = view.findViewById<Button>(R.id.buttonPink)
        pinkButton.setOnClickListener {
            when((1..100).random()){
                in (1..49) -> Navigation.findNavController(view).navigate(R.id.actionPinkToGreen)
                in (50..100) -> Navigation.findNavController(view).navigate(R.id.actionPinkToYellow)
            }
        }
    }

}