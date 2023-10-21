package org.campus02.personenstack;

// spitze Klammern um eine allgemeine Klasse zu erstellen
// T ist der Platzhalter, welcher beim Aufruf in einer anderen Klasse
// durch das jeweilige Objekt, welches gestapelt werden soll ersetzt
// zB.: Person oder Card
public class Stack<T>
{
    private T[] arr;

    private int counter;

    public Stack(T[] t)
    {
        this.arr = t;
        counter = -1;
    }

    public void push(T t)
    {
        if (counter < arr.length-1)
        {
            counter++;
            arr[counter]=t;
        }
        else
        {
            System.out.println("stack is full");
        }
    }

    public T pop()
    {
        if(counter >= 0)
        {
            T t = arr[counter];
            counter--;
            return t;
        }

        return null;
    }
}
