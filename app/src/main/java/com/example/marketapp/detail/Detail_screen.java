package com.example.marketapp.detail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.marketapp.R;

public class Detail_screen extends AppCompatActivity {

    AppCompatImageView mainImageView_detail;
    AppCompatTextView title_detail;
    AppCompatTextView description_detail;

    String data1, data2;
    int myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_screen);

        mainImageView_detail = findViewById(R.id.mainImageView_detail);
        title_detail = findViewById(R.id.title_detail);
        description_detail = findViewById(R.id.description_detail);

        getData();
        setData();

    }

    private void getData(){
        if(getIntent().hasExtra("myImage") && getIntent().hasExtra("data1")&& getIntent().hasExtra("data2")){

            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            myImage = getIntent().getIntExtra("myImage", 1);

        }else{
            Toast.makeText(this, "No data", Toast.LENGTH_SHORT).show();
        }
    }
    private void setData(){
        title_detail.setText(data1);
        description_detail.setText(data2);
        mainImageView_detail.setImageResource(myImage);

    }
}