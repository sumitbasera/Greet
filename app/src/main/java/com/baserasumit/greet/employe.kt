package com.baserasumit.greet

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_employe.*

class employe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employe)
    }

    fun createIt(view: View) {
        val name = editText.editableText.toString()
        val year = EditInfo.editableText.toString()

        val intent = Intent(this,EmployePage::class.java)
        intent.putExtra("name",name)
        intent.putExtra("years",year)
        startActivity(intent)
    }
}