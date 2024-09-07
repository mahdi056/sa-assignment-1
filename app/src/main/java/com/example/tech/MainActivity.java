package com.example.tech;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnmobile = findViewById(R.id.btn_mobile);
        Button btnlaptop = findViewById(R.id.btn_laptop);


        TextView btntech = findViewById(R.id.btn_tech);

        TextView textView = findViewById(R.id.btn_tech);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
            }
        });


        btnmobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, mobile_activity.class);
                startActivity(intent);

                LayoutInflater inflater = getLayoutInflater();

                View cusview = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.toast_mobile));
                Toast toast = new Toast(MainActivity.this);

                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.setView(cusview);
                toast.show();
            }
        });

        btnlaptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, laptopactivity.class);
                startActivity(intent);

                LayoutInflater inflater = getLayoutInflater();

                View cusview = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.toast_mobile));
                Toast toast = new Toast(MainActivity.this);

                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.setView(cusview);
                toast.show();

            }
        });



    }
}