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
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShoppingFragment extends Fragment {
    final ArrayList<Site> sites = new ArrayList<Site>();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.recycler_view, container, false);

        RecyclerView recyclerView = rootView.findViewById(R.id.my_recycler_viewId);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        sites.add(new Site(getString(R.string.chicos),getString(R.string.chicos_address), getString(R.string.chicos_phone_number), R.drawable.chicos));
        sites.add(new Site(getString(R.string.urbancouture),getString(R.string.urban_address), getString(R.string.urban_phone_number), R.drawable.runwaycouture));
        sites.add(new Site(getString(R.string.vc_boutique),getString(R.string.vc_boutique_address), getString(R.string.vc_boutique_phone_number), R.drawable.vcboutique));
        sites.add(new Site(getString(R.string.potteryplace),getString(R.string.pottery_place_address), getString(R.string.pottery_place_phone_number), R.drawable.potteryplace));
        sites.add(new Site(getString(R.string.empirebooks),getString(R.string.empirebooks_address), getString(R.string.empirebooks_phone_number), R.drawable.empirebooks));


        // locating the listView and setting the adapter to it

        recyclerView.setAdapter(new SiteAdapter(sites));

        return rootView;
    }

}
