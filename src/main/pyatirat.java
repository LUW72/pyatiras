package main;

import java.util.Random;


public class pyatirat {

    private static final Random rnd = new Random(); // import neve és típusa?, nagybetűs típusok mindig new-val aduk értéket
    
    public static void main(String[] args) 
    {
        System.out.println("Az első 10 páros szám összege: ");
        int osszeg = 0;
        int db = 0;
        int szam = 0;
        
        while (db < 10)
        {
            System.out.print(szam + ", ");
            osszeg += szam;
            szam += 2;
            db += 1 ;
        }
        System.out.println("\nÖsszesen: " + osszeg);
        
        System.out.println("\n10..15 közötti számok, kivéve 13:");
        
        int n = rnd.nextInt(10, 16); // 10 és 15 közti érték
        while (n != 13)
        {
            System.out.printf(n + ", ");
            n = rnd.nextInt(10, 16);
        }
        System.out.println("\n");
        
        System.out.println("Egyjegyű számok (while): ");
        int i = 0;
        while(i < 10)
        {
            System.out.printf(i + " ");    
            i++;
        }
        System.out.println("\n");
            
        System.out.println("Egyjegyű számok (for): ");

        for (int j = 0; j < 10; j++) 
        {
            System.out.printf(j + " ");
        }
        System.out.println("\n");
        
        
        System.out.println("páratlan egyjegyű számok: ");
        for (int j = 1; j < 10; j+=2) 
        {
            System.out.printf(j + " ");
        }
        System.out.println("\n");
        
        System.out.println("3 - -3-ig abs értékben:");
        for (int j = 3; j >= -3; j--) 
        {
            System.out.printf("|%2d| = %-2d\n", j, Math.abs(j));
        }
    }
    
}
