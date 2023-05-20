package com.example.my_instagram;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Trend_frag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Trend_frag extends Fragment {

    private RecyclerView benimrcyc2;
    private ArrayList<Posts> posts;
    private adaptor myadaptor;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Trend_frag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Trend_frag.
     */
    // TODO: Rename and change types and number of parameters
    public static Trend_frag newInstance(String param1, String param2) {
        Trend_frag fragment = new Trend_frag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_trend_frag, container, false);



        posts=new ArrayList<>();


        benimrcyc2=view.findViewById(R.id.myrcyc2);
        myadaptor= new adaptor(posts);
        benimrcyc2.setAdapter(myadaptor);
        benimrcyc2.setLayoutManager(new LinearLayoutManager(getContext()));


        posts.add(new Posts(R.drawable.jojo_post, "Jojo_","Jojo's Bizzare Adventure season 6 has ended. The anime will continue with part 7"));
        posts.add(new Posts(R.drawable.can_sungur_post, "Can_Sungur","Yayın başlıyor link: https://www.youtube.com/channel/UC6q0eGHt5euC8aYLDjhaHpA"));
        posts.add(new Posts(R.drawable.eda_ece_post, "MagazinD","Ünlü oyuncu Eda Ece'den yeni selfie"));
        posts.add(new Posts(R.drawable.aot_post, "Gerekli_Seyler","Attack on Tİtan mangası tekrar basımda!!"));
        posts.add(new Posts(R.drawable.a345_post, "**sponsorlu ürün**","345 yayınları TYT Matematik sadece Trendyolda!!!"));
        posts.add(new Posts(R.drawable.secim_post, "X Gazete","Tarihi seçim bu pazar"));




        return view;
    }
}