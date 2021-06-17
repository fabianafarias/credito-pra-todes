package com.fabianafarias.serasaproway

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class ItemAdapters2(var context: Context, var arrayList2: ArrayList<ItemList2>) :  BaseAdapter(){

    override fun getItem(position: Int): Any {
        return arrayList2.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return arrayList2.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = View.inflate(context, R.layout.card_view_item_layout_list2, null)


        var title:TextView = view.findViewById(R.id.tv_title_label)
        var value:TextView= view.findViewById(R.id.tv_value_label)

        var items:ItemList2 = arrayList2.get(position)

        title.text = items.title
        value.text = items.value

        return view!!
    }

}