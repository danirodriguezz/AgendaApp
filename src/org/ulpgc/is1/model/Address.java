package org.ulpgc.is1.model;

public class Address {
    private String address;
    private int number;
    private int floor;
    private String city;
    public Address(String address, int number, int floor, String city) {
        this.address = address;
        this.number = number;
        this.floor = floor;
        this.city = city;
    }
}
