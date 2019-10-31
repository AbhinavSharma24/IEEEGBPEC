package com.example.ieeegbpec.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ieeegbpec.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_event.*

class EventActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        Picasso.get().load("http://ourpolitics.net/wp-content/uploads/2017/12/events.jpg")
            .fit().centerCrop().into(toolbarImg)

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
