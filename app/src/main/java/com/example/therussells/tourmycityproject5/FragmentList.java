package com.example.therussells.tourmycityproject5;

class FragmentList {


    private final int mPLaceName;

    private final int mPlaceDescription;

    private final int mPlaceAddress;

    private final int mPlacePhoneNumber;

    private final int mImageResourceId;

    FragmentList(int placeName, int placeDescription, int placeAddress, int placePhoneNumber, int imageResourceId){
        mPLaceName = placeName;
        mPlaceDescription = placeDescription;
        mPlaceAddress = placeAddress;
        mPlacePhoneNumber = placePhoneNumber;
        mImageResourceId = imageResourceId;
    }

    public int getPLaceName(){
        return mPLaceName;
    }

    public int getPlaceDescription(){
        return mPlaceDescription;
    }

    public int getPlaceAddress(){
        return mPlaceAddress;
    }

    public int getPlacePhoneNumber(){
        return mPlacePhoneNumber;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }
}

