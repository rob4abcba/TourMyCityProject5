package com.example.therussells.tourmycityproject5;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DisplayAdapter extends ArrayAdapter<Display> {
    private final int mColorResourceId;

    DisplayAdapter(Context context, ArrayList<Display> display, int ColorResourceId) {
        super(context, 0, display);
        mColorResourceId = ColorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View listItemView  = convertView;
        // if null inflate it from list_item
        if (listItemView == null) {
            //The inflater is used to map the instance variables to the TextView in the
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // get object located at the position
        Display currentDisplay = getItem(position);

        //The different objects at each position located by each of their Id's

        ImageView imageView = listItemView.findViewById(R.id.image);
        TextView titleView = listItemView.findViewById(R.id.title);
        TextView addressView = listItemView.findViewById(R.id.address);
        TextView phonenumberView =listItemView.findViewById(R.id.phonenumber);


        imageView.setImageResource(currentDisplay.getImageResourceId());
        titleView.setText(currentDisplay.getPlaceName());
        addressView.setText(currentDisplay.getPlaceAddress());
        phonenumberView.setText(currentDisplay.getPlacePhoneNumber());

        //search for the view with the give id
        View textContainer = listItemView.findViewById(R.id.text_view_Id);

        int color = ContextCompat.getColor(getContext(),mColorResourceId);

        //textContainer.setBackgroundColor(color);

        // set its background resource to the mColorResourceId
       // textContainer.setBackgroundResource(mColorResourceId);

        return listItemView;
    }
}