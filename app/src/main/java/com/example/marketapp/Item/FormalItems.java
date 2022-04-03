package com.example.marketapp.Item;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.marketapp.Item.Itemadapter;
import com.example.marketapp.R;

public class FormalItems extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[];
    int images[] = {R.drawable.green_formal,R.drawable.white_formal, R.drawable.black_formal,R.drawable.blue_formal
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

            recyclerView = findViewById (R.id.recycler_view);

            s1 = getResources().getStringArray(R.array.products_formal);
            s2 = getResources().getStringArray(R.array.description_formal);

            Itemadapter itemadapter = new Itemadapter(this, s1, s2, images);
            recyclerView.setAdapter(itemadapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));

        }
}