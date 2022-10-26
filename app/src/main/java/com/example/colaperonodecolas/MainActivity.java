package com.example.colaperonodecolas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private Queue queue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        queue= new Queue();
        queue.add(8);
        queue.add(6);
        queue.add(1);
        queue.add(10);
        queue.print();
        Log.i("log","First -> "+queue.getFirst()+"");
        Log.i("log","Last -> "+queue.getLast()+"");
    }
}