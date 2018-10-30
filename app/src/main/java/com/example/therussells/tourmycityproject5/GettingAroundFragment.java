package com.example.therussells.tourmycityproject5;


import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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

    final ArrayList<Site> sites = new ArrayList<Site>();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.recycler_view, container, false);

        RecyclerView recyclerView = rootView.findViewById(R.id.my_recycler_viewId);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        sites.add(new Site(getString(R.string.uber), getString(R.string.uberaddress), getString(R.string.ubercontact), R.drawable.uber));
        sites.add(new Site(getString(R.string.lyft),getString(R.string.lyftaddress), getString(R.string.lyftcontact), R.drawable.lyft));
        sites.add(new Site(getString(R.string.metro_tri_state),getString(R.string.metro_address), getString(R.string.metro_phone_number), R.drawable.metrocab));
        sites.add(new Site(getString(R.string.bus),getString(R.string.bus_address), getString(R.string.backyard_phone_number), R.drawable.bustransit));
        sites.add(new Site(getString(R.string.taxi_tommy),getString(R.string.taxi_tommy_address), getString(R.string.taxi_tommy_phone_number), R.drawable.taxitommy));

        // locating the listView and setting the adapter to it

        recyclerView.setAdapter(new SiteAdapter(sites));

        return rootView;
    }

}
