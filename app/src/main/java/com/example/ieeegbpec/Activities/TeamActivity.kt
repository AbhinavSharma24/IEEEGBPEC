package com.example.ieeegbpec.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ieeegbpec.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_team.*

class TeamActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        background.background.alpha = 100

        Picasso.get().load("http://www.thepbo.com/wp-content/uploads/2019/01/AdobeStock_177663020.jpeg").fit().centerCrop().into(teambackground)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
