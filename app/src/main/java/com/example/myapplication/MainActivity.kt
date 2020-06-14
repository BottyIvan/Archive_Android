package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // prendo trovo la navigation in base all'id
        var navigationView = findViewById<BottomNavigationView>(R.id.buttomNav)

        // setto il click per il singolo item
        navigationView.setOnNavigationItemSelectedListener {

            // capisco cosa ho cliccato
            when(it.itemId){
                R.id.navigation_home->{
                    // load fragment
                    val fragment = fragmentHome.newInstance(getString(R.string.item_home))
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fr,fragment)
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }

                R.id.navigation_about->{
                    // load fragment
                    val fragment = fragmentAbout.newInstance(getString(R.string.item_about))
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fr,fragment)
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }

                else-> {
                    val fragment = fragmentHome.newInstance(getString(R.string.item_home))
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fr,fragment)
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
            }
        }

        // setto la fragmentHome come il fragment di default
        navigationView.selectedItemId = R.id.navigation_home
    }

}