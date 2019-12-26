package com.example.openactivity2andpassvariablestoit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_2.*

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var i = getIntent()
        var name = i.getStringExtra("name")
        var phonenumber = i.getStringExtra("phonenumber")

        tv1_name.setText("$name")
        tv2_phonenumber.setText("$phonenumber")
    }
}
