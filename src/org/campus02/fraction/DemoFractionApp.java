package org.campus02.fraction;

public class DemoFractionApp
{
    public static void main(String[] args)
    {
        Fraction f = new Fraction(3,4);
        f.print();
        System.out.println(f.toDecimal());

        System.out.println("FractionCounter: "+Fraction.s_counter);

        Fraction f2 = new Fraction(5,7);
        f2.print();
        System.out.println(f.toDecimal());

        System.out.println("FractionCounter: "+Fraction.s_counter);

        Fraction f3 = f.multiplicate(f2);
        f3.print();
        System.out.println(f3.toDecimal());
        System.out.println(f3.toString());

        System.out.println("FractionCounter: "+Fraction.s_counter);

        Fraction f4 = f.multiplicate(f2, f3);
        System.out.println(f4);
        System.out.println(f4.toDecimal());
        System.out.println("FractionCounter: "+Fraction.s_counter);


        Pair<String, Integer> stringIntegerPair = new Pair<>("Susi",17);
        stringIntegerPair.print();

        Pair<String, Fraction> stringFractionPair = new Pair<>("Bruch1",f);
        stringFractionPair.print();
    }
}
