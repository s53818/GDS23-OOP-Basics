package org.campus02.cards;

public class Card
{
    private int value;
    private String color;

    // gleich im Konstruktor pruefen, da die Farbe und der Wert der einzelnen Karten spaeter nicht mehr
    // geaendert werden soll und darf
    public Card(String color, int value)
    {
        if(color.equals("blue") || color.equals("green") || color.equals("yellow") || color.equals("red"))
            this.color = color;
        else
            System.out.println("Color not allowed, just blue, green, yellow or red");
        if (value > 0 && value <=9)
            this.value = value;
        else
            System.out.println("Just numbers between 0-9 are allowed.");
    }

    public int getValue()
    {
        return value;
    }

    public String getColor()
    {
        return color;
    }

    // toString um eine einfache Ausgabe zu haben
    @Override
    public String toString()
    {
        return "Card{" +
                "value=" + value +
                ", color='" + color + '\'' +
                '}';
    }
}
