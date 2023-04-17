package com.marshanda.latihanrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.marshanda.latihanrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var adapter : MyContactAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listStudent = arrayListOf(
            MyContact("10117101", "Muhammad Rizqi Ramadhan", "081234567890"),
            MyContact("10117102", "Rizqi Ramadhan", "081234567890"),
            MyContact("10117103", "Muhammad Rizqi", "081234567890"),
            MyContact("20102020", "Marshanda Raihan", "0893456789"),
            MyContact("20102013", "Maharani Dian", "086372615876"),
            MyContact("20124567", "Dian Anggraeni", "087526371826"),
            MyContact("10117101", "Muhammad Rizqi Ramadhan", "081234567890"),
            MyContact("10117102", "Rizqi Ramadhan", "081234567890"),
            MyContact("10117103", "Muhammad Rizqi", "081234567890"),
            MyContact("20102020", "Marshanda Raihan", "0893456789"),
            MyContact("20102013", "Maharani Dian", "086372615876"),
            MyContact("20124567", "Dian Anggraeni", "087526371826"),
            MyContact("10117101", "Muhammad Rizqi Ramadhan", "081234567890"),
            MyContact("10117102", "Rizqi Ramadhan", "081234567890"),
            MyContact("10117103", "Muhammad Rizqi", "081234567890"),
            MyContact("20102020", "Marshanda Raihan", "0893456789"),
            MyContact("20102013", "Maharani Dian", "086372615876"),
            MyContact("20124567", "Dian Anggraeni", "087526371826"),
            MyContact("10117101", "Muhammad Rizqi Ramadhan", "081234567890"),
            MyContact("10117102", "Rizqi Ramadhan", "081234567890"),
            MyContact("10117103", "Muhammad Rizqi", "081234567890"),
            MyContact("20102020", "Marshanda Raihan", "0893456789"),
            MyContact("20102013", "Maharani Dian", "086372615876"),
            MyContact("20124567", "Dian Anggraeni", "087526371826"),
            MyContact("10117101", "Muhammad Rizqi Ramadhan", "081234567890"),
            MyContact("10117102", "Rizqi Ramadhan", "081234567890"),
            MyContact("10117103", "Muhammad Rizqi", "081234567890"),
            MyContact("20102020", "Marshanda Raihan", "0893456789"),
            MyContact("20102013", "Maharani Dian", "086372615876"),
            MyContact("20124567", "Dian Anggraeni", "087526371826"),
        )
        adapter = MyContactAdapter(listStudent)

        val layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }
}