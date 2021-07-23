package com.abhinandita.task5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Stage3 extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Stage3_items> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage3);
        recyclerView = findViewById(R.id.recy4);
        recyclerView.setLayoutManager(new LinearLayoutManager(Stage3.this));
        list = new ArrayList<Stage3_items>();


        // Items
        Stage3_items a = new Stage3_items("Jack Daniel"
                , "Director, Cinematographer",
                R.drawable.jack_daniel,
                "12.6k",330,1211);
        Stage3_items b = new Stage3_items("John Walker"
                , "Photographer, Artist",
                R.drawable.john_walker,
                "128.6k",150,90);
        list.add(a);
        list.add(b);

        recyclerView.setAdapter(new Stage3Adapter(Stage3.this, list));
    }
}