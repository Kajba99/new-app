package com.example.mygym.CalisthenicsGroups

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.example.mygym.R

class UvodCalisthenics : AppCompatActivity() { private lateinit var text2: TextView
    private lateinit var cardViewChest2 : CardView
    private lateinit var cardViewBack2 : CardView
    private lateinit var cardViewLegs2 : CardView
    private lateinit var cardViewAbs2 : CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uvod_calisthenics)
        setUpListeners()
    }



    private fun setUpListeners() {
        text2 = findViewById(R.id.text_view_groups2)
        cardViewChest2 = findViewById(R.id.card_view_chest2)
        cardViewBack2 = findViewById(R.id.card_view_back2)
        cardViewLegs2 = findViewById(R.id.card_view_legs2)
        cardViewAbs2 = findViewById(R.id.card_view_abs2)




        cardViewChest2.setOnClickListener {
            val intent = Intent(this, CalisthenicsChest::class.java)
            startActivity(intent)
        }

        cardViewBack2.setOnClickListener {
            val intent = Intent(this, CalisthenicsBack::class.java)
            startActivity(intent)
        }
        cardViewLegs2.setOnClickListener {
            val intent = Intent(this, CalisthenicsLegs::class.java)
            startActivity(intent)
        }
        cardViewAbs2.setOnClickListener {
            val intent = Intent(this, CalisthenicsAbs::class.java)
            startActivity(intent)
        }




    }

}