package com.baserasumit.greet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_congratulation_page.*

class congratulationPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_congratulation_page)

        val name= intent.getStringExtra("name")
        val messages = intent.getStringExtra("mesg")

        textView8.text ="congratulations $name for $messages"
    }
}