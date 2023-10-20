public class DemoStudentApp
{
    public static void main(String[] args)
    {
        int number = 4;
        Student susiSorglos = new Student();
        susiSorglos.firstName="Susi";
        susiSorglos.lastName="Sorglos";
        susiSorglos.department="iwi";
        susiSorglos.number=4711;
        susiSorglos.yearOfBirth=1999;

        Student maxMuster = new Student();
        maxMuster.firstName="Max";
        maxMuster.lastName="Muster";
        maxMuster.department="iwi";
        maxMuster.number=4712;
        maxMuster.yearOfBirth=2001;

        System.out.println("maxMuster.lastName = " + maxMuster.lastName);
        System.out.println("susiSorglos.lastName = " + susiSorglos.lastName);
    }
}
