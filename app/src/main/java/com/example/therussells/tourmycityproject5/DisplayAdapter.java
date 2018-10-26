package com.example.therussells.tourmycityproject5;


import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DisplayAdapter extends ArrayAdapter<Display> {

    DisplayAdapter(Context context, ArrayList<Display> display) {
        super(context, 0, display);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            //The inflator is used to map the instance variables to the TextView in the
            LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Display currentDisplay = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //The different objects at each position
        ImageView imageView = convertView.findViewById(R.id.image);
        TextView titleView = convertView.findViewById(R.id.title);
        TextView descriptionView = convertView.findViewById(R.id.description);
        TextView addressView = convertView.findViewById(R.id.address);
        TextView phonenumberView = convertView.findViewById(R.id.phonenumber);

        if (currentDisplay == null) throw new AssertionError();
        imageView.setImageResource(currentDisplay.getImageResourceId());
        titleView.setText(currentDisplay.getPLaceName());
        descriptionView.setText(currentDisplay.getPlaceDescription());
        addressView.setText(currentDisplay.getPlaceAddress());
        phonenumberView.setText(currentDisplay.getPlacePhoneNumber());

        return convertView;
    }
}