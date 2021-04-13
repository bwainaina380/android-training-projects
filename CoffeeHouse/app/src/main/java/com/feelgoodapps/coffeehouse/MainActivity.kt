package com.feelgoodapps.coffeehouse

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.feelgoodapps.coffeehouse.coffee.CoffeeDrinks

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, CoffeeDrinks("hello", "hello").drinks)
        val listDrinks: ListView = findViewById(R.id.catetories_list)
        listDrinks.setAdapter(listAdapter)

        val itemClickListener = AdapterView.OnItemClickListener() {
            fun onItemClick(listDrinks: AdapterView<*>, itemView: View, position: Int, id: Long) {
                val intent = Intent(this, CategoriesActivity::class.java)
                intent.putExtra("drinkId", id.toInt())
                startActivity(intent)
            }
        }

        listDrinks.setOnItemClickListener(itemClickListener)
    }

}