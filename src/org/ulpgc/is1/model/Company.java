package org.ulpgc.is1.model;

public class Company extends Contact{
    private String name;
    private String description;

    public Company(String name, String description, String email, String telephone, String address, int number, int floor, String city) {
        super(telephone, email,  address, number, floor, city);
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

}
