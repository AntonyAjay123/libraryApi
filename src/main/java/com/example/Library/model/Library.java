package com.example.Library.model;

public class Library {
    String name,address,facilities;
    long number;

    public Library(String name, String address, String facilities, long number) {
        this.name = name;
        this.address = address;
        this.facilities = facilities;
        this.number = number;
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

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", facilities='" + facilities + '\'' +
                ", number=" + number +
                '}';
    }
}
