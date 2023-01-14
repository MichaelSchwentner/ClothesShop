package com.example.clothesshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.clothesshop.adapter.CategoryAdapter
import com.example.clothesshop.data.Datasource
import com.example.clothesshop.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val datasource = Datasource()
        val categoryList = datasource.getClothes()

        binding.categoryRecycler.adapter = CategoryAdapter(categoryList)
    }
}