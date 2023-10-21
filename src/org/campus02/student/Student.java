package org.campus02.student;

import java.util.Date;

public class Student
{
    private String firstName;
    private String lastName;
    private int number;
    private String department;
    private int yearOfBirth;

    public Student(String firstName, String lastName, int number, String department, int yearOfBirth)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.department = department;
        this.yearOfBirth = yearOfBirth;
    }

    public Student()
    {

    }

    public void init(String firstName, String lastName, int number, String department, int yearOfBirth)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setNumber(number);
        setDepartment(department);
        setYearOfBirth(yearOfBirth);
    }
    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        if(lastName.length() > 1 && lastName.length() < 35)
            this.lastName = lastName;
        else
            System.out.println("Name passt nicht");
    }

    public int getNumber()
    {
        return number;
    }

    public void setNumber(int number)
    {
        if (number >= 1_000_000 && number <= 9_999_999)
            this.number = number;
        else
            this.number = 1_000_000;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department)
    {
        if(department.length() <= 3)
            this.department = department;
        else
            System.out.println("Abkürzung zu lange: " +department);
    }

    public int getYearOfBirth()
    {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth)
    {
        this.yearOfBirth = yearOfBirth;
    }
}
