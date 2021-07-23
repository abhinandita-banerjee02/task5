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

public class Stage3Adapter extends RecyclerView.Adapter<Stage3Adapter.viewHolder> {
    Context context;
    List<Stage3_items> list;

    public Stage3Adapter(Context context, List<Stage3_items> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @NotNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.stg3_items,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull Stage3Adapter.viewHolder holder, int position) {
        holder.image.setImageResource(list.get(position).getImage());
        holder.posts.setText(Integer.toString(list.get(position).getPosts()));
        holder.following.setText(Integer.toString(list.get(position).getFollowing()));
        holder.name.setText(list.get(position).getName());
        holder.followers.setText(list.get(position).getFollowers());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class viewHolder extends RecyclerView.ViewHolder{
        TextView name,followers,posts,following;
        CircleImageView image;

        public viewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            followers = itemView.findViewById(R.id.followers);
            following=itemView.findViewById(R.id.following);
            posts = itemView.findViewById(R.id.posts);
            image = itemView.findViewById(R.id.image1);
        }
    }
}
