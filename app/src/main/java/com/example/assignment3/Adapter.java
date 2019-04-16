package com.example.assignment3;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter {
    List<listitem> items;
    Activity context;

    public Adapter(Activity context, List<listitem> items){
        this.items = items;
        this.context = context;
    }

    @NonNull
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        Inflate view and create ViewHolder
        LayoutInflater inflater = context.getLayoutInflater();
        View v = inflater.inflate(R.layout.listitem, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    public void onBindViewHolder(ViewHolder holder, int position) {
        listitem item = items.get(position);
        holder.name.setText(item.getName());
        holder.email.setText(item.getEmail());
        holder.image_id.setImageResource(item.getImage_id());

    }

    public int getItemCount() {
        return items.size();
    }




    class ViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        TextView email;
        ImageView image_id;
        public ViewHolder(View v) {
            super(v);
            name = v.findViewById(R.id.name);
            email = v.findViewById(R.id.email);
            image_id = v.findViewById(R.id.icon);
        }
    }
}
