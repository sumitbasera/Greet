package com.baserasumit.greet

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class achivement : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_achivement)
    }

    fun employe(view: View) {
        val intent = Intent(this,employe::class.java)
        startActivity(intent)
    }
    fun student(view: View) {
        val intent=Intent(this,student::class.java)
        startActivity(intent)
    }


}