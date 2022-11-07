package com.eni.mod5racontemoiunehistoire

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs


class StoryFragment : Fragment() {
    val args by navArgs<StoryFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_story, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //val args = arguments?.let { StoryFragmentArgs?.fromBundle(it)}
        view.findViewById<TextView>(R.id.textView)
            .text = "Il était une fois un être nommé ${args?.story?.prenom} qui vivait dans un(e) ${args?.story?.lieu}"


    }

}