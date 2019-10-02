package com.example.ieeegbpec.Activities

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import com.google.android.material.navigation.NavigationView
import androidx.core.view.GravityCompat
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.example.ieeegbpec.Fragments.*
import com.example.ieeegbpec.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

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

        nav_view.setNavigationItemSelectedListener(this)

        val fragment = HomeFragment()
        val fragmentManager = supportFragmentManager
        val ft = fragmentManager.beginTransaction()
        ft.replace(R.id.screen_area, fragment)
        ft.commit()
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
        return when (item.itemId) {
            R.id.action_feedback -> {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com")))
                true
            }
            R.id.action_rateus -> {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com")))
                true
            }
            else ->
                super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        var fragment : Fragment? = null
        when (item.itemId) {
            R.id.nav_home -> {
                fragment = HomeFragment()
            }
            R.id.nav_events -> {
                fragment = EventsFragment()
            }
            R.id.nav_achievements -> {
                fragment = AchievementsFragment()
            }
            R.id.nav_projects -> {
                fragment = ProjectsFragment()
            }
            R.id.nav_ieee -> {
                fragment = IEEEFragment()
            }
            R.id.nav_joinieee -> {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ieee.org/membership/join/index.html?WT.mc_id=hc_join")))
            }
            R.id.nav_team -> {
                startActivity(Intent(this@MainActivity, TeamActivity::class.java))
            }
            R.id.nav_aboutApp -> {
                startActivity(Intent(this@MainActivity, AboutActivity::class.java))
            }
        }

        if(fragment != null) {
            val fragmentManager = supportFragmentManager
            val ft = fragmentManager.beginTransaction()

            ft.replace(R.id.screen_area, fragment)
            ft.commit()
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
