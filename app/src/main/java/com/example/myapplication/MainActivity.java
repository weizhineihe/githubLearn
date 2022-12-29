package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showBar = (Button) findViewById(R.id.show_snackbar_bt);
        showBar.setOnClickListener(v -> {
            Snackbar.make(findViewById(R.id.my_cl),"你好",Snackbar.LENGTH_LONG).setAction("点击事件",v1 -> {
                Toast.makeText(this,"我好",Toast.LENGTH_SHORT).show();
            }).show();
        });
    }

}