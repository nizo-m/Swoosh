package com.example.nizar.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.nizar.swoosh.Model.Player
//import com.example.nizar.swoosh.Utilities.EXTRA_LEAGUE
import com.example.nizar.swoosh.R
import com.example.nizar.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""
    var player= Player("","")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }


    fun menOnClick(view: View){
        WomanBtn.isChecked =false
        coBtn.isChecked= false
        player.league="Mens"
    }

    fun WmnOnClick(view: View){
        mensBtn.isChecked =false
        coBtn.isChecked= false
        player.league="Womans"
    }

    fun coOnClick(view: View){
        WomanBtn.isChecked =false
        mensBtn.isChecked= false
        player.league="Co"
    }

    fun leagueNextClicked(view: View){
        if(player.league != ""){
            val skillIntent = Intent(this, Skill_Activity::class.java)
            skillIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(skillIntent)
        }else{
            Toast.makeText(this,"Pleasse select a league",Toast.LENGTH_SHORT).show()
        }

    }
}
