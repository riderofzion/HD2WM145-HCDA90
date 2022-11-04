package com.eni.mod5nav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
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
            val directionInfo = ButtonFragmentDirections.actionButtonToInfo(User(14,"Michel"))
            //Navigation.findNavController(view).navig
            Navigation.findNavController(view).navigate(directionInfo)
        }


    }
}