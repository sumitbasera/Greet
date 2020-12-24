package com.baserasumit.greet

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_congratulations.*

class Congratulations : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_congratulations)
    }

    fun createIt(view: View) {
        val name = editText.editableText.toString()
        val message = EditInfo.editableText.toString()

        val intent = Intent(this,congratulationPage::class.java)
          intent.putExtra("name" ,name)
          intent.putExtra("mesg",message)
        startActivity(intent)
    }
}