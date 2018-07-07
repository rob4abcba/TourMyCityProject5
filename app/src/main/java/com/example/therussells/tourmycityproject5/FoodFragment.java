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
    public static final String NAME = "Food";


    public FoodFragment() {
        // Required empty public constructor
    }


    public static FoodFragment newInstance(){
        return new FoodFragment();
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list_item, container, false);

        final ArrayList<FragmentList> fragmentlist = new ArrayList<>();

        fragmentlist.add(new FragmentList(R.string.backyard_pizza, R.string.backyard_description,  R.string.backyard_address, R.string.backyard_phone_number, R.drawable.backyardImg));

        ListView listView = rootView.findViewById(R.id.list_item);

        MainActivity.FragmentListAdapter adapter = new MainActivity.FragmentListAdapter(rootView.getContext(), fragmentlist);
        listView.setAdapter(adapter);

        return rootView;
    }

}
