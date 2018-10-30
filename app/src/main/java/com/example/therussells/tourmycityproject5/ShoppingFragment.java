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
public class ShoppingFragment extends Fragment {

    private ListAdapter adapter;

    public ShoppingFragment(){}

    public static FoodFragment newInstance() {
        return new FoodFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.display_view, container, false);

        final ArrayList<Display> display = new ArrayList<>();

        display.add(new Display(getString(R.string.chicos),getString(R.string.chicos_address), getString(R.string.chicos_phone_number), R.drawable.chicos));
        display.add(new Display(getString(R.string.urbancouture),getString(R.string.urban_address), getString(R.string.urban_phone_number), R.drawable.runwaycouture));
        display.add(new Display(getString(R.string.vc_boutique),getString(R.string.vc_boutique_address), getString(R.string.vc_boutique_phone_number), R.drawable.vcboutique));
        display.add(new Display(getString(R.string.potteryplace),getString(R.string.pottery_place_address), getString(R.string.pottery_place_phone_number), R.drawable.potteryplace));
        display.add(new Display(getString(R.string.empirebooks),getString(R.string.empirebooks_address), getString(R.string.empirebooks_phone_number), R.drawable.empirebooks));


        // setting up array adapter
        DisplayAdapter adapter = new DisplayAdapter(getActivity(), display, R.color.colorPrimary);

        // locating the listView and setting the adapter to it
        ListView listView = rootView.findViewById(R.id.display_ID);
        listView.setAdapter(adapter);

        return rootView;
    }


}