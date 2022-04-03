package com.example.marketapp.loginscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.os.Bundle;

import com.example.marketapp.Item.BookItem;
import com.example.marketapp.Item.ElectronicItem;
import com.example.marketapp.Item.RunningItem;
import com.example.marketapp.R;

public class Category_screen extends AppCompatActivity {

    AppCompatTextView women_clothing;
    AppCompatTextView man_clothing;
    AppCompatTextView electronic;
    AppCompatTextView books;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_screen);

        women_clothing= findViewById(R.id.women_clothing);
        man_clothing= findViewById(R.id.man_clothing);
        electronic= findViewById(R.id.electronic);
        books= findViewById(R.id.books);

        man_clothing.setOnClickListener(v -> subman());
        women_clothing.setOnClickListener(v -> subwomen());
        electronic.setOnClickListener(v -> doelectronic());
        books.setOnClickListener(v -> dobook());
    }

    private void subman() {
        Intent intent = new Intent(this, SubCategoryMan_screen.class);
        startActivity(intent);
        finish();
    }
    private void subwomen() {
        Intent intent = new Intent(this, SubCategoryWomen_screen.class);
        startActivity(intent);
        finish();
    }
    private void doelectronic() {
        Intent intent = new Intent(this, ElectronicItem.class);
        startActivity(intent);
        finish();
    }
    private void dobook() {
        Intent intent = new Intent(this, BookItem.class);
        startActivity(intent);
        finish();
    }

}