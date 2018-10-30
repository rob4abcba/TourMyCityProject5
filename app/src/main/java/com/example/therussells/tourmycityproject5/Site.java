package com.example.therussells.tourmycityproject5;

public  class Site {

    //class declaration with 4 instance variables for this fragment
    private final String placeName;

    private final String placeAddress;

    private final String placePhoneNumber;

    private final int imageResourceId;

    // constructors in which we instantiate the instance variables
    Site(String placeName, String placeAddress, String placePhoneNumber, int imageResourceId){
        this.placeName = placeName;
        this.placeAddress = placeAddress;
        this.placePhoneNumber = placePhoneNumber;
        this.imageResourceId = imageResourceId;
    }

    // get methods that return Strings and an integer
    String getPlaceName(){
        return placeName;
    }

    String getPlaceAddress(){
        return placeAddress;
    }

    String getPlacePhoneNumber(){
        return placePhoneNumber;
    }

    int getImageResourceId(){
        return imageResourceId;
    }
}

