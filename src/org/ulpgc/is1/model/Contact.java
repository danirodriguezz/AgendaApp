package org.ulpgc.is1.model;

public abstract class Contact {
    private String telephone;
    private String email;
    private Address address;

    public Contact(String telephone, String email, String address, int number, int floor, String city) {
        setTelephone(telephone);
        setEmail(email);
        setAddress(address, number, floor, city);
    }

    public abstract String getName();

    public void setAddress(String address, int number, int floor, String city) {
        this.address = new Address(address, number, floor, city);
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
