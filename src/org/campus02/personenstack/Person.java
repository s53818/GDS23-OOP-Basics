package org.campus02.personenstack;

public class Person
{
    public String firstName;
    public String lastName;
    public int age;
    public int height;

    public Person(String firstName, String lastName, int age, int height)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getAge()
    {
        return age;
    }

    public int getHeight()
    {
        return height;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
