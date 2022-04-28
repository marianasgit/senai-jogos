package com.example.senaijogos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.concurrent.schedule

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Timer().schedule(2000) {abrirHomePage()}
    }

    private fun abrirHomePage() {

        val intent = Intent(this, HomePage::class.java)
        startActivity(intent)
        finish()
    }


}