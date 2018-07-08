package com.example.therussells.tourmycityproject5;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {


    public static FoodFragment newInstance() {
        FoodFragment fragment = new FoodFragment();
        return fragment;
    }



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list_item, container, false);

        final ArrayList<FragmentList> fragmentArrayList = new ArrayList<>();
        rootView.findViewById(R.id.list_item);

        fragmentArrayList.add(new FragmentList(getString(R.string.backyard_pizza), getString(R.string.backyard_description),
                getString(R.string.backyard_address), getString(R.string.backyard_phone_number), R.drawable.backyardImg));

        MainActivity.FragmentListAdapter adapter = new MainActivity.FragmentListAdapter(getActivity(), fragmentArrayList);

        ListView listView = rootView.findViewById(R.id.final_list_view);

        listView.setAdapter(adapter);

        return rootView;
    }

}
