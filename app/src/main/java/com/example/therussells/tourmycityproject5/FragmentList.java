package com.example.therussells.tourmycityproject5;

class FragmentList {


    private final String mPLaceName;

    private final String mPlaceDescription;

    private final String mPlaceAddress;

    private final String mPlacePhoneNumber;

    private final int mImageResourceId;

    FragmentList(String placeName, String placeDescription, String placeAddress, String placePhoneNumber, int imageResourceId){
        mPLaceName = placeName;
        mPlaceDescription = placeDescription;
        mPlaceAddress = placeAddress;
        mPlacePhoneNumber = placePhoneNumber;
        mImageResourceId = imageResourceId;
    }

    public String getPLaceName(){
        return mPLaceName;
    }

    public String getPlaceDescription(){
        return mPlaceDescription;
    }

    public String getPlaceAddress(){
        return mPlaceAddress;
    }

    public String getPlacePhoneNumber(){
        return mPlacePhoneNumber;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }
}

