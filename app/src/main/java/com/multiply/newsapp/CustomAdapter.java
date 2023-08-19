package com.multiply.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.multiply.newsapp.models.NewsHeadlines;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<customviewholder> {
    private  Context context;
    private List<NewsHeadlines> headlines;
    private SelectListener Listener;

    public CustomAdapter(Context context, List<NewsHeadlines> headlines,SelectListener listener) {
        this.context = context;
        this.headlines = headlines;
        this.Listener=listener;
    }

    @NonNull
    @Override
    public customviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new customviewholder(LayoutInflater.from(context).inflate(R.layout.headline_list_items,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull customviewholder holder, int position) {
         holder.text_title.setText(headlines.get(position).getTitle());
         holder.text_source.setText(headlines.get(position).getSource().getName());

         if(headlines.get(position).getUrlToImage()!=null){
             Picasso.get().load(headlines.get(position).getUrlToImage()).into(holder.img_headline);
         }

         holder.cardView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
               Listener.OnNewsClicked(headlines.get(position));
             }
         });
    }

    @Override
    public int getItemCount() {
        return headlines.size();
    }
}

