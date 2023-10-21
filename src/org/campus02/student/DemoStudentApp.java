package org.campus02.student;

public class DemoStudentApp
{
    public static void main(String[] args)
    {
        int number = 4;
        Student susiSorglos = new Student("Susi","Sorglos",1_000_001,"iwi",1999);
        /*susiSorglos.setFirstName("Susi");
        susiSorglos.setLastName("Sorglos");
        susiSorglos.setDepartment("iwi");
        susiSorglos.setNumber(4711);
        susiSorglos.setYearOfBirth(1999);*/

        //susiSorglos.init("Susi","Sorglos",1_000_001,"iwi",1999);

        Student maxMuster = new Student();
        /*maxMuster.setFirstName("Max");
        maxMuster.setLastName("Mustermann");
        maxMuster.setDepartment("iwi");
        maxMuster.setNumber(4712);
        maxMuster.setYearOfBirth(2000);*/

        maxMuster.init("Max","Mustermann",1_000_002,"iwi",2000);

        Student john = new Student("John", "Doe", 1_000_003,"iwi",2001);
        //john.init("John", "Doe", 1_000_003,"iwi",2001);

        System.out.println("maxMuster.lastName = " + maxMuster.getLastName());
        System.out.println("susiSorglos.lastName = " + susiSorglos.getLastName());
        System.out.println("john.lastName = " + john.getLastName());
    }
}
