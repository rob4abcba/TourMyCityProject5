package com.example.therussells.tourmycityproject5;


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
public class AccommodationsFragment extends Fragment {
    final ArrayList<Site> sites = new ArrayList<Site>();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.recycler_view, container, false);

        RecyclerView recyclerView = rootView.findViewById(R.id.my_recycler_viewId);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        sites.add(new Site(getString(R.string.pullman), getString(R.string.pullman_address), getString(R.string.pullman_phone_number), R.drawable.pullmanplaza));
        sites.add(new Site(getString(R.string.hampton_inn),getString(R.string.hampton_inn_address), getString(R.string.hampton_inn_phone_number), R.drawable.hamptoninn));
        sites.add(new Site(getString(R.string.holiday_inn),getString(R.string.holiday_inn_address), getString(R.string.holiday_inn_phone_number), R.drawable.holidayinn));
        sites.add(new Site(getString(R.string.days_inn),getString(R.string.days_inn_address), getString(R.string.days_inn_phone_number), R.drawable.daysinn));
        sites.add(new Site(getString(R.string.econo_lodge),getString(R.string.econo_lodge_address), getString(R.string.econo_lodge_phone_number), R.drawable.econoinn));
// locating the listView and setting the adapter to it

        recyclerView.setAdapter(new SiteAdapter(sites));

        return rootView;
    }

}
