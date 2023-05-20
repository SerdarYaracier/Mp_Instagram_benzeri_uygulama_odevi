package com.example.my_instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_giris,btn_kayit;
    EditText username_txt, password_txt;

    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       btn_giris=findViewById(R.id.login);
       btn_kayit=findViewById(R.id.sign_up);
       username_txt=findViewById(R.id.username);
       password_txt=findViewById(R.id.password);
       DB= new DBHelper(this);




       btn_kayit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
          String user = username_txt.getText().toString();
          String pass = password_txt.getText().toString();

          Boolean checkuser = DB.checkUsername(user);
               if(TextUtils.isEmpty(user) || TextUtils.isEmpty(pass)){
                   Toast.makeText(MainActivity.this, "Tüm bilgileri doldurunuz", Toast.LENGTH_SHORT).show();
               }else{
          if(checkuser==false){
              Boolean insert =DB.insertData(user,pass);
              if(insert==true){
                  Toast.makeText(MainActivity.this, "Kayıt başarılı", Toast.LENGTH_SHORT).show();
                  //Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                  //startActivity(intent);
              }else
                  Toast.makeText(MainActivity.this, "Kayıt Başarısız", Toast.LENGTH_SHORT).show();
          }else{
              Toast.makeText(MainActivity.this, "KUllanıcı zaten kayıtlı", Toast.LENGTH_SHORT).show();
          }

           }}
       });

      btn_giris.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String user=username_txt.getText().toString();
              String pass=password_txt.getText().toString();

              if(TextUtils.isEmpty(user) || TextUtils.isEmpty(pass)){
                  Toast.makeText(MainActivity.this, "Tüm bilgileri doldurunuz", Toast.LENGTH_SHORT).show();
              }else{
                  Boolean checkuserpass=DB.checkusernamepassword(user,pass);
                  if (checkuserpass==true){
                      Toast.makeText(MainActivity.this, "Giriş Başarılı", Toast.LENGTH_SHORT).show();
                      Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                      startActivity(intent);
                  }else {
                      Toast.makeText(MainActivity.this, "Giris Başarısız", Toast.LENGTH_SHORT).show();
                  }
              }

          }
      });




    }





}

