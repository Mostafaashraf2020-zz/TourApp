package com.example.project.tourapp;

import android.app.Fragment;
import android.content.ComponentName;
import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by mosta on 1/19/2019.
 */

public class ViewPageAdapter extends FragmentPagerAdapter {

    private Context c;

    public ViewPageAdapter(FragmentManager fm, Context context) {
        super(fm);
        c = context;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        android.support.v4.app.Fragment fragment = null;

        if (position == 0) {
            fragment = new ResturantFragment();
        } else if (position == 1) {
            fragment = new HospitalFragment();
        } else if (position == 2) {
            fragment = new PlacesFragment();
        } else if (position == 3) {
            fragment = new ClubsFragment();

        }
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        String title = null;
        if (position == 0) {
            title = c.getString(R.string.resturant_title);
        } else if (position == 1) {
            title = c.getString(R.string.hopital_title);

        } else if (position == 2) {
            title = c.getString(R.string.places_title);
        } else if (position == 3) {
            title = c.getString(R.string.club_title);
        }
        return title;
    }


    @Override
    public int getCount() {
        return 4;
    }
}
