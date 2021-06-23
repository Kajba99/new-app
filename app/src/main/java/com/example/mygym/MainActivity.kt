package com.example.mygym

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.lifecycle.lifecycleScope
import com.example.mygym.CalisthenicsGroups.UvodCalisthenics
import com.example.mygym.GymGroups.UvodGym
import com.example.mygym.entities.Director
import com.example.mygym.entities.Gym
import com.example.mygym.entities.Member
import com.example.mygym.entities.Type
import com.example.mygym.entities.relation.MemberTypeCrossRef
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var textmain: TextView
    private lateinit var cardViewStopwatch: CardView
    private lateinit var cardViewFitness: CardView
    private lateinit var cardViewCalisthenics: CardView
    private lateinit var cardViewMembership: CardView
    private lateinit var cardViewQuotes: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpListeners()

        val dao = GymDatabase.getInstance(this).gyymDao

        val directors = listOf(
            Director("Mike Litoris", "East"),
            Director("Jack Goff", "South"),
            Director("Chris P. Chicken", "Main")
        )
        val gyms = listOf(
            Gym("East"),
            Gym("South"),
            Gym("Main")
        )
        val types = listOf(
            Type("Fitness"),
            Type("Calisthenics"),
            Type("Pilates"),
            Type("Flexibility"),
            Type("Endurance")
        )
        val members = listOf(
            Member("Beff Jezos", 2012, "South"),
            Member("Beff Mezos", 2014, "East"),
            Member("Jeff Jezos", 2019, "South"),
            Member("Keff Jzos", 2017, "East"),
            Member("Mark Suckerberg", 2012, "Main"),
            Member("Gill Bates", 2019, "Main"),
            Member("Donny Jepp", 2020, "South"),
            Member("Hom Tanks", 2019, "East"),
            Member("Tom Banks", 2015, "East")
        )
        val memberTypeRelations = listOf(
            MemberTypeCrossRef("Beff Jezos", "Fitness"),
            MemberTypeCrossRef("Beff Mezos", "Calisthenics"),
            MemberTypeCrossRef("Jeff Jezos", "Endurance"),
            MemberTypeCrossRef("Keff Jzos", "Fitness"),
            MemberTypeCrossRef("Mark Suckerberg", "Flexibility"),
            MemberTypeCrossRef("Gill Bates", "Calisthenics"),
            MemberTypeCrossRef("Donny Jepp", "Endurance"),
            MemberTypeCrossRef("Hom Tanks", "Fitness"),
            MemberTypeCrossRef("Tom Banks", "Flexibility")
        )
        lifecycleScope.launch {
            directors.forEach { dao.insertDirector(it) }
            gyms.forEach { dao.insertGym(it) }
            types.forEach { dao.insertType(it) }
            members.forEach { dao.insertMember(it) }
            memberTypeRelations.forEach { dao.insertMemberTypeCrossRef(it) }

        }

    }


    private fun setUpListeners() {
        textmain = findViewById(R.id.text_view_main)
        cardViewCalisthenics = findViewById(R.id.card_view_street)
        cardViewFitness = findViewById(R.id.card_view_fitness)
        cardViewStopwatch = findViewById(R.id.card_view_stopwatch)
        cardViewMembership = findViewById(R.id.card_view_membership)
        cardViewQuotes = findViewById(R.id.card_view_quote)


        cardViewCalisthenics.setOnClickListener {
            val intent = Intent(this, UvodCalisthenics::class.java)
            startActivity(intent)
        }
        cardViewFitness.setOnClickListener {
            val intent = Intent(this, UvodGym::class.java)
            startActivity(intent)
        }
        cardViewStopwatch.setOnClickListener {
            val intent = Intent(this, Stopwatch::class.java)
            startActivity(intent)
        }

        cardViewMembership.setOnClickListener {
            val intent = Intent(this, Membership::class.java)
            startActivity(intent)
        }

        cardViewQuotes.setOnClickListener {
            val intent = Intent(this, Motivation::class.java)
            startActivity(intent)
        }

    }

    fun onNext(view: View) {}


}