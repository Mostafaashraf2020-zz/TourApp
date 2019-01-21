package com.example.project.tourapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ResturantFragment extends Fragment {
    ListView listViewRes;
    ArrayList<BaseModel> arrayList;


    public ResturantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_resturant, container, false);
        listViewRes = view.findViewById(R.id.list_resturant);
        initData();
        return view;

    }


    private void initData() {
        arrayList = new ArrayList<>();

        arrayList.add(new BaseModel("KFC", R.drawable.kfc1, new Location("cairo", "Nasr city")));
        arrayList.add(new BaseModel("Macdolans", R.drawable.mac, new Location("Alex", "Mandra")));
        arrayList.add(new BaseModel("StarBucks", R.drawable.starbucks, new Location("cairo", "Madianty")));
        arrayList.add(new BaseModel("Costa", R.drawable.costa, new Location("cairo", "Korba")));
        boolean isShowImage = false;
        MyAdapter adapter = new MyAdapter(getActivity(), arrayList);
        listViewRes.setAdapter(adapter);


    }

}
