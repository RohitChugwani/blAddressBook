package com.bridgelabz;

public class Person {
    String first_name;
    String last_name;
    String address;
    String city;
    String state;
    String contact_number;
    String zip;

    void setFirst_name(String first_name){
        this.first_name = first_name;
    }
    void setLast_name(String last_name){
        this.last_name = last_name;
    }
    void setAddress(String address){
        this.address = address;
    }
    void setCity(String city){
        this.city = city;
    }
    void setState(String state){
        this.state = state;
    }
    void setContact_number(String contactNumber)
    {
        this.contact_number = contactNumber;
    }
    void setZip(String zip){
        this.zip = zip;
    }
    String getFirst_name(){
        return first_name;
    }
    String getLast_name(){
        return last_name;
    }
    String getAddress(){
        return address;
    }
    String getCity(){
        return city;
    }
    String getState(){
        return state;
    }
    String getContact_number(){
        return contact_number;
    }
    String getZip(){
        return zip;
    }

}
