package com.example.project.tourapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlacesFragment extends Fragment {
    ListView listViewplaces;
    ArrayList<BaseModel> arrayList;


    public PlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_places, container, false);
        listViewplaces = view.findViewById(R.id.list_places);
        nn();
        return view;

    }

    private void nn() {
        arrayList = new ArrayList<>();
        arrayList.add(new BaseModel("Pyriamds", R.drawable.pyramidsgiza, new Location("Egypt", "Giza")));
        arrayList.add(new BaseModel("Tower cairo", R.drawable.towers, new Location("Egypt", "Giza")));
        arrayList.add(new BaseModel("Abo sambal", R.drawable.abo_sambel, new Location("Egypt", "Aswan")));
        arrayList.add(new BaseModel("Bey Citadel", R.drawable.bay, new Location("Egypt", "Alex")));
        MyAdapter adapter = new MyAdapter(getActivity(), arrayList);
        listViewplaces.setAdapter(adapter);
    }

}
