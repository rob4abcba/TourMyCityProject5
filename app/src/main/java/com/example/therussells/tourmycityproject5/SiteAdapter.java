package com.example.therussells.tourmycityproject5;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SiteAdapter extends RecyclerView.Adapter<SiteAdapter.SiteViewHolder> {

    //storing all the data we want to display in an ArrayList

    private ArrayList<Site>sites;
    private ViewGroup parent;


    //getting the context and array we want with the constructor
    SiteAdapter(ArrayList<Site> sites) {
        this.sites = sites;

    }


    @NonNull
    @Override
    // create new views(invoked by the layout manager)
    public SiteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //The inflater is used to map the instance variables to the TextView in the
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        //returning the Viewholder
        return new SiteViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SiteViewHolder displayViewHolder, int position) {

       // get object located at the position in list
        Site currentSite = sites.get(position);

        //binding the data with the viewholder views
        displayViewHolder.imageView.setImageResource(currentSite.getImageResourceId());
        displayViewHolder.titleView.setText(currentSite.getPlaceName());
        displayViewHolder.addressView.setText(currentSite.getPlaceAddress());
        displayViewHolder.phonenumberView.setText(currentSite.getPlacePhoneNumber());

    }

    @Override
    //returns the size of the ArrayList
    public int getItemCount() {
        return sites.size();
    }

    class SiteViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView titleView ;
        TextView addressView ;
        TextView phonenumberView ;

        SiteViewHolder(@NonNull View itemView) {
            super(itemView);
            ImageView imageView = itemView.findViewById(R.id.image);
            TextView titleView = itemView.findViewById(R.id.title);
            TextView addressView = itemView.findViewById(R.id.address);
            TextView phonenumberView =itemView.findViewById(R.id.phonenumber);

            titleView.setSelected(true);
            addressView.setSelected(true);
            phonenumberView.setSelected(true);

        }
    }
}