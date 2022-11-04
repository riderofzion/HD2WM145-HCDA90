package com.eni.mod5nav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs


class InfoFragment : Fragment() {

    val args : InfoFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val args = arguments?.let { InfoFragmentArgs.fromBundle(it) }
        val textViewInfo = view.findViewById<TextView>(R.id.textViewInfo)
        textViewInfo.text = "${args?.user?.prenom} ${args?.user?.age}"
    }
}