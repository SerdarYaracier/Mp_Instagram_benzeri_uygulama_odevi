package com.example.my_instagram;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;


public class home_frag extends  Fragment {

private  RecyclerView benimrcyc;
private  ArrayList<Posts>posts;
private adaptor myadaptor;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_frag, container, false);

        posts=new ArrayList<>();


        benimrcyc=view.findViewById(R.id.myrcyc);
        myadaptor= new adaptor(posts);
        benimrcyc.setAdapter(myadaptor);
        benimrcyc.setLayoutManager(new LinearLayoutManager(getContext()));


        posts.add(new Posts(R.drawable.adana_post, "Adanam","Güzel Adanamızından bir kare"));
        posts.add(new Posts(R.drawable.hotd_post, "DiziciBirey","Yılın fenomen dizisi House of the Dragon reyting rekorları kırmaya devam ediyor"));
        posts.add(new Posts(R.drawable.wot_post, "Dizitist","Olmamış bir dizi: Wheel of Time"));
        posts.add(new Posts(R.drawable.hava_durumu, "Adananın_Havası","İşte önümüzdeki günler için hava durumu"));
        posts.add(new Posts(R.drawable.wp5, "Serdar","oldu mu acaba"));

        return view;
    }




}