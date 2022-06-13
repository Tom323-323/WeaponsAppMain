package com.tomaslab.app.presenter


import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.tomaslab.app.R
import com.tomaslab.app.R.id.fragmentMainMenu
import com.tomaslab.app.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        viewGone ()
        setContentView(binding.root)
    }


//    override fun onBackPressed() {
//        val currentFragment = supportFragmentManager.findFragmentById(R.id.fragment_container)?.javaClass?.simpleName
//
//        if(currentFragment == supportFragmentManager.findFragmentById(R.id.frag)?.javaClass?.simpleName){
//            finishAffinity()
//            Toast.makeText(this, "finish", Toast.LENGTH_SHORT).show()
//        }else{
//            supportFragmentManager.popBackStack()
//            Toast.makeText(this, "back", Toast.LENGTH_SHORT).show()
//        }
//    }

    // Full screen
    private fun viewGone(){
        val decorView: View = window.decorView
        val uiOptions: Int = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)
        decorView.systemUiVisibility = uiOptions
    }
}