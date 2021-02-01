package com.example.buoi_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tv_a;
    BroadcastReceiver broadcastReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_a = findViewById(R.id.tv_a);
        broadcastReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                String data = intent.getStringExtra("data");
                tv_a.setText(data);
            }
        };
        IntentFilter intentFilter = new IntentFilter("signal");
//        dk voi he thong la lang nghe action la signal
        registerReceiver(broadcastReceiver , intentFilter);
    }
    public void change_1(View view){
        Intent intent = new Intent(this , MainActivity2.class);
        startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this , "da huy nhan roi nha" , Toast.LENGTH_SHORT).show();
        unregisterReceiver(broadcastReceiver);
    }
}