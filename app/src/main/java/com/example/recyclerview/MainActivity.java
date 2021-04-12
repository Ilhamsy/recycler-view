package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvFood;
    private ArrayList<FoodModel> listFood = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFood = findViewById(R.id.rv_food_list);
        rvFood.setHasFixedSize(true);
        listFood.addAll(FoodData.getListData());

        showRecycleList();
    }

    private void showRecycleList() {
        rvFood.setLayoutManager(new LinearLayoutManager(this));
        FoodAdapter foodAdapter = new FoodAdapter(this);
        foodAdapter.setFoodModels(listFood);
        rvFood.setAdapter(foodAdapter);
    }
}