package com.example.swoosh.Controllers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Utilities.EXTRA_LEAGUE
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view : View){

        womensLeagueButton.isChecked = false;
        coEdLeagueButton.isChecked = false;

        selectedLeague = "mens"

    }

    fun onWomensClicked(view : View){

        mensLeagueButton.isChecked = false;
        coEdLeagueButton.isChecked = false;

        selectedLeague = "womens"
    }

    fun onCoEdClicked(view: View){

        mensLeagueButton.isChecked = false
        womensLeagueButton.isChecked = false

        selectedLeague = "Co-Ed"
    }

    fun leagueNextClicked(view : View){

        if (selectedLeague != "") {
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_LEAGUE,selectedLeague)
            startActivity(skillIntent)
        }else{
            Toast.makeText(this,"Please select a league.",Toast.LENGTH_SHORT).show();
        }
    }



}