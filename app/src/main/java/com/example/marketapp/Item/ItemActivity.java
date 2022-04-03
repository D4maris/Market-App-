package com.example.marketapp.Item;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.marketapp.R;
import com.example.marketapp.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ItemActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[];
    int images[] = {R.drawable.adidas,R.drawable.champion, R.drawable.nike_tshirt,R.drawable.boomid
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        recyclerView = findViewById (R.id.recycler_view);

        s1 = getResources().getStringArray(R.array.products_tshirt);
        s2 = getResources().getStringArray(R.array.description);

        Itemadapter itemadapter = new Itemadapter(this, s1, s2, images);
        recyclerView.setAdapter(itemadapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}