package com.example.macro5b

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class StartActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        val masuk: Button = findViewById(R.id.masuk)
        masuk.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.masuk -> {
                val intent = Intent(this@StartActivity, HomeActivity::class.java)
                startActivity(intent)
            }
        }
    }
}