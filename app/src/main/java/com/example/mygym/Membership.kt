package com.example.mygym

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import com.example.mygym.R
import com.example.mygym.User
import kotlinx.android.synthetic.main.activity_membership.*

class Membership : AppCompatActivity() {

    // private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_membership)
       /*
        button = findViewById(R.id.button_send_message)
        button.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("mailto: mygym@gmail.com")
            startActivity(intent)
            Toast.makeText(this,"Thank you for joining us!", Toast.LENGTH_LONG).show()
        }
      */
        setUpSpinner()
        setUpButton()

    }

    private fun setUpSpinner() {
        val titles = arrayOf("Miss", "Mrs", "Ms", "Mr", "Mx", "Dr", "Prof")
        val titleAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, titles)
        spinner_title.adapter = titleAdapter
    }

    private fun setUpButton() {
        button_create_account.setOnClickListener {
            createAccount()
        }
    }



    private fun createAccount() {
        val user = User(
                spinner_title.selectedItem as String,
                edit_text_first_name.text.toString(),
                edit_text_last_name.text.toString(),
                edit_text_email.text.toString(),
                edit_text_phone.text.toString(),
                edit_text_password.text.toString()
        )
        val intent = Intent(this, SummaryActivity::class.java)
        intent.putExtra("User", user)
        startActivity(intent)
    }


}