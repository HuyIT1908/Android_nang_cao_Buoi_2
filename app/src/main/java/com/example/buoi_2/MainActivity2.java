package com.example.buoi_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }
    public void send(View view){
        Intent intent = new Intent();
        intent.putExtra("data" , "du lieu da duoc gui ok ok ok");
        intent.setAction("signal");
        sendBroadcast(intent);
        Toast.makeText(this , "send ok ok ok" , Toast.LENGTH_SHORT).show();
    }
    public void change_2(View view){
        finish();
    }
}