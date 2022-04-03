package com.example.marketapp.loginscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.os.Bundle;

import com.example.marketapp.Item.ItemActivity;
import com.example.marketapp.Item.JeansItem;
import com.example.marketapp.Item.ShoesItem;
import com.example.marketapp.R;
import com.example.marketapp.Item.FormalItems;

public class SubCategoryMan_screen extends AppCompatActivity {

    AppCompatTextView tshirt;
    AppCompatTextView formal;
    AppCompatTextView jeans;
    AppCompatTextView shoes;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_category_man_screen);


        tshirt= findViewById(R.id.tshirt);
        formal= findViewById(R.id.formal);
        jeans= findViewById(R.id.jeans);
        shoes= findViewById(R.id.shoes);


        tshirt.setOnClickListener(v -> doitemtshirt());
        formal.setOnClickListener(v -> doitemformal());
        jeans.setOnClickListener(v -> doitemjeans());
        shoes.setOnClickListener(v -> doitemshoes());
    }

    private void doitemtshirt() {
        Intent intent = new Intent(this,ItemActivity.class);
        startActivity(intent);
        finish();
    }
    private void doitemformal() {
        Intent intent = new Intent(this, FormalItems.class);
        startActivity(intent);
        finish();
    }
    private void doitemjeans() {
        Intent intent = new Intent(this, JeansItem.class);
        startActivity(intent);
        finish();
    }
    private void doitemshoes() {
        Intent intent = new Intent(this, ShoesItem.class);
        startActivity(intent);
        finish();
    }
}