package com.example.vaishnavi.kotlintest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //set recycler view
        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        //adding layout manager
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayout.VERTICAL, false)

        //create arratlist
        val users = ArrayList<User>()

        //adding users
        users.add(User("Leonard hofstader", "New Jersey"))
        users.add(User("Sheldon Cooper","Texas"))
        users.add(User("penny","nebraska"))
        users.add(User("Raj koothrapalli","new delhi"))

        //create adapter
        val adapters = CustomAdapter(users)

        //adding adapter to recyclerview
        recyclerView.adapter  = adapters

    }

}
