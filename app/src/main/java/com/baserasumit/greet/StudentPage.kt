package com.baserasumit.greet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_student_page.*

class StudentPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_page)

        val name = intent.getStringExtra("name")
        val percents = intent.getStringExtra("percentage")

        textView9.text = "Congratulations $name for scoring $percents % in your recent Exams"
    }
}