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

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.display_view, container, false);

        final ArrayList<Display> display = new ArrayList<>();

        display.add(new Display(getString(R.string.uber), getString(R.string.uberaddress), getString(R.string.ubercontact), R.drawable.uber));
        display.add(new Display(getString(R.string.lyft),getString(R.string.lyftaddress), getString(R.string.lyftcontact), R.drawable.lyft));
        display.add(new Display(getString(R.string.metro_tri_state),getString(R.string.metro_address), getString(R.string.metro_phone_number), R.drawable.metrocab));
        display.add(new Display(getString(R.string.bus),getString(R.string.bus_address), getString(R.string.backyard_phone_number), R.drawable.bustransit));
        display.add(new Display(getString(R.string.taxi_tommy),getString(R.string.taxi_tommy_address), getString(R.string.taxi_tommy_phone_number), R.drawable.taxitommy));

        // setting up array adapter
        DisplayAdapter adapter = new DisplayAdapter(getActivity(), display, R.color.colorPrimary);

        // locating the listView and setting the adapter to it
        ListView listView = rootView.findViewById(R.id.display_ID);
        listView.setAdapter(adapter);

        return rootView;
    }

}