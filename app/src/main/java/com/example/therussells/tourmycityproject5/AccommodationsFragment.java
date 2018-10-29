package com.example.therussells.tourmycityproject5;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class AccommodationsFragment extends Fragment {
    private ListAdapter adapter;

    public AccommodationsFragment(){}

    public static FoodFragment newInstance() {
        return new FoodFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.display_view, container, false);

        final ArrayList<Display> display = new ArrayList<>();

        display.add(new Display(getString(R.string.backyard_pizza), getString(R.string.backyard_description),
                getString(R.string.backyard_address), getString(R.string.backyard_phone_number), R.drawable.baryard2));
        display.add(new Display(getString(R.string.roosters), getString(R.string.roosters_description),
                getString(R.string.roosters_address), getString(R.string.roosters_phone_number), R.drawable.roosters));
        display.add(new Display(getString(R.string.lebistro), getString(R.string.lebistro_description),
                getString(R.string.lebistro_address), getString(R.string.lebistro_phone_number), R.drawable.bistro));
        display.add(new Display(getString(R.string.surin), getString(R.string.surin_description),
                getString(R.string.surin_address), getString(R.string.surin_phone_number), R.drawable.surin));
        display.add(new Display(getString(R.string.coldstone), getString(R.string.coldstone_description),
                getString(R.string.coldstone_address), getString(R.string.coldstone_phone_number), R.drawable.coldstone));

        // setting up array adapter
        DisplayAdapter adapter = new DisplayAdapter(getActivity(), display, R.color.colorPrimary);

        // locating the listView and setting the adapter to it
        ListView listView = rootView.findViewById(R.id.display_ID);
        listView.setAdapter(adapter);

        return rootView;
    }


}
