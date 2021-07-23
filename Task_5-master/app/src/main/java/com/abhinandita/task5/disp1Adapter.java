package com.abhinandita.task5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Stage1Adapter extends RecyclerView.Adapter<Stage1Adapter.viewHolder> {
    Context context;
    ArrayList<Stage1_items> content;
    public Stage1Adapter(Context context, ArrayList<Stage1_items> content){
        this.context=context;
        this.content=content;
    }



    @NonNull
    @NotNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.stg1_items,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull Stage1Adapter.viewHolder holder, int position) {
        holder.imageView1.setImageResource(content.get(position).getImg1());
        holder.imageView2.setImageResource(content.get(position).getImg2());
        holder.textView.setText(content.get(position).getText());

    }

    @Override
    public int getItemCount() {
        return content.size();
    }

    class viewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        ImageView imageView1;
        ImageView imageView2;
        public viewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            imageView1=itemView.findViewById(R.id.img1);
            imageView2=itemView.findViewById(R.id.img2);
        }
    }


}
