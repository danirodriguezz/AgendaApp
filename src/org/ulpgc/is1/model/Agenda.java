package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contact> contacts;
    private List<Group> groups;

    public Agenda() {
        this.contacts = new ArrayList<>();
        this.groups = new ArrayList<>();
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public Person addPerson(String firstName, String lastName, String email, String telephone, String address, int number, int floor, String city) {
        // Create the new instance of Person
        Person newPerson = new Person(firstName, lastName, email, telephone, address, number, floor, city);

        // Add the person to the list of contacts
        contacts.add(newPerson);
        return newPerson;
    }

    public void addCompany(String name, String description, String email, String telephone, String address, int number, int floor, String city) {
        // Create the new instance of Person
        Company newCompany = new Company(name, description, email, telephone, address, number, floor, city);

        // Add the company to the list of contacts
        contacts.add(newCompany);
    }

    public Group addGroup(String name) {
        // Create the new group
        Group newGroup = new Group(name);

        // Add group to the list of groups
        groups.add(newGroup);
        return newGroup;
    }

    public Contact getContactList(int index) {
        return contacts.get(index);
    }
}
