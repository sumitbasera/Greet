package com.baserasumit.greet

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_student.*

class student : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)
    }

    fun createIt(view: View) {
        val name = editText.editableText.toString()
        val percent = EditInfo.editableText.toString()

        val intent = Intent(this,StudentPage::class.java)
        intent.putExtra("name",name)
        intent.putExtra("percentage",percent)
        startActivity(intent)
    }
}