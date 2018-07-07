package com.example.therussells.tourmycityproject5;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the  activity_main.xml layout file
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        PlaceholderFragment.SectionsPagerAdapter mSectionsPagerAdapter = new PlaceholderFragment.SectionsPagerAdapter(getSupportFragmentManager());



        ViewPager mViewPager = findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        //The TabLayout will receive the ViewPager
        TabLayout tabLayout = findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }


        /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     *   This adapter will display each fragment on the screen to user
     */
    static class SectionsPagerAdapter extends FragmentPagerAdapter {

      
        SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        // Find the position of each tab
        // getItem is called to instantiate the fragment for the given tab.
        // Return a PlaceholderFragment (defined as a static inner class below).

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new EmergencyServicesFragment();
                case 1:
                    return new GettingAroundFragment();
                case 2:
                    return new AccommodationsFragment();
                case 3:
                    return new FoodFragment();
                default:
                    return new ActivitiesFragment();
            }
        }


        @Override
        public int getCount() {
            // Show 5 total pages.
            return 5;
        }

        // This determines the title for each tab
        @Override
        public CharSequence getPageTitle (int position){
            // Generate title based on item position
            switch (position) {
                case 0:
                    return "Emergency Services";
                case 1:
                    return "Getting Around";
                case 2:
                    return "Accommodations";
                case 3:
                    return "Food";
                case 4:
                    return "Activities";
            }
            return null;
        }
    }

    static class FragmentListAdapter extends ArrayAdapter<FragmentList> {

        FragmentListAdapter(Context context, ArrayList<FragmentList> fragmentArrayList) {
            super(context, 0, fragmentArrayList);
        }
        @NonNull
        @Override
        public View getView(int position, View convertView, @NonNull ViewGroup parent) {

            View listItemView = convertView;
            if(listItemView == null) {
                //The inflator is used to map the song name and artist name to the TextView in the
                LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            }

            FragmentList currentFragmentList = getItem(position);

            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            }

            ImageView imageView = convertView.findViewById(R.id.image);
            TextView titleView = convertView.findViewById(R.id.title);
            TextView descriptionView = convertView.findViewById(R.id.description);
            TextView addressView = convertView.findViewById(R.id.address);
            TextView phonenumberView = convertView.findViewById(R.id.phonenumber);

            assert currentFragmentList != null;
            imageView.setImageResource(currentFragmentList.getImageResourceId());
            titleView.setText(currentFragmentList.getPLaceName());
            descriptionView.setText(currentFragmentList.getPlaceDescription());
            addressView.setText(currentFragmentList.getPlaceAddress());
            phonenumberView.setText(currentFragmentList.getPlacePhoneNumber());


            return convertView;
        }
    }
}}
