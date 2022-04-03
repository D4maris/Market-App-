package com.example.marketapp.Item;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.marketapp.R;
import com.example.marketapp.detail.Detail_screen;

public class Itemadapter extends RecyclerView.Adapter<Itemadapter.ItemViewHolder>{

    String data1[], data2[];
    int images[];
    Context context;

    public Itemadapter(Context ct,String s1[], String s2[], int img[]){
        context = ct;
        data1 = s1;
        data2 = s2;
        images = img;

    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.view_item, parent,false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, final int position) {
        holder.ui_view_item_title.setText(data1[position]);
        holder.ui_view_item_description.setText(data2[position]);
        holder.ui_view_item_image.setImageResource(images[position]);

        holder.mainlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Detail_screen.class);
                intent.putExtra("data1",data1[position]);
                intent.putExtra("data2",data2[position]);
                intent.putExtra("myImage",images[position]);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {

        return images.length;
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {

        AppCompatImageView ui_view_item_image;
        AppCompatTextView ui_view_item_title,ui_view_item_description;
        ConstraintLayout mainlayout;

        public ItemViewHolder(@NonNull View itemview){
            super (itemview);
            ui_view_item_title = itemview.findViewById(R.id.ui_view_item_title);
            ui_view_item_description = itemview.findViewById(R.id.ui_view_item_description);
            ui_view_item_image = itemview.findViewById(R.id.ui_view_item_image);
            mainlayout = itemview.findViewById(R.id.mainlayout);
        }
    }
}
