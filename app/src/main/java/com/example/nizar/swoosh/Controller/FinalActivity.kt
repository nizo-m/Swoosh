package com.example.nizar.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.nizar.swoosh.Model.Player
import com.example.nizar.swoosh.R
import com.example.nizar.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_final.*

class FinalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        val player =intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeagueText.text= "Looking for ${player.league}, ${player.skill} league near you..."

    }
}
