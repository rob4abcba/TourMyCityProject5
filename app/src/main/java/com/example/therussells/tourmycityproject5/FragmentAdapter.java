package com.example.therussells.tourmycityproject5;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A {@link FragmentAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 * This adapter will display each fragment on the screen to user
 */
public class FragmentAdapter extends FragmentPagerAdapter {

    FragmentAdapter(FragmentManager fm) {
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