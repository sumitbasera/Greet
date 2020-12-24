package com.baserasumit.greet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_employe_page.*

class EmployePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employe_page)

        val name = intent.getStringExtra("name")
        val year = intent.getStringExtra("years")

        textView10.text = "congratulations $name for giving your $year years in this organization"
    }
}