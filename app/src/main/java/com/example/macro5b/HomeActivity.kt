package com.example.macro5b

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class HomeActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val nonemergency: ImageView = findViewById(R.id.nonemergency)
        nonemergency.setOnClickListener(this)

        val emergency: ImageView = findViewById(R.id.emergency)
        emergency.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.nonemergency -> {
                val intent = Intent(this@HomeActivity, NonemergencyActivity::class.java)
                startActivity(intent)
            }
            R.id.emergency -> {
                val intent = Intent(this@HomeActivity, EmergencyActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
