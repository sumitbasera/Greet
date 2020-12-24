package com.baserasumit.greet

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_anniversary.*
import kotlinx.android.synthetic.main.activity_anniversary.view.*
import kotlinx.android.synthetic.main.activity_anniversary.view.editTextNumber
import kotlinx.android.synthetic.main.activity_anniversary.view.editTextTextPersonName
import kotlinx.android.synthetic.main.activity_anniversary.view.editTextTextPersonName2
import kotlinx.android.synthetic.main.activity_main.*

class Anniversary : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anniversary)
    }

    fun push(view: View) {
        val hubbyName = editTextTextPersonName.editableText.toString()
        val wifeName = editTextTextPersonName2.editableText.toString()
        val year = editTextNumber.editableText.toString()

       val intent = Intent(this,AnniversaryPage::class.java)
        intent.putExtra("hubby",hubbyName)
        intent.putExtra("wife",wifeName)
        intent.putExtra("year",year)
        startActivity(intent)
    }
}