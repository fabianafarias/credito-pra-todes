package com.fabianafarias.serasaproway

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView


class Activity2 : AppCompatActivity(), AdapterView.OnItemClickListener {

    private var listView:ListView ? =null
    private var itemAdapters:ItemAdapters ? =null
    private var arrayList:ArrayList<ItemList> ? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        listView = findViewById(R.id.cardview_list_view)
        arrayList = ArrayList()
        arrayList = setDataItem()
        itemAdapters = ItemAdapters(applicationContext, arrayList!!)
        listView?.adapter = itemAdapters
        listView?.onItemClickListener = this

    }

    private fun setDataItem() :ArrayList<ItemList> {

        var listItem:ArrayList<ItemList> = ArrayList()

        listItem.add(
            ItemList(
                R.drawable.person_icon,
                "Empréstimo pessoal",
                "Defina quanto precisa, o número de parcelas e tenha dinheiro rápido com taxas diferenciadas"
            )
        )

        listItem.add(
            ItemList(
                R.drawable.car_icon,
                "Empréstimo com garantia",
                "Defina quanto precisa, o número de parcelas e use seu imóvel ou veículo para obter melhores taxas"
            )
        )

        listItem.add(
            ItemList(
                R.drawable.store_icon,
                "Empréstimo para seu negócio",
                "Defina quanto precisa, o número de parcelas e use seu negócio para obter melhores taxas"
            )
        )

        return listItem

    }


    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        var items:ItemList = arrayList?.get(position)!!
        val intent = Intent(this, Activity3::class.java)
        startActivity(intent)
    }
}