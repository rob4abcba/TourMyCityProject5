package com.example.therussells.tourmycityproject5;


import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {

    final ArrayList<Site> sites = new ArrayList<Site>();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.recycler_view, container, false);

        RecyclerView recyclerView = rootView.findViewById(R.id.my_recycler_viewId);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        sites.add(new Site(getString(R.string.backyard_pizza), getString(R.string.backyard_address), getString(R.string.backyard_phone_number), R.drawable.baryard2));
        sites.add(new Site(getString(R.string.roosters),getString(R.string.roosters_address), getString(R.string.roosters_phone_number), R.drawable.roosters));
        sites.add(new Site(getString(R.string.lebistro),getString(R.string.lebistro_address), getString(R.string.lebistro_phone_number), R.drawable.bistro));
        sites.add(new Site(getString(R.string.surin),getString(R.string.surin_address), getString(R.string.surin_phone_number), R.drawable.surin));
        sites.add(new Site(getString(R.string.coldstone),getString(R.string.coldstone_address), getString(R.string.coldstone_phone_number), R.drawable.coldstone));


        // locating the listView and setting the adapter to it

        recyclerView.setAdapter(new SiteAdapter(sites));

    return rootView;
    }

}
