package com.abhinandita.task5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView stage1_btn,stage2_btn,stage3_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stage1_btn = findViewById(R.id.stage1_btn);
        stage2_btn=findViewById(R.id.stage2_btn);
        stage3_btn = findViewById(R.id.stage3_btn);

        stage1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Stage1.class);
                startActivity(intent);
            }
        });
        stage2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Stage2.class);
                startActivity(intent);
            }
        });

        stage3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Stage3.class);
                startActivity(intent);
            }
        });


    }
}