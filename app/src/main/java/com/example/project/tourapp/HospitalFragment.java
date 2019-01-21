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
public class HospitalFragment extends Fragment {
    ListView listviewhospital;
    ArrayList<ModelHospital> arrayList;


    public HospitalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hospital, container, false);
        listviewhospital = view.findViewById(R.id.list_hospital);
        mm();
        return view;

    }

    private void mm() {
        arrayList = new ArrayList<>();

        arrayList.add(new ModelHospital("Ahmed zeouil", new Location("Giza", "6 octobar")));
        arrayList.add(new ModelHospital("International Center Medical", new Location("Cairo", "Shrouk")));
        arrayList.add(new ModelHospital("San peter", new Location("cairo", "Masr EL-gdida")));
        arrayList.add(new ModelHospital("Celopatra", new Location("cairo", "Masr EL-gdida")));
        AdapterHospital adapter = new AdapterHospital(getActivity(), arrayList);


        listviewhospital.setAdapter(adapter);
    }

}
