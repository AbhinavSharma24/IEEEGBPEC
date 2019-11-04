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
            eventDes.text = "IEEE GBPEC introduced its first ever tutorial classes to clear all your tech-oriented concepts.\n" +
                    "INTRODUCTION TO WEB DEVELOPMENT by Shubh Rohilla, on 6th Feb'19.\n" +
                    "We were delighted with the response from the students and look forward to such organize capsules in order to boost your knowledge and evolve utterly through learning in a highly efficient way."
        }
        else if(id == "2"){
            Picasso.get().load("https://edyoda.s3.amazonaws.com/media/video-thumbnail/data-structures.jpg")
                .fit().centerCrop().placeholder(R.drawable.loadingevent).into(toolbarImg)
            eventName.text = "Seminar on Data Structures"
            eventDes.text = "We are delighted to announce that IEEE GBPEC Student Branch has successfully completed the second capsule, Understanding data structures using real life examples by Pradeep Chaudhary.\n" +
                    "We are pleased by your responses and look forward to provide more such opportunities to you!\n" +
                    "Seminar was taken by Pradeep Chaudhary, CSE"
        }
        else if(id == "3"){
            Picasso.get().load("https://d1c0rs04n1r7r4.cloudfront.net/wp-content/uploads/2018/04/10184439/HS6251-TECHNICAL-ENGLISH-2-Important-Questions-Anna-University-2013-regulation.jpg")
                .fit().centerCrop().placeholder(R.drawable.loadingevent).into(toolbarImg)
            eventName.text = "Technovenza'19"
            eventDes.text = "IEEE GBPEC STUDENT BRANCH CHAPTER brings to you the most awaited intra-college technical fest TECHNOVENZA'19\n" +
                    "\n" +
                    "Rules for the event:\n" +
                    "1.Individual participation is allowed.\n" +
                    "\n" +
                    "2.Participants are prohibited to carry any electronic device like laptop, mobiles phones to the venue.\n" +
                    "\n" +
                    "3.The questions will range from basic MCQs to fundamental coding questions.\n" +
                    "\n" +
                    "4. Cash prize and certificates will be provided to the winner and first runner up.\n" +
                    "Winner- 500/-\n" +
                    "First Runner-up- 300/-\n" +
                    "\n" +
                    "Questions will be designed in a way to target both the beginners and advance coders.\n" +
                    "\n" +
                    "No participation fee is required for the event.Hurry up for registrations since they are based on first come, first serve basis, strictly."
        }
        else if(id == "4"){
            Picasso.get().load("https://www.mindcypress.com/wp-content/uploads/2019/02/Machine-learning.jpg")
                .fit().centerCrop().placeholder(R.drawable.loadingevent).into(toolbarImg)
            eventName.text = "Seminar on Machine Learning"
            eventDes.text = "After the overwhelming response on the IEEE GBPEC Student Branch - Third Capsule, Introduction to Machine Learning and its dimensions by Shivang Singh Kaira, we would like to thank all of you for such great responses and look forward to provide more opportunities to you!" + "\n" +
                    "Seminar was taken by Shivang Singh Kaira, ECE"
        }
        else if(id == "5"){
            Picasso.get().load("https://www.careeranna.com/articles/wp-content/uploads/2016/02/placement-1.jpg")
                .fit().centerCrop().placeholder(R.drawable.loadingevent).into(toolbarImg)
            eventName.text = "Mock Placement"
            eventDes.text = "On 8th April, 2019, we conducted a Mock Placement Drive for the students of first, second and third year, consisting of different stages like Aptitude, Personal Interview and Group Discussions.\n" +
                    "\n" +
                    "The aim of the drive was to put students in a real time situation and teach them how to build resume and conduct themselves during interviews.\n"
        }
        else if(id == "6"){
            Picasso.get().load("http://newhorizonindia.edu/co-curricular/acumen/wp-content/uploads/sites/23/2016/12/8535217243404774.jpeg")
                .fit().centerCrop().placeholder(R.drawable.loadingevent).into(toolbarImg)
            eventName.text = "Guest Lecture"
            eventDes.text = "IEEE GBPEC Student Branch conducted a guest lecture on \"Micro-Doppler Radar For Detection and Tracking of Humans\" on 9th April'19.\n" +
                    "\n" +
                    "The honourable speaker for the session, Mrs. Shobha Sundar Ram is a decorated professor of electronics sector from IIIT Delhi.\n" +
                    "She worked for 3 years as a Research and Development Electrical Engineer for Baker Hughes Inc, Houston, Texas, USA & now is working as an assistant professor in IIIT Delhi since January, 2013.\n" +
                    "\n" +
                    "The Guest Lecture session was full of enthusiasm & knowledge. Students got to know about Micro-Doppler Radar and it's applications in real life, mainly detection and tracking of humans. It was an interactive session in which everyone got an opportunity to interact with the speaker so as to learn, seek and grow analytically. ✨\n"
        }
        else if(id == "7"){
            Picasso.get().load("http://aptitude.brainkart.com/media/subject/article-Programming-and-Data-qW3.jpg")
                .fit().centerCrop().placeholder(R.drawable.loadingevent).into(toolbarImg)
            eventName.text = "Let's Talk Tech"
            eventDes.text = "✨Let's Talk Tech✨\n" +
                    "\n" +
                    "IEEE is finally back with it's Capsule Sessions \uD83D\uDC4A\uD83C\uDFFB This academic year's Capsule Session was started on 3rd October with our Former Chairperson Shashank Narayan who told the students of first year about the latest technologies trend.\n" +
                    "\n" +
                    "There were great sessions by our seniors Pradeep Chaudhary, Pankaj Bhardwaj and Pradyumn Kumar Upadhyay on various topics related to the current emerging technologies.\n" +
                    "\n" +
                    "First year Techies participated in the session in a huge amount and thus, this event marked a great start to the IEEE Week. ✨"
        }
        else if (id == "8"){
            Picasso.get().load("https://getright.com.my/wp-content/uploads/2017/01/android-appr.jpg?id=6694")
                .fit().centerCrop().placeholder(R.drawable.loadingevent).into(toolbarImg)
            eventName.text = "Seminar on Android Application Development"
            eventDes.text = "IEEE GBPEC Student Branch conducted it's Second Capsule Session on \"Introduction To Android Application Development\" on 16th October, 2019 at TnP Hall, G. B. Pant Govt. Engineering College.\n" + "\n" +
                    "The speaker for the session was Abhinav Sharma, CSE 3rd year who is a trained Android Developer."
        }
        else if(id == "9"){
            Picasso.get().load("https://blog-sap.com/analytics/files/2019/04/hackathon_dreamstime_xs_137670827.jpg")
                .fit().centerCrop().placeholder(R.drawable.loadingevent).into(toolbarImg)
            eventName.text = "Online Hackathon"
            eventDes.text = "Do you feel an inclination to coding? Do you know how to code and want to test your skills? Then here's a chance to prove yourself.\n" + "\n" +
                    "IEEE GBPEC STUDENT CHAPTER organised one of the most exciting online, open-for-all, 48 hour hackathon...\n" +
                    "It was organised with the collaboration with Coding Blocks on 19th october, 2019. Theme for Online Hackathon : JOKER VS BATMAN."
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
