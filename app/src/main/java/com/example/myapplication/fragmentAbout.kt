package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment

class fragmentAbout: Fragment() {

    var name : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        name = arguments?.getString("name")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        var rootView = inflater?.inflate(R.layout.fragment_about,
            container, false)

        var toolBar = rootView.findViewById<Toolbar>(R.id.toolbar)
        var title = name?.toUpperCase()
        toolBar.setTitle(title)

        return rootView
    }

    companion object {

        fun newInstance(name: String?): fragmentAbout {

            val args = Bundle()
            args.putString("name", name)
            val fragment = fragmentAbout()
            fragment.arguments = args
            return fragment
        }

    }

}