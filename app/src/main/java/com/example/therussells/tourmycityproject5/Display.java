package com.example.therussells.tourmycityproject5;

class Display {

    //class declaration with 5 instance variables for this fragment
    private final String placeName;

    private final String placeDescription;

    private final String placeAddress;

    private final String placePhoneNumber;

    private final int imageResourceId;

    // constructors in which we instantiate the instance variables
    Display(String placeName, String placeDescription, String placeAddress, String placePhoneNumber, int imageResourceId){
        this.placeName = placeName;
        this.placeDescription = placeDescription;
        this.placeAddress = placeAddress;
        this.placePhoneNumber = placePhoneNumber;
        this.imageResourceId = imageResourceId;
    }

    // get methods that return Strings and an integer
    String getPLaceName(){
        return placeName;
    }

    String getPlaceDescription(){
        return placeDescription;
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

