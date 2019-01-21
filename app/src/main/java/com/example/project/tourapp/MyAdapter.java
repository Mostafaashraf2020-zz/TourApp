package com.example.project.tourapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mosta on 1/19/2019.
 */

public class MyAdapter extends ArrayAdapter<BaseModel> {


    public MyAdapter(Context context, ArrayList<BaseModel> arrayList) {
        super(context, 0, arrayList);
    }


    @Nullable
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_list, parent, false);
        }
        final BaseModel current = getItem(position);
        final TextView nametextview = (TextView) listItemView.findViewById(R.id.name_text_view);
        nametextview.setText(current.getName());
        final TextView locationtextview = (TextView) listItemView.findViewById(R.id.loction_text_view);
        locationtextview.setText("City: " + current.getLocation().getCity() + ", Region: " + current.getLocation().getRegion());
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.pic);
        iconView.setImageResource(current.getImage());
        return listItemView;

    }
}
