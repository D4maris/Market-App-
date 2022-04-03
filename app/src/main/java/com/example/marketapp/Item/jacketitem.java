package com.example.marketapp.Item;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.marketapp.R;

public class jacketitem extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[];
    int images[] = {R.drawable.adidas,R.drawable.white_formal, R.drawable.nike_tshirt,R.drawable.black_formal
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        recyclerView = findViewById (R.id.recycler_view);

        s1 = getResources().getStringArray(R.array.products_jeans);
        s2 = getResources().getStringArray(R.array.description_jeans);

        Itemadapter itemadapter = new Itemadapter(this, s1, s2, images);
        recyclerView.setAdapter(itemadapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}

