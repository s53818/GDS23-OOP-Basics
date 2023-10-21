package org.campus02.personenstack;

public class DemoApp
{
    public static void main(String[] args)
    {
        Person[] arr = new Person[5];
        // Allgemeine Stapelklasse, welche mit dem Objekt Person erstellt wird,
        // also ein PersonStack
        Stack<Person> ps = new Stack<Person>(arr);

        ps.push(new Person("max","mustermann",20,175));
        ps.push(new Person("susi","sorglos",30,153));

        System.out.println(ps.pop().toString());
        System.out.println(ps.pop().toString());
    }
}