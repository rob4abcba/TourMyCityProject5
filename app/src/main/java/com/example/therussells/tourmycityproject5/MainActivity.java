package com.example.therussells.tourmycityproject5;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
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

        //adding vector image back button to toolbar
        toolbar.setTitle(getString(R.string.app_name));
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);

        // making the back button clickable

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



        PlaceholderFragment.SectionsPagerAdapter mSectionsPagerAdapter = new PlaceholderFragment.SectionsPagerAdapter(getSupportFragmentManager());

        ViewPager mViewPager = findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        //The TabLayout will receive the ViewPager
        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
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

    public enum FragmentListAdapter {}

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
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            return inflater.inflate(R.layout.list_item, container, false);
        }

        /**
         * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
         * one of the sections/tabs/pages.
         * This adapter will display each fragment on the screen to user
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
                        return new GettingAroundFragment();
                    case 1:
                        return new AccommodationsFragment();
                    case 2:
                        return new FoodFragment();
                    default:
                        return new ShoppingFragment();
                }
            }


            @Override
            public int getCount() {
                // Show 4 total pages.
                return 4;
            }

            // This determines the title for each tab
            @Override
            public CharSequence getPageTitle(int position) {
                // Generate title based on item position
                switch (position) {

                    case 0:
                        return "Travel";
                    case 1:
                        return "Hotel";
                    case 2:
                        return "Food";
                    case 3:
                        return "Shop";
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
                if (listItemView == null) {
                    //The inflator is used to map the song name and artist name to the TextView in the
                    LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
                }

                FragmentList currentFragmentList = getItem(position);

                if (convertView == null) {
                    convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
                }

                //The different objects at each position
                ImageView imageView = convertView.findViewById(R.id.image);
                TextView titleView = convertView.findViewById(R.id.title);
                TextView descriptionView = convertView.findViewById(R.id.description);
                TextView addressView = convertView.findViewById(R.id.address);
                TextView phonenumberView = convertView.findViewById(R.id.phonenumber);

                if (currentFragmentList == null) throw new AssertionError();
                imageView.setImageResource(currentFragmentList.getImageResourceId());
                titleView.setText(currentFragmentList.getPLaceName());
                descriptionView.setText(currentFragmentList.getPlaceDescription());
                addressView.setText(currentFragmentList.getPlaceAddress());
                phonenumberView.setText(currentFragmentList.getPlacePhoneNumber());


                return convertView;
            }
        }
    }
}



