package org.campus02.car;

public class DemoApp {
    public static void main(String[] args) {

        //Datentyp org.campus02.car.Car
        Car vwGolf8 = new Car();
        // Variablen Werte zuweisen
        // Attribute kann man sich wie Variablen vorstellen
        // String color = "Black"; im Hintergrund, nur dass der Datentyp org.campus02.car.Car ist
        vwGolf8.color = "Black";
        vwGolf8.countDoors=5;
        vwGolf8.name="Hurbey";
        vwGolf8.mileage=234_211;

        Car audiA3 = new Car();
        audiA3.color="Red";
        audiA3.countDoors=3;
        audiA3.name="Audi";
        audiA3.mileage=111_120;

        System.out.println(audiA3.name);
    }
}
