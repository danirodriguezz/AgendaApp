package org.ulpgc.is1.model;

public class Person extends Contact{
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName, String email, String telephone, String address, int number, int floor, String city) {
        super(telephone, email, address, number, floor, city);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Returns the Person name
    public String getName() {
        return firstName + " " + lastName;
    }

    
}
