package com.abhinandita.task5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Stage2 extends AppCompatActivity {
    RecyclerView recyclerView;

    List<Stage2_items> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage2);
        recyclerView=findViewById(R.id.recycler1);
        list = new ArrayList<Stage2_items>();
        recyclerView.setLayoutManager(new LinearLayoutManager(Stage2.this));
        Stage2_items a = new Stage2_items(R.drawable.cat, "Cats", R.drawable.arrow);
        Stage2_items b = new Stage2_items(R.drawable.dog, "Dogs", R.drawable.arrow);
        Stage2_items c = new Stage2_items(R.drawable.hamster, "Hamsters",R.drawable.arrow);
        Stage2_items d = new Stage2_items(R.drawable.parrot, "Parrots",R.drawable.arrow);
        Stage2_items e = new Stage2_items(R.drawable.fish,"Gold Fish", R.drawable.arrow);
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        recyclerView.setAdapter(new Stage2Adapter(Stage2.this, list));




    }
}