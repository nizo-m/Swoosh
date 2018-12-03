package com.example.nizar.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.example.nizar.swoosh.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        get_started_button.setOnClickListener {
            val leagueInt = Intent(this, LeagueActivity::class.java)
            startActivity(leagueInt)
        }

    }
}
