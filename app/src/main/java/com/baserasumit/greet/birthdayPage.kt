package com.baserasumit.greet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_page.*

class birthdayPage : AppCompatActivity() {
    companion object{
        const val  Extra_Name =  "extra_name"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_page)

        val name = intent.getStringExtra(Extra_Name)
        textView4.text= "$name"
    }
}