package com.example.project.tourapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mosta on 1/21/2019.
 */

public class AdapterHospital extends ArrayAdapter<ModelHospital> {


    public AdapterHospital(@NonNull Context context, @NonNull List<ModelHospital> objects) {
        super(context, 0, objects);
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_list, parent, false);
        }
        ModelHospital current = getItem(position);
        TextView nametextview = (TextView) listItemView.findViewById(R.id.name_text_view);
        nametextview.setText(current.getName());
        TextView locationtextview = (TextView) listItemView.findViewById(R.id.loction_text_view);
        locationtextview.setText("City " + current.getLocation().getCity() + ", Region " + current.getLocation().getRegion());
        ImageView imageView = listItemView.findViewById(R.id.pic);
        imageView.setVisibility(View.GONE);


        return listItemView;

    }
}
