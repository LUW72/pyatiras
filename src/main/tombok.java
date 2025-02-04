package main;

import java.util.Random;


public class tombok 
{
    private static final Random rnd = new Random();
    
    public static void main(String[] args) 
    {
        final int HOSSZ = 10;
        int[] tomb = new int[HOSSZ]; // Ezzel megmondom fixre, hogy hány elemet szeretnék beletenni, de nem módosítható
        //final int HOSSZ = tomb.length;
        
        //int[] tomb = {3, 5, 1}; // Itt előre feltöltjők elemekke, amiket aztán lecserélünk
        //final int HOSSZ = tomb.length;
        
        for (int i = 0; i < HOSSZ; i++) 
        {
            if (i % 2 == 0)
            {
                tomb[i] = 1;
            }
            else
            {
                tomb[i] = rnd.nextInt(0, 100_000);
            }
        }
        for (int i = 0; i < HOSSZ; i++) 
        {
            System.out.printf("%d - %d", i, tomb[i]);
        }
    }
}
