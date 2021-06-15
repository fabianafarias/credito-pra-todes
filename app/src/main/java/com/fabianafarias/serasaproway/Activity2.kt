package com.fabianafarias.serasaproway

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast


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
                R.drawable.ic_baseline_attach_money_24,
                "Empréstimo pessoal",
                "Defina quanto precisa, o número de parcelas e tenha dinheiro rápido com taxas diferenciadas"
            )
        )

        listItem.add(
            ItemList(
                R.drawable.ic_baseline_home_24,
                "Empréstimo com garantia",
                "Defina quanto precisa, o número de parcelas e use seu imóvel ou veículo para obter melhores taxas"
            )
        )

        listItem.add(
            ItemList(
                R.drawable.ic_baseline_attach_money_24,
                "Empréstimo para seu negócio",
                "Defina quanto precisa, o número de parcelas e use seu negócio para obter melhores taxas"
            )
        )

        return listItem

    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        var items:ItemList = arrayList?.get(position)!!
        Toast.makeText(applicationContext, items.title, Toast.LENGTH_LONG).show()
    }
}