package com.fabianafarias.serasaproway

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.appcompat.widget.Toolbar

class Activity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val value = intent.getStringExtra("Valor")
        val valueTextView: TextView = findViewById(R.id.tv_value_inserted)
        valueTextView.text = value

        val income = intent.getStringExtra("Renda")
        val incomeTextView: TextView = findViewById(R.id.tv_income_iserted)
        incomeTextView.text = income

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

        var btnConfirmation = findViewById<Button>(R.id.btn_confirmation)
        btnConfirmation.setOnClickListener {

            var intent = Intent(this, Activity5::class.java)
            intent.putExtra("Nome", name)
            startActivity(intent)
        }
    }

}