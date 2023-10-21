package org.campus02.cards;

public class UnoGameDemoApp
{
    public static void main(String[] args)
    {

        Card[] cards = new Card[10];

        CardStack cs = new CardStack(cards);

        cs.push(new Card("red",5));
        cs.push(new Card("green",7));

        Card c = cs.pop();
        System.out.println(c.toString());

        cs.push(new Card("blue",1));
        cs.push(new Card("blue",2));
        cs.push(new Card("blue",4));

        c = cs.pop();
        System.out.println(c.toString());
        System.out.println(cs.pop().toString());
        System.out.println(cs.pop().toString());
        System.out.println(cs.pop().toString());
    }
}
