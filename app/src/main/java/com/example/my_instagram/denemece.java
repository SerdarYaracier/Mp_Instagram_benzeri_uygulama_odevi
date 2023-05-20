package com.example.my_instagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class denemece extends AppCompatActivity {


    private RecyclerView benimrcyc;
    private ArrayList<Posts>posts;
    private adaptor myadaptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denemece);

        benimrcyc=findViewById(R.id.myrcyc);
        posts=new ArrayList<>();
        myadaptor= new adaptor(posts);
        benimrcyc.setAdapter(myadaptor);
        benimrcyc.setLayoutManager(new LinearLayoutManager(this));
        myadaptor.notifyDataSetChanged();

        diziolustur();

    }

    private void diziolustur() {

        posts.add(new Posts(R.drawable.wp1,"SERDAR","ol lütfen yav"));
    }
}