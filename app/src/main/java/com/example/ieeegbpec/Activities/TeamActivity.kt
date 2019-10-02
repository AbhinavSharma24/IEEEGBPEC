package com.example.ieeegbpec.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ieeegbpec.R
import kotlinx.android.synthetic.main.activity_team.*

class TeamActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
