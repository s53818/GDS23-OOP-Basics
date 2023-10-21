package org.campus02.person;

import org.campus02.student.Student;

public class DemoPersonApp
{
    public static void main(String[] args)
    {
        Person susi = new Person();
        susi.firstName="Susi";
        susi.lastName="Sorglos";
        susi.age=29;

        printPerson(susi);

        Person max = new Person();

        max.firstName="Max";
        max.lastName="Mustermann";
        max.age=39;

        printPerson(max);
    }

    public static void printPerson(Person person)
    {
        System.out.println(person.firstName + " "+ person.lastName + ", " + person.age + " Jahre");
    }
}
