package com.example.ieeegbpec.Activities

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.core.view.GravityCompat
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.FragmentTransaction
import com.example.ieeegbpec.Fragments.EventsFragment
import com.example.ieeegbpec.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        //Picasso.get().load("https://upload.wikimedia.org/wikipedia/en/thumb/2/21/IEEE_logo.svg/1200px-IEEE_logo.svg.png").fit().centerCrop().into(ieeelogo)
        Picasso.get().load("http://prankster101.com/newsite/wp-content/uploads/event-icon.png").fit().centerCrop().into(icon_events)
        Picasso.get().load("https://www.trzcacak.rs/myfile/full/197-1972262_carriers-win-big-with-uncrash-success-flat-icon.png").fit().centerCrop().into(icon_achievements)
        Picasso.get().load("https://icon-library.net/images/projects-icon/projects-icon-3.jpg").fit().centerCrop().into(icon_projects)
        Picasso.get().load("http://sites.ieee.org/sb-wayne/files/2016/03/cropped-IEEE-Icon.png").fit().centerCrop().into(icon_ieee)
        Picasso.get().load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQTbfX3jgJQqDlMevbu0QLHWXdPPiXZ1WXNuzIyld8a4S0eNp9W7g").fit().centerCrop().into(icon_resources)

        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        val ft :FragmentTransaction = supportFragmentManager.beginTransaction()
        when (item.itemId) {
            R.id.nav_home -> {

            }
            R.id.nav_events -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, EventsFragment())
                    .commit()
            }
            R.id.nav_achievements -> {

            }
            R.id.nav_projects -> {

            }
            R.id.nav_ieee -> {

            }
            R.id.nav_joinieee -> {
                val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ieee.org/membership/join/index.html?WT.mc_id=hc_join"))
                startActivity(i)
            }
            R.id.nav_team -> {

            }
            R.id.nav_aboutApp -> {

            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
