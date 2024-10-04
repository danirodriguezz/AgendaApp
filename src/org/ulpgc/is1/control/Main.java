package org.ulpgc.is1.control;

import org.ulpgc.is1.model.Agenda;
import org.ulpgc.is1.model.Company;
import org.ulpgc.is1.model.Group;
import org.ulpgc.is1.model.Person;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Person person1 = agenda.addPerson(
                "Daniel",
                "Rodriguez Alonso",
                "daniel@correo.com",
                "648537315",
                "Avenida principal",
                1,
                5,
                "Santa Cruz");
        Person person2 = agenda.addPerson("Luis",
                "Alfonso Suarez",
                "luis@correo.com",
                "648537316",
                "Triana",
                3,
                2,
                "Las Palmas");
        Company company1 = agenda.addCompany(
                "Company1",
                "Description",
                "company@company.com",
                "123456789",
                "Company Address",
                2,
                1,
                "City of company"
        );
        //try to add the same person and contact to the agenda
        Person person3 = agenda.addPerson("Luis",
                "Alfonso Suarez",
                "luis@correo.com",
                "648537316",
                "Triana",
                3,
                2,
                "Las Palmas"); // The contact already exists in this agenda
        Company company2 = agenda.addCompany(
                "Company1",
                "Description",
                "company@company.com",
                "123456789",
                "Company Address",
                2,
                1,
                "City of company"
        ); // The contact already exists in this agenda
        Group group1 = agenda.addGroup("Work");
        Group group2 = agenda.addGroup("Work"); // Error: the name of this group already exist ...
        group1.addContact(person1);
        // Try add the same contact
        group1.addContact(person1);
        group1.addContact(person2);
        System.out.println(agenda.getContacts().size()); // 3
        System.out.println(group1.getMembers().getFirst().getDate());  // dd-MM-yyyy
        group1.removeContact(0);
        System.out.println(group1.getMembers().size()); // 1
    }
}
