package com.example.mvvm_sample.model;

public class Person {
    String name,address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isValidInput(){
        return ((getName().equalsIgnoreCase("mou")) && (getAddress().equalsIgnoreCase("kolkata")));
    }
}
