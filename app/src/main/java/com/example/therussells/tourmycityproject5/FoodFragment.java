package com.example.therussells.tourmycityproject5;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    RecyclerViewAdapter adapter;


    public static FoodFragment newInstance() {
        return new FoodFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {




        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.final_list_view, null);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);


        final ArrayList<FragmentList> fragmentArrayList = new ArrayList<>();

        fragmentArrayList.add(new FragmentList(getString(R.string.backyard_pizza), getString(R.string.backyard_description),
                getString(R.string.backyard_address), getString(R.string.backyard_phone_number), R.drawable.backyardimage));

        MainActivity.PlaceholderFragment.FragmentListAdapter adapter = new MainActivity.PlaceholderFragment.FragmentListAdapter(getActivity(), fragmentArrayList);

        ListView listView = rootView.findViewById(R.id.my_recycler_view);

        // specify an adapter (see also next example)
        adapter = new CardAdapter(fragmentArrayList);
        recyclerView.setAdapter(adapter);

        return rootView;
    }

}
