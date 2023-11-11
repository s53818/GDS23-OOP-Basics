package org.campus02.fraction;

public class Pair<P1, P2>
{
    private P1 value1;
    private P2 value2;

    public Pair(P1 value1, P2 value2)
    {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void print()
    {
        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
    }
}
