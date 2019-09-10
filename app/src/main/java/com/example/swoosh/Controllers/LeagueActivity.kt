package com.example.swoosh.Controllers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_PLAYER
import com.example.swoosh.model.Player
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {

    var player = Player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view : View){

        womensLeagueButton.isChecked = false;
        coEdLeagueButton.isChecked = false;

        player.league = "mens"

    }

    fun onWomensClicked(view : View){

        mensLeagueButton.isChecked = false;
        coEdLeagueButton.isChecked = false;

        player.league = "womens"
    }

    fun onCoEdClicked(view: View){

        mensLeagueButton.isChecked = false
        womensLeagueButton.isChecked = false

        player.league = "Co-Ed"
    }

    fun leagueNextClicked(view : View){

        if (player.league != "") {
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_PLAYER,player)
            startActivity(skillIntent)
        }else{
            Toast.makeText(this,"Please select a league.",Toast.LENGTH_SHORT).show();
        }
    }



}
