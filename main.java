//scrivi un programma Java che accetta tre numeri come input e stampare la media dei numeri.

import java.util.Scanner;

public class main{
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("inserisci un numero");
    int a = scan.nextInt();

    System.out.println("inserisci secondo numero");
    int b = scan.nextInt();

    System.out.println("inserisci terzo numero");
    int c = scan.nextInt();

      
    int d = (a + b + c) / 3 ;

    

    System.out.println("la media è " + d);

   }

}