package com.example.nizar.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.nizar.swoosh.Model.Player
//import com.example.nizar.swoosh.Utilities.EXTRA_LEAGUE
import com.example.nizar.swoosh.R
import com.example.nizar.swoosh.Utilities.EXTRA_PLAYER
//import com.example.nizar.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill_.*

class Skill_Activity : BaseActivity() {

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill_)
        player= intent.getParcelableExtra(EXTRA_PLAYER)

    }


    fun begBtnClick(view: View){
        ballerBtn.isChecked=false
        player.skill="begenner"
    }

    fun balBtnClick(view: View){
        begginnerBtn.isChecked=false
        player.skill="baller"
    }

    fun finishClick(view: View){
        if(player.skill != ""){
        val finishIntent = Intent(this,FinalActivity::class.java)
            finishIntent.putExtra(EXTRA_PLAYER,player)
            startActivity(finishIntent)
        }else
            Toast.makeText(this,"please select a level",Toast.LENGTH_LONG).show()

    }

}
