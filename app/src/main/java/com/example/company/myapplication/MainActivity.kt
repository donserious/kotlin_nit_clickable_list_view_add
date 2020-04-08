package com.example.company.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataArray = mutableListOf<String>("0","1","4","9","16","25","36","49","64","81","100")
        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataArray)
        listView.adapter = adapter

        listView.setOnItemClickListener() { _: AdapterView<*>, view: View, i: Int, l: Long ->
            dataArray.add(dataArray[i])
            adapter.notifyDataSetChanged()
        }
    }
}
