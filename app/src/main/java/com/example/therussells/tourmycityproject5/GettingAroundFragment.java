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
public class GettingAroundFragment extends Fragment {

    private ListAdapter adapter;

    public GettingAroundFragment(){}

    public static FoodFragment newInstance() {
        return new FoodFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.display_view, container, false);

        final ArrayList<Display> display = new ArrayList<>();

        display.add(new Display(getString(R.string.backyard_pizza), getString(R.string.backyard_description),
                getString(R.string.backyard_address), getString(R.string.backyard_phone_number), R.drawable.backyardimage));

        // setting up array adapter
        DisplayAdapter adapter = new DisplayAdapter(getActivity(), display, R.color.cardview_shadow_start_color);

        // locating the listView and setting the adapter to it
        ListView listView = rootView.findViewById(R.id.display_ID);
        listView.setAdapter(adapter);

        return rootView;
    }


}