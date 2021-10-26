package edu.bo.ucb.bottomnavapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val principal_bottom_navigation_view = findViewById(R.id.principal_bottom_navigation_menu) as BottomNavigationView
        principal_bottom_navigation_view.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home_bottom_navigation_menu -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.principal_frame_layout, HomeFragment())
                        .commit()
                    true
                }
                R.id.profile_bottom_navigation_menu -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.principal_frame_layout, ProfileFragment())
                        .commit()
                    true
                }
                else -> true
            }
        }
    }
}