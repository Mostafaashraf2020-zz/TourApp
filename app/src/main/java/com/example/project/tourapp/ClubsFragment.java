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
public class ClubsFragment extends Fragment {
    ListView listviewclubs;
    ArrayList<BaseModel> arrayList;


    public ClubsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_clubs, container, false);
        listviewclubs = view.findViewById(R.id.list_club);
        zz();
        return view;
    }

    private void zz() {
        arrayList = new ArrayList<>();

        arrayList.add(new BaseModel("Al-Ahly", R.drawable.ahly, new Location("cairo", "Nasr city")));
        arrayList.add(new BaseModel("Wadi Degla", R.drawable.wadidegla, new Location("Alex", "Sherton")));
        arrayList.add(new BaseModel("Zamalek", R.drawable.zamalk, new Location("cairo", "Giza")));
        arrayList.add(new BaseModel("Pyramids", R.drawable.pyramid, new Location("cairo", "Masr El-gdida")));
        MyAdapter adapter = new MyAdapter(getActivity(), arrayList);


        listviewclubs.setAdapter(adapter);
    }

}
