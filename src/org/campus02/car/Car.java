package org.campus02.car;

public class Car {
    // Datentyp org.campus02.car.Car erstellt
    public String color;
    public int countDoors;
    public int mileage;
    public String name;

    public int currentGear;

    public void setCurrentGear(int currentGear)
    {
        if(currentGear > 0 && currentGear < 8)
        {
            this.currentGear = currentGear;
        }
        else
        {
            System.out.println(currentGear + " not allowed");
        }
    }

    public int getCurrentGear()
    {
        return currentGear;
    }

    public void nextGear()
    {
        if(currentGear < 7)
        {
            currentGear++;
        }
        else
        {
            System.out.println("max gear reached!");
        }
    }

    public void lowerGear()
    {
        if (currentGear > 1)
        {
            currentGear--;
        }
        else
        {
            System.out.println("min gear reached!");
        }
    }
}
