package com.abhinandita.task5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Stage1 extends AppCompatActivity {
    public RecyclerView recy1;
    public RecyclerView recy2;
    public RecyclerView recy3;
    ArrayList<Stage1_items> content1;
    ArrayList<Stage1_items> content2;
    ArrayList<Stage1_items> content3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage1);
        recy1 = findViewById(R.id.recy1);
        recy2 = findViewById(R.id.recy2);
        recy3 = findViewById(R.id.recy3);
        recy1.setLayoutManager(new LinearLayoutManager(Stage1.this));
        recy2.setLayoutManager(new LinearLayoutManager(Stage1.this));
        recy3.setLayoutManager(new LinearLayoutManager(Stage1.this));
        content1 = new ArrayList<Stage1_items>();
        content2 = new ArrayList<Stage1_items>();
        content3 = new ArrayList<Stage1_items>();

        // Important
        Stage1_items a = new Stage1_items();
        Stage1_items b = new Stage1_items();
        Stage1_items c = new Stage1_items();
        Stage1_items d = new Stage1_items();
        Stage1_items e = new Stage1_items();
        Stage1_items f = new Stage1_items();
        Stage1_items g = new Stage1_items();
        Stage1_items h = new Stage1_items();

        a.setText("Degree");
        a.setImg1(R.drawable.degree_icon);
        a.setImg2(R.drawable.arrow);
        content1.add(a);


        b.setText("Assignments");
        b.setImg1(R.drawable.assignment);
        b.setImg2(R.drawable.arrow);
        content1.add(b);

        c.setText("Photos");
        c.setImg1(R.drawable.photos_icon);
        c.setImg2(R.drawable.arrow);
        content1.add(c);

        //Files
        d.setText("Png Images");
        d.setImg1(R.drawable.png_icon);
        d.setImg2(R.drawable.arrow);
        content2.add(d);


        e.setText("Jpg Images");
        e.setImg1(R.drawable.jpg_icon);
        e.setImg2(R.drawable.arrow);
        content2.add(e);


        f.setText("Word Documents");
        f.setImg1(R.drawable.doc_icon);
        f.setImg2(R.drawable.arrow);
        content2.add(f);

        g.setText("Pdf Documents");
        g.setImg1(R.drawable.pdf_icon);
        g.setImg2(R.drawable.arrow);
        content2.add(g);

        // Other Settings
        h.setText("Photos");
        h.setImg1(R.drawable.others);
        h.setImg2(R.drawable.arrow);
        content3.add(h);

        recy1.setAdapter(new Stage1Adapter(Stage1.this,content1));
        recy2.setAdapter(new Stage1Adapter(Stage1.this,content2));
        recy3.setAdapter(new Stage1Adapter(Stage1.this,content3));


    }


}