package com.example.ieeegbpec.Activities

import android.content.Intent
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

        val intent = intent
        val id = intent.getStringExtra("eventNo")


        if(id == "1"){
            Picasso.get().load("https://miro.medium.com/max/1200/1*pE2fOVDikEUwiQJlh4ggzg.jpeg")
                .fit().centerCrop().placeholder(R.drawable.loadingevent).into(toolbarImg)
            eventName.text = "Seminar on Website Development"
            eventDes.text = "Web Development by Shubh Rohilla"
        }
        else if(id == "2"){
            Picasso.get().load("https://edyoda.s3.amazonaws.com/media/video-thumbnail/data-structures.jpg")
                .fit().centerCrop().placeholder(R.drawable.loadingevent).into(toolbarImg)
            eventName.text = "Seminar on Data Structures"
            eventDes.text = "Data Structures by Pradeep Chaudhary"
        }
        else if(id == "3"){
            Picasso.get().load("https://d1c0rs04n1r7r4.cloudfront.net/wp-content/uploads/2018/04/10184439/HS6251-TECHNICAL-ENGLISH-2-Important-Questions-Anna-University-2013-regulation.jpg")
                .fit().centerCrop().placeholder(R.drawable.loadingevent).into(toolbarImg)
            eventName.text = "Technovenza 2k19"
            eventDes.text = "Technovenza is th technical fest organised by IEEE GBPEC"
        }
        else if(id == "4"){
            Picasso.get().load("https://www.mindcypress.com/wp-content/uploads/2019/02/Machine-learning.jpg")
                .fit().centerCrop().placeholder(R.drawable.loadingevent).into(toolbarImg)
            eventName.text = "Seminar on Machine Learning"
            eventDes.text = "Machine Learning by Shivang Singh Kaira"
        }
        else if(id == "5"){
            Picasso.get().load("https://www.careeranna.com/articles/wp-content/uploads/2016/02/placement-1.jpg")
                .fit().centerCrop().placeholder(R.drawable.loadingevent).into(toolbarImg)
            eventName.text = "Mock Placement"
            eventDes.text = "Mock Placement including technical round, group discussion and personal interview"
        }
        else if(id == "6"){
            Picasso.get().load("http://newhorizonindia.edu/co-curricular/acumen/wp-content/uploads/sites/23/2016/12/8535217243404774.jpeg")
                .fit().centerCrop().placeholder(R.drawable.loadingevent).into(toolbarImg)
            eventName.text = "Guest Lecture"
            eventDes.text = "Guest Lecture on Micro doplar radar for detection and tracking of humans by Mrs. Shobha Sundar Ram, Assistant Professor, IIIT Delhi"
        }
        else if(id == "7"){
            Picasso.get().load("http://aptitude.brainkart.com/media/subject/article-Programming-and-Data-qW3.jpg")
                .fit().centerCrop().placeholder(R.drawable.loadingevent).into(toolbarImg)
            eventName.text = "Let's Talk Tech"
            eventDes.text = "Data Structures - Part 2 by Predeep Chaudhary, Pankaj Bhardwaj and Pradyumn Upadhyay"
        }
        else if (id == "8"){
            Picasso.get().load("https://getright.com.my/wp-content/uploads/2017/01/android-appr.jpg?id=6694")
                .fit().centerCrop().placeholder(R.drawable.loadingevent).into(toolbarImg)
            eventName.text = "Seminar on Android Application Development"
            eventDes.text = "Android Application Development by Abhinav Sharma"
        }
        else if(id == "9"){
            Picasso.get().load("https://blog-sap.com/analytics/files/2019/04/hackathon_dreamstime_xs_137670827.jpg")
                .fit().centerCrop().placeholder(R.drawable.loadingevent).into(toolbarImg)
            eventName.text = "Online Hackathon"
            eventDes.text = "Online Hackathon Competition sponsored by Coding Blocks"
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
