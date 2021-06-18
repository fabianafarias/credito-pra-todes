package com.fabianafarias.serasaproway

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.util.*

class Activity3 : AppCompatActivity() {
    lateinit var btnSimulation:Button
    lateinit var valueEditText: EditText
    lateinit var rendaEditText: EditText
    lateinit var nameEditText: EditText
    lateinit var birthDateEditText: EditText
    lateinit var phoneNumberEditText: EditText
    lateinit var emailEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        var valueEditText = findViewById<EditText>(R.id.et_value)
        var rendaEditText = findViewById<EditText>(R.id.et_renda)
        var nameEditText = findViewById<EditText>(R.id.et_name)
        var birthDateEditText = findViewById<EditText>(R.id.et_birth_date)

        //Calendar
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        birthDateEditText.setOnClickListener {

            val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                // Display Selected date in TextView
                birthDateEditText.setText("" + dayOfMonth + "/" + month + "/" + year)
            }, year, month, day)
            dpd.show()

        var phoneNumberEditText= findViewById<EditText>(R.id.et_phone_number)
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
}
