package com.example.my_instagram;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adaptor extends RecyclerView.Adapter<adaptor.MyHolder> {


    private ArrayList<Posts> posts;

    public adaptor(ArrayList<Posts> posts) {
        this.posts=posts;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_xml,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.text.setText(posts.get(position).getText());
        holder.username.setText(posts.get(position).getUsername());
        holder.foto.setImageResource(posts.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder{

        TextView username, text;
        ImageView foto;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            foto=itemView.findViewById(R.id.post_image);
            username=itemView.findViewById(R.id.post_username);
            text=itemView.findViewById(R.id.post_txt);
        }
    }



}
