public class Car {
    // Datentyp Car erstellt
    public String color;
    public int countDoors;
    public int mileage;
    public String name;

    public int currentGear;

    public void setCurrentGear(int newGear)
    {
        if(newGear > 0 && newGear < 8)
        {
            currentGear = newGear;
        }
        else
        {
            System.out.println(newGear + " not allowed");
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
