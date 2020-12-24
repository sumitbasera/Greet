package com.baserasumit.greet

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_b_i_r_t_h_d_a_y.*

class BIRTHDAY : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_i_r_t_h_d_a_y)


    }

    fun createIt(view: View) {
        val name = editText.editableText.toString()

        val intent = Intent(this, birthdayPage::class.java)
        intent.putExtra(birthdayPage.Extra_Name,name)
        startActivity(intent)
    }
}