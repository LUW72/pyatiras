package main;

import java.util.Scanner;

public class szamjegyek 
{
    static final Scanner scn = new Scanner(System.in);  // Create a Scanner object
    
    public static void main(String[] args) 
    { 
        // feladat isnmertetése
        System.out.println("Ismétléssel vagy Nélküle? (i/n)");
        String tipus = scn.nextLine();
        
        System.out.println("2,3,4 jegyekből a számok\n");
        boolean ism;
        if (tipus == "i")
        {
            ism = true;
            System.out.println(" ismétléssel");
        }
        else
        {
            ism = false;
            System.out.println(" ismétlés nélkül");
        }
        // feladat elkészítése:
        int db_ism = 0;
        int db_ism_nlk = 0;
        for (int i = 2; i < 5; i++) 
        {
            for (int j = 2; j < 5; j++) 
            {
                for (int k = 2; k < 5; k++) 
                {
                    // választás kezelése:
                    if (ism)
                    {
                        db_ism ++;
                        System.out.printf("%d%d%d\n", i, j, k);
                    }
                        
                    else if ((i != j) && (i != k) && (j != k))
                    {
                        db_ism_nlk++;
                        System.out.printf("%d%d%d\n", i, j, k);
                    }
                }
            }
        }
        // statisztika megjelenítése:
        if (ism)
        {
            System.out.println("\nAz esetek száma ismétléssel:" + db_ism);
        }
        else 
        {
            System.out.println("\nAz esetek száma ismétlés nélkül:" + db_ism_nlk);
        }
    }
}
