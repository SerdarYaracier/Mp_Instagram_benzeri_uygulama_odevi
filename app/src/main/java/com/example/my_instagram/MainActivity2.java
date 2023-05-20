package com.example.my_instagram;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity2 extends AppCompatActivity {

    BottomNavigationView bnavi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bnavi=findViewById(R.id.navi);
        getSupportFragmentManager().beginTransaction().replace(R.id.frags,new home_frag()).commit();

        bnavi.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()){
                    case R.id.home:
                      getSupportFragmentManager().beginTransaction().replace(R.id.frags,new home_frag()).commit();

                      break;

                    case R.id.trend:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frags,new Trend_frag()).commit();
                        break;
                    case R.id.profile:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frags,new Profile_frag()).commit();
                        break;


                }


                return false;
            }
        });






    }


}