package com.best.a55k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.best.a55k.Adapter.AdapterClass
import com.best.a55k.Module.User

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        open()
        val user = getData()
        refreshIt(user)
    }
    private fun open() {
        recyclerView = findViewById(R.id.recyclerviewM)
        recyclerView.layoutManager = GridLayoutManager(this,1)
    }
    private fun refreshIt(list: ArrayList<User>) {
        val adapter = AdapterClass(list)
        recyclerView.adapter = adapter
    }
    private fun getData(): ArrayList<User> {
        val user = ArrayList<User>()
               // user.add(User("Alisher is ", true))
                user.add(User("Abbos ", false))
        return user
    }
}