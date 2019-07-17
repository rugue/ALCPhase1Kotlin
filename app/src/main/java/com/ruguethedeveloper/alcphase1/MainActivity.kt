package com.ruguethedeveloper.alcphase1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //Switch statements which selects either button pressed
    fun nextActivity(view: View) {

        when (view.id) {
            R.id.about_alc -> openAbout()
            R.id.my_profile -> openMyProfile()
        }
    }

    //Opens MyProfile Activity
    private fun openMyProfile() {
        val intent = Intent(this, ScrollingProfile::class.java)
        startActivity(intent)
    }

    //Opens AboutALC Activity
    private fun openAbout() {
        val intent = Intent(this, AboutALC::class.java)
        startActivity(intent)
    }
}
