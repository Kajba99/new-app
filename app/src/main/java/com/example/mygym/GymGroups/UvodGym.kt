package com.example.mygym.GymGroups

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.example.mygym.R

class UvodGym : AppCompatActivity() {
    private lateinit var text: TextView
    private lateinit var cardViewChest : CardView
    private lateinit var cardViewBack : CardView
    private lateinit var cardViewLegs : CardView
    private lateinit var cardViewAbs : CardView
    private lateinit var cardViewShoulder : CardView
    private lateinit var cardViewArms : CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uvod_gym)
        setUpListeners()
    }



    private fun setUpListeners() {
        text = findViewById(R.id.text_view_groups)
        cardViewChest = findViewById(R.id.card_view_chest)
        cardViewBack = findViewById(R.id.card_view_back)
        cardViewLegs = findViewById(R.id.card_view_legs)
        cardViewAbs = findViewById(R.id.card_view_abs)
        cardViewShoulder = findViewById(R.id.card_view_shoulder)
        cardViewArms = findViewById(R.id.card_view_arms)




        cardViewChest.setOnClickListener {
            val intent = Intent(this, GymChest::class.java )
            startActivity(intent)
        }
        cardViewBack.setOnClickListener {
            val intent = Intent(this, GymBack::class.java )
            startActivity(intent)
        }
        cardViewLegs.setOnClickListener {
            val intent = Intent(this, GymLegs::class.java )
            startActivity(intent)
        }
        cardViewAbs.setOnClickListener {
            val intent = Intent(this, GymAbs::class.java )
            startActivity(intent)
        }

        cardViewShoulder.setOnClickListener {
            val intent = Intent(this, GymShoulders::class.java)
            startActivity(intent)
        }

        cardViewArms.setOnClickListener {
            val intent = Intent(this, GymArms::class.java)
            startActivity(intent)
        }




    }

}
