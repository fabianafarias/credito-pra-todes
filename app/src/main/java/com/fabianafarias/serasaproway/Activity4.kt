package com.fabianafarias.serasaproway

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class Activity4 : AppCompatActivity(), AdapterView.OnItemClickListener  {

    private var listView2:ListView ? =null
    private var itemAdapters2:ItemAdapters2 ? =null
    private var arrayList2:ArrayList<ItemList2> ? =null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)

        listView2 = findViewById(R.id.cardview_list_view)
        arrayList2 = ArrayList()
        arrayList2 = setDataItem2()
        itemAdapters2 = ItemAdapters2(applicationContext, arrayList2!!)
        listView2?.adapter = itemAdapters2
        listView2?.onItemClickListener = this

    }

    private fun setDataItem2() : ArrayList<ItemList2> {

        var listItem2:ArrayList<ItemList2> = ArrayList()

        listItem2.add(
            ItemList2(

                "Nome completo:",
                null
            )
        )

        listItem2.add(
            ItemList2(

                "Data de nascimento:",
                null
            )
        )

        listItem2.add(
            ItemList2(

                "Renda mensal:",
                null
            )
        )

        listItem2.add(
            ItemList2(

                "Valor solicitado:",
                null
            )
        )

        listItem2.add(
            ItemList2(

                "Email:",
                null
            )
        )

        listItem2.add(
            ItemList2(

                "Telefone:",
                null
            )
        )

        return listItem2

    }


    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        var items2:ItemList2 = arrayList2?.get(position)!!
        val intent2 = Intent(this, Activity4::class.java)
        startActivity(intent2)
    }
}