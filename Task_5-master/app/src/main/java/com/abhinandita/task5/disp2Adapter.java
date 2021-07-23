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

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class Stage2Adapter extends RecyclerView.Adapter<Stage2Adapter.viewHolder> {
    Context context;
    List<Stage2_items> list;
    public Stage2Adapter(Context context, List<Stage2_items> list){
        this.context = context;
        this.list = list;
    }


    @NonNull
    @NotNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.stg2_items,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull Stage2Adapter.viewHolder holder, int position) {
        holder.textView.setText(list.get(position).getText());
        holder.img1.setImageResource(list.get(position).getImg1());
        holder.img2.setImageResource(list.get(position).getImg2());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class viewHolder extends RecyclerView.ViewHolder{
        CircleImageView img1;
        TextView textView;
        ImageView img2;

        public viewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            img1=itemView.findViewById(R.id.img10);
            img2 = itemView.findViewById(R.id.img20);
            textView = itemView.findViewById(R.id.text1);


        }

    }
}
