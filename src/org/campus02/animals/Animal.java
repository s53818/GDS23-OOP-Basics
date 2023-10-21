package org.campus02.animals;

public class Animal
{
    private String name;
    private int weight;

    public Animal(String name)
    {
        setName(name);
        this.weight = 0;
    }

    public Animal(String name, int weight)
    {
        setName(name);
        setWeight(weight);
    }

    public void print()
    {
        System.out.println(name + ": " + weight + " gramms");
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        if (name.length() > 3)
        {
            this.name = name;
        }
        else
        {
            System.out.println("name needs to be longer than 3 characters");
        }
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        if (weight > 100 && weight < 75000)
        {
            this.weight = weight;
        }
        else
        {
            System.out.println("just values between 100 and 75000 gramms allowed");
        }
    }
}
