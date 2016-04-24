package com.saarang.parth.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Parth on 24-04-2016.
 */
public class SimpleAdapter extends RecyclerView.Adapter<SimpleAdapter.ViewHolder> {

    public String[] events= {"Decibels","Acapella","Alankar","Street play","wcs"};

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title, subtitle;
        public ViewHolder(View itemView) {
            super(itemView);
            title=(TextView)itemView.findViewById(R.id.title);
            subtitle=(TextView)itemView.findViewById(R.id.sub);
        }
    }

    @Override
    public SimpleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_event,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SimpleAdapter.ViewHolder holder, int position) {
        holder.title.setText(events[position]);
    }

    @Override
    public int getItemCount() {
        return events.length;
    }
}
