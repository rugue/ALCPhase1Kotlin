package com.ruguethedeveloper.alcphase1

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View

class ScrollingProfile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrolling_profile)
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        //Helps displays back button
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        //Floating Action Button which Pass a "Scroll Down" message as a Snackbar
        val fab = findViewById<View>(R.id.fab) as FloatingActionButton
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Scroll Down! " + "\ud83d\ude0a", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }
}