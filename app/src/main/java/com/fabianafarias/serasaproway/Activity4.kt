package com.fabianafarias.serasaproway

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class Activity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)

        val value = intent.getStringExtra("Valor")
        val valueTextView: TextView = findViewById(R.id.tv_value_inserted)
        valueTextView.text = value

        val renda = intent.getStringExtra("Renda")
        val rendaTextView: TextView = findViewById(R.id.tv_renda_iserted)
        rendaTextView.text = renda

        val name = intent.getStringExtra("Nome")
        val nameTextView: TextView = findViewById(R.id.tv_name_inserted)
        nameTextView.text = name

        val birthDate = intent.getStringExtra("Data de Nascimento")
        val birthDateTextView: TextView = findViewById(R.id.tv_birth_date_inserted)
        birthDateTextView.text = birthDate

        val phoneNumber = intent.getStringExtra("Telefone")
        val phoneNumberTextView: TextView = findViewById(R.id.tv_phone_number_inserted)
        phoneNumberTextView.text = phoneNumber

        val email = intent.getStringExtra("Email")
        val emailTextView: TextView = findViewById(R.id.tv_email_inserted)
        emailTextView.text = email
    }



}