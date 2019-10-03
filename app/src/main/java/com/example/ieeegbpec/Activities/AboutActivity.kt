package com.example.ieeegbpec.Activities

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ieeegbpec.R
import kotlinx.android.synthetic.main.activity_about.*

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        background.background.alpha = 90

        share_app.setOnClickListener {
            Toast.makeText(this,"Feature coming soon !!!",Toast.LENGTH_SHORT).show()
        }

        website.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ieee.org")))
        }
        facebook.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/gbpec.ieee/")))
        }
        instagram.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/ieeegbpec?igshid=qcwd7chryxl1")))
        }
        twitter.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitter.com")))
        }

        abhinav_gmail.setOnClickListener {
            val i = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto: abhinavsharma2499@gmail.com"))
            i.putExtra(Intent.EXTRA_SUBJECT,"Hello Abhinav Sharma")
            startActivity(Intent.createChooser(i,"Send Email"))
        }
        abhinav_github.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/abhinavsharma24")))
        }
        abhinav_linkedin.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/abhinav-sharma-17477a134/")))
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
