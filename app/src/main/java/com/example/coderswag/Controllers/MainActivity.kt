package com.example.coderswag.Controllers

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.Models.Category
import com.example.coderswag.R
import com.example.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: RecyclerView.Adapter <RecyclerView.ViewHolder>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = RecyclerView.Adapter<RecyclerView.ViewHolder(this, )/*ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            DataService.categories)*/

        categoryRecyclerView.adapter = adapter
    }
}
