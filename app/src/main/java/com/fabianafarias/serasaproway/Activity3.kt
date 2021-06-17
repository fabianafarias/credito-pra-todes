package com.fabianafarias.serasaproway

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        var etValue = findViewById<EditText>(R.id.et_value)
        var etRenda = findViewById<EditText>(R.id.et_renda)
        var etName = findViewById<EditText>(R.id.et_name)
        var etBirthDate = findViewById<EditText>(R.id.et_birth_date)
        var etPhoneNumber = findViewById<EditText>(R.id.et_phone_number)
        var etEmail = findViewById<EditText>(R.id.et_email)
        var btnSimulation = findViewById<Button>(R.id.btn_simulation)

        btnSimulation.setOnClickListener {

            val intent = Intent(this, Activity4::class.java)

            val value = etValue.text
            val renda = etRenda.text
            val name = etName.text
            val birthDate = etBirthDate.text
            val phoneNumber = etPhoneNumber.text
            val email = etEmail.text

            intent.putExtra("Valor", value)
            intent.putExtra("Renda", renda)
            intent.putExtra("Nome", name)
            intent.putExtra("Data de Nascimento", birthDate)
            intent.putExtra("Telefone", phoneNumber)
            intent.putExtra("Email", email)

            startActivity(intent)
        }
    }
}