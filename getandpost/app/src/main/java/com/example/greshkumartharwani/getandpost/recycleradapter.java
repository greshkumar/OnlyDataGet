package com.example.greshkumartharwani.getandpost;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Gresh Kumar Tharwani on 12/29/2017.
 */

public class recycleradapter extends RecyclerView.Adapter<recycleradapter.MyViewHolder> {

    List<model> mlist;
    Context context;
    LayoutInflater inf;

    public recycleradapter(List<model> mlist, Context context) {
        this.mlist = mlist;
        this.context = context;
        this.inf = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View view = (View) inf.inflate(R.layout.recycleitem,parent , false);
        View layoutView = LayoutInflater.from(context)
                .inflate(R.layout.recyclerrow, null);
        return new MyViewHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        model rm = mlist.get(position);
        holder.UserId.setText(Integer.toString(rm.getUserId()));
        holder.id.setText(Integer.toString(rm.getId()));
        holder.title.setText(rm.getTitle());
        holder.body.setText(rm.getBody());


    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView UserId, id, title, body;

        public MyViewHolder(View view) {
            super(view);
            UserId = (TextView)view.findViewById(R.id.UserId);
            id = (TextView)view.findViewById(R.id.id);
            title = (TextView) view.findViewById(R.id.title);
            body= (TextView) view.findViewById(R.id.body);
        }
    }
}