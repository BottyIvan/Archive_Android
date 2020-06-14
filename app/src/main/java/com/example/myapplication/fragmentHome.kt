package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

data class items(val id: Int,val title: String,val desc: String,val qta: Int)

class fragmentHome: Fragment(){

    var name : String? = null

    private val item = listOf(
        items(0,"PRESA PIATTA 16A","PRESA PIATTA 16A, COLORE BIANCO, MARCA BTICINO",1),
        items(1,"GANCI PER QUADRO 10X12","GANCI PER QUADRO 10X12MM, 10MM DIAMETRO, 12MM LUNGHEZZA CHIODO",100),
        items(2,"GANCI PER QUADRO 12X19","GANCI PER QUADRO 12X19MM, 12MM DIAMETRO, 19MM LUNGHEZZA CHIODO",10),
        items(3,"GANCI PER QUADRO 12X19","GANCI PER QUADRO 12X19MM, 12MM DIAMETRO, 19MM LUNGHEZZA CHIODO",10),
        items(4,"GANCI PER QUADRO 12X19","GANCI PER QUADRO 12X19MM, 12MM DIAMETRO, 19MM LUNGHEZZA CHIODO",10),
        items(5,"GANCI PER QUADRO 12X19","GANCI PER QUADRO 12X19MM, 12MM DIAMETRO, 19MM LUNGHEZZA CHIODO",10),
        items(6,"GANCI PER QUADRO 12X19","GANCI PER QUADRO 12X19MM, 12MM DIAMETRO, 19MM LUNGHEZZA CHIODO",10),
        items(7,"GANCI PER QUADRO 12X19","GANCI PER QUADRO 12X19MM, 12MM DIAMETRO, 19MM LUNGHEZZA CHIODO",10),
        items(8,"GANCI PER QUADRO 12X19","GANCI PER QUADRO 12X19MM, 12MM DIAMETRO, 19MM LUNGHEZZA CHIODO",10),
        items(9,"GANCI PER QUADRO 12X19","GANCI PER QUADRO 12X19MM, 12MM DIAMETRO, 19MM LUNGHEZZA CHIODO",10),
        items(10,"GANCI PER QUADRO 12X19","GANCI PER QUADRO 12X19MM, 12MM DIAMETRO, 19MM LUNGHEZZA CHIODO",10),
        items(11,"GANCI PER QUADRO 12X19","GANCI PER QUADRO 12X19MM, 12MM DIAMETRO, 19MM LUNGHEZZA CHIODO",10),
        items(12,"GANCI PER QUADRO 12X19","GANCI PER QUADRO 12X19MM, 12MM DIAMETRO, 19MM LUNGHEZZA CHIODO",10),
        items(13,"GANCI PER QUADRO 12X19","GANCI PER QUADRO 12X19MM, 12MM DIAMETRO, 19MM LUNGHEZZA CHIODO",10),
        items(14,"GANCI PER QUADRO 12X19","GANCI PER QUADRO 12X19MM, 12MM DIAMETRO, 19MM LUNGHEZZA CHIODO",10),
        items(15,"GANCI PER QUADRO 12X19","GANCI PER QUADRO 12X19MM, 12MM DIAMETRO, 19MM LUNGHEZZA CHIODO",10),
        items(16,"GANCI PER QUADRO 12X19","GANCI PER QUADRO 12X19MM, 12MM DIAMETRO, 19MM LUNGHEZZA CHIODO",10),
        items(17,"GANCI PER QUADRO 12X19","GANCI PER QUADRO 12X19MM, 12MM DIAMETRO, 19MM LUNGHEZZA CHIODO",10),
        items(18,"GANCI PER QUADRO 12X19","GANCI PER QUADRO 12X19MM, 12MM DIAMETRO, 19MM LUNGHEZZA CHIODO",10)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        name = arguments?.getString("name")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        var rootView = inflater?.inflate(R.layout.fragment_home,
            container, false)

        var toolBar = rootView.findViewById<Toolbar>(R.id.toolbar)
        var title = name?.toUpperCase()
        toolBar.setTitle(title)

        var recyclerview = rootView.findViewById<RecyclerView>(R.id.RecyclerView)
        recyclerview.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = homeAdapter(item, { item : items -> partItemClicked(item) })
        }

        return rootView
    }

    companion object {

        fun newInstance(name: String?): fragmentHome {

            val args = Bundle()
            args.putString("name", name)
            val fragment = fragmentHome()
            fragment.arguments = args
            return fragment
        }

    }

    private fun partItemClicked(items: items) {
        /*
        val fragment = fragmentDetail.newInstance(items.id,items.title)
        childFragmentManager
            .beginTransaction()
            .replace(R.id.home_fr,fragment)
            .commit()
         */
        //TODO
    }
}