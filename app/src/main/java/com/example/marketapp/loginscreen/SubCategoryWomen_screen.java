package com.example.marketapp.loginscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.os.Bundle;

import com.example.marketapp.Item.FormalItems;
import com.example.marketapp.Item.ItemActivity;
import com.example.marketapp.Item.JeansItem;
import com.example.marketapp.Item.ShoesItem;
import com.example.marketapp.R;

public class SubCategoryWomen_screen extends AppCompatActivity {


    AppCompatTextView dress;
    AppCompatTextView jacket;
    AppCompatTextView legging;
    AppCompatTextView running_shoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_category_women_screen);


        dress= findViewById(R.id.dress);
        jacket= findViewById(R.id.jacket);
        legging= findViewById(R.id.legging);
        running_shoes= findViewById(R.id.running_shoes);


        dress.setOnClickListener(v -> dodress());
        jacket.setOnClickListener(v -> doitemjacket());
        legging.setOnClickListener(v -> doitemlegging());
        running_shoes.setOnClickListener(v -> doitemshoesrun());
    }
    private void dodress() {
        Intent intent = new Intent(this, ItemActivity.class);
        startActivity(intent);
        finish();
    }
    private void doitemjacket() {
        Intent intent = new Intent(this, FormalItems.class);
        startActivity(intent);
        finish();
    }
    private void doitemlegging() {
        Intent intent = new Intent(this, JeansItem.class);
        startActivity(intent);
        finish();
    }
    private void doitemshoesrun() {
        Intent intent = new Intent(this, ShoesItem.class);
        startActivity(intent);
        finish();
    }
}