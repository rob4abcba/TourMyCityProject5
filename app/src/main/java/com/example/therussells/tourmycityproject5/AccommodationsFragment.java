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



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.display_view, container, false);

        final ArrayList<Display> display = new ArrayList<>();

        display.add(new Display(getString(R.string.pullman), getString(R.string.pullman_address), getString(R.string.pullman_phone_number), R.drawable.pullmanplaza));
        display.add(new Display(getString(R.string.hampton_inn),getString(R.string.hampton_inn_address), getString(R.string.hampton_inn_phone_number), R.drawable.hamptoninn));
        display.add(new Display(getString(R.string.holiday_inn),getString(R.string.holiday_inn_address), getString(R.string.holiday_inn_phone_number), R.drawable.holidayinn));
        display.add(new Display(getString(R.string.days_inn),getString(R.string.days_inn_address), getString(R.string.days_inn_phone_number), R.drawable.daysinn));
        display.add(new Display(getString(R.string.econo_lodge),getString(R.string.econo_lodge_address), getString(R.string.econo_lodge_phone_number), R.drawable.econoinn));

        // setting up array adapter
        DisplayAdapter adapter = new DisplayAdapter(getActivity(), display, R.color.colorPrimary);

        // locating the listView and setting the adapter to it
        ListView listView = rootView.findViewById(R.id.display_ID);
        listView.setAdapter(adapter);

        return rootView;
    }

}