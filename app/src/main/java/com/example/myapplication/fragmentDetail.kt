package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class fragmentDetail: BottomSheetDialogFragment() {

    var pos : Int? = null
    var name : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        pos = arguments?.getInt("pos")
        name = arguments?.getString("name")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        var rootView = inflater?.inflate(R.layout.fragment_detail,
            container, false)

        var toolBar = rootView.findViewById<Toolbar>(R.id.toolbar)
        var title = name
        toolBar.setTitle(title)

        Toast.makeText(context, "$pos", Toast.LENGTH_SHORT).show()
        return rootView
    }

    companion object {

        fun newInstance(position: Int,name: String): fragmentDetail {

            val args = Bundle()
            args.putInt("pos", position)
            args.putString("name",name)
            val fragment = fragmentDetail()
            fragment.arguments = args
            return fragment
        }

    }
}