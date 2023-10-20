public class HospitalDemoApp
{
    public static void main(String[] args)
    {
        Person patient = new Person();
        patient.firstName = "John";
        patient.lastName = "Doe";
        patient.age = 89;
        patient.height = 165;

        patient.print();
    }
}
