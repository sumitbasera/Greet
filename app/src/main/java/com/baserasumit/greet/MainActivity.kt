package com.baserasumit.greet

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun birthDay(view: View) {
        val intent = Intent(this, BIRTHDAY::class.java)
        startActivity(intent)

    }

    fun anniversary(view: View) {
        val intent = Intent(this, Anniversary::class.java)
          startActivity(intent)
    }

    fun achive(view: View) {
        val intent = Intent(this,achivement::class.java)
        startActivity(intent)
    }

    fun congrats(view: View) {
        val intent= Intent(this,Congratulations::class.java)
        startActivity(intent)
    }
}