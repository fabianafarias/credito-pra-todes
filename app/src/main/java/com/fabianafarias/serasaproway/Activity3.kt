package com.fabianafarias.serasaproway

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.widget.Toolbar
import br.com.sapereaude
.maskedEditText
.MaskedEditText;

class Activity3 : AppCompatActivity() {
    lateinit var btnSimulation:Button
    lateinit var valueEditText: MaskedEditText
    lateinit var rendaEditText: MaskedEditText
    lateinit var nameEditText: EditText
    lateinit var birthDateEditText: MaskedEditText
    lateinit var emailEditText: EditText
    lateinit var phoneNumberEditText: MaskedEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var valueEditText = findViewById<MaskedEditText>(R.id.et_value)
        var rendaEditText = findViewById<MaskedEditText>(R.id.et_renda)
        var nameEditText = findViewById<EditText>(R.id.et_name)
        var birthDateEditText = findViewById<MaskedEditText>(R.id.et_birth_date)
        var phoneNumberEditText= findViewById<MaskedEditText>(R.id.et_phone_number)
        var emailEditText = findViewById<EditText>(R.id.et_email)
        var btnSimulation = findViewById<Button>(R.id.btn_simulation)

        btnSimulation.setOnClickListener {

            val intent = Intent(this, Activity4::class.java)

            val value = valueEditText.text.toString()
            val renda = rendaEditText.text.toString()
            val name = nameEditText.text.toString()
            val birthDate = birthDateEditText.text.toString()
            val phoneNumber = phoneNumberEditText.text.toString()
            val email = emailEditText.text.toString()

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

