package com.example.cryptoapp

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.widget.PopupMenu
import androidx.core.widget.PopupMenuCompat
import androidx.navigation.fragment.findNavController
import com.example.cryptoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =supportFragmentManager.findFragmentById(R.id.fragment_container_view_tag)
        val navController = navHostFragment!!.findNavController()

        val popupMenu= PopupMenu(this,null)

        popupMenu.inflate(R.menu.buttom_nav_menu)
        binding.bottomBar.setupWithNavController(popupMenu.menu,navController)


    }
}