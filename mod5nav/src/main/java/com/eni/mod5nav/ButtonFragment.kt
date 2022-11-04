package com.eni.mod5nav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class ButtonFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_button, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val buttonToInfo = view.findViewById<Button>(R.id.button)
        //Lors du clic sur mon bouton, je me dirige vers le fragment info
        buttonToInfo.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.actionButtonToInfo)
        }
    }
}