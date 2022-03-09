package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
  Button btn,bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button1);
        bt2=findViewById(R.id.button2);
        btn.setOnClickListener(this);
        bt2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {

            case R.id.button1:
                Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();
            case R.id.button2:
                Toast.makeText(this, "hello2", Toast.LENGTH_SHORT).show();
        }

    }
}