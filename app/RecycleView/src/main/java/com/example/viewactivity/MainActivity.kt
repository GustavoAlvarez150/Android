package com.example.viewactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.viewactivity.adapter.SuperHeroAdapter
import com.example.viewactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()
    }

    private fun initRecyclerView(){
        val manager = LinearLayoutManager(this)
        val decoration = DividerItemDecoration(this, manager.orientation)
        val recyclerView =  findViewById<RecyclerView>(R.id.recycleViewSuperHeroe)
        binding.recycleViewSuperHeroe.layoutManager = LinearLayoutManager(this)
        binding.recycleViewSuperHeroe.adapter = SuperHeroAdapter(SuperHeroes.listHeroe,{Movie ->onItemSelected(Movie)})
        binding.recycleViewSuperHeroe.addItemDecoration(decoration)
    }

    fun onItemSelected(superHeore: Movie){
    Toast.makeText(this, superHeore.superHeroe, Toast.LENGTH_SHORT).show()
    }

}