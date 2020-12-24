package com.baserasumit.greet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_anniversary_page.*

class AnniversaryPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anniversary_page)


        val hubby = intent.getStringExtra("hubby")
        val wife = intent.getStringExtra("wife")
        val year = intent.getStringExtra("year")

        val int1: Int? = year?.toInt()

        if(int1 == 1){
                textView7.text = "HAPPY $year st ANNIVERSARY TO $hubby AND $wife "
        }
            else if(int1 ==2){
            textView7.text = "HAPPY $year nd ANNIVERSARY TO $hubby AND $wife "
        }
        else if(int1==3){
            textView7.text = "HAPPY $year rd ANNIVERSARY TO $hubby AND $wife "
        }
        else {
            textView7.text = "HAPPY $year th ANNIVERSARY TO $hubby AND $wife "
        }
    }
}




