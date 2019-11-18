package com.example.homework4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent= getIntent();
        t1=(TextView)findViewById(R.id.textView);
        String Time= intent.getExtras().getString("time");
        t1.setText("입력받은 시간은 "+Time + "초입니다.");


    }
    @Override
    public void onBackPressed(){
        Intent intent= new Intent(Main2Activity.this, MainActivity.class);
        startActivity(intent);
    }
}
