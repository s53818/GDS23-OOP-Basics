package org.campus02.fraction;

public class Fraction
{
    private int nominator;
    private int denominator;

    public static int s_counter;

    public int getNominator()
    {
        return nominator;
    }

    public int getDenominator()
    {
        return denominator;
    }

    public void setDenominator(int denominator)
    {
        if(denominator != 0)
            this.denominator = denominator;
        else
            System.out.println("Denominator must be != 0");
    }

    public Fraction(int nominator, int denominator)
    {
        this.nominator = nominator;
        setDenominator(denominator);
        s_counter++;
    }

    public double toDecimal()
    {
        return nominator / (denominator * 1.0);
    }

    public void print()
    {
        System.out.println(nominator + " / " + denominator);
    }

    public String toString()
    {
        String result = nominator + " / " + denominator;
        return result;
    }
    public Fraction multiplicate(Fraction f2)
    {
        int nominator = this.nominator*f2.getNominator();
        int denominator = this.denominator * f2.getDenominator();

        //Fraction fnew = new Fraction(nominator,denominator);
        //return fnew;
        return new Fraction(nominator,denominator);
    }

    /*public Fraction multiplicate(Fraction f2, Fraction f3)
    {
        int nominator = this.nominator*f2.getNominator() * f3.getNominator();
        int denominator = this.denominator * f2.getDenominator() * f3.getDenominator();

        //Fraction fnew = new Fraction(nominator,denominator);
        //return fnew;
        return new Fraction(nominator,denominator);
    }*/

    public Fraction multiplicate(Fraction f2, Fraction f3){
        return multiplicate(f2).multiplicate(f3);
    }
}
