package com.example.homework4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] RandomString={"hello", "android", "ILoveSabit","DoHomeWork","F"};
    TextView targetText, UserText, Time;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        targetText=findViewById(R.id.targetText);
        UserText=findViewById(R.id.editText);
        Time=findViewById(R.id.time);
        Random random = new Random();
        int value= random.nextInt(5);
        targetText.setText(RandomString[value]);
        UserText.setText("");
        CountUpTimer timer= new CountUpTimer(300000) {
            @Override
            public void onTick(int second) {
                Time.setText(String.valueOf(second));
            }
        };
        timer.start();
    }

    public void onClick(View v){
        if(targetText.getText().toString().equals(UserText.getText().toString())){
            Intent intent= new Intent(MainActivity.this, Main2Activity.class);
            intent.putExtra("time", Time.getText().toString());
            startActivity(intent);
        }
        else{
            Toast.makeText(this,"틀렸습니다.", Toast.LENGTH_LONG).show();
        }
    }
}
