package org.ulpgc.is1.control;

import org.ulpgc.is1.model.Agenda;
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
        Group group1 = agenda.addGroup("trabajo");
        group1.addContact(person1);
        System.out.println(agenda.getContacts().size());
        System.out.println(group1.getMembers().size());
        group1.removeContact(person1);
        System.out.println(group1.getMembers().size());
    }
}
