package org.campus02.cards;

public class CardStack
{
    // ein Array von verschiedenen Karten
    private Card[] cards;
    private int counter;

    // Konstruktor, welcher fuer genau einen Kartenstapel gilt, darum ist der counter auch nicht static
    public CardStack(Card[] cards)
    {
        this.cards = cards;
        counter = -1;
    }

    public void push(Card newCard)
    {
        // cards.length liefert das letzte element im array
        // deswegen nur hinzufuegen, solang der man innerhalb der laenge des arrays ist
        if (counter < cards.length-1)
        {
            counter++;
            cards[counter] = newCard;
        }
        else
        {
            System.out.println("stack is full");
        }
    }

    public Card pop()
    {
        // nur herunternehmen, wenn der counter groeßer 0 ist,
        // weil es keinen negativen Stapel geben kann
        if(counter >= 0)
        {
            Card element = cards[counter];
            counter--;
            return element;
        }

        return null;
    }
}
