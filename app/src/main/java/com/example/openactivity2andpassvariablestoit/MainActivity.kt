package com.example.openactivity2andpassvariablestoit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_openActivity2.setOnClickListener {
            var i = Intent(this,Activity2::class.java)
            i.putExtra("name",et1_text.text.toString())
            i.putExtra("phonenumber",et2_phonenumber.text.toString())

            startActivity(i)

        }
    }
}
