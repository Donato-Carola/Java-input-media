//!PRIMO ESERCIZIO

//scrivi un programma Java che accetta tre numeri come input e stampare la media dei numeri.

// import java.util.Scanner;

// public class main{
//    public static void main(String[] args) {
//     Scanner scan = new Scanner(System.in);

//     System.out.println("inserisci un numero");
//     int a = scan.nextInt();

//     System.out.println("inserisci secondo numero");
//     int b = scan.nextInt();

//     System.out.println("inserisci terzo numero");
//     int c = scan.nextInt();

      
//     int d = (a + b + c) / 3 ;

//     System.out.println("la media è " + d);

//    }

// }


//!Secondo esercizio 

//Scrivi un programma Java che prende due numeri da tastiera e stampa quello è più grande

// import java.util.Scanner;

// public class main{
//    public static void main(String[] args) {
//     Scanner scan = new Scanner(System.in);

//     System.out.println("inserisci primo numero");
//     int a = scan.nextInt();

//     System.out.println("inserisci secondo numero");
//     int b = scan.nextInt();

//     if(a>b){
//         System.out.println("il numero più grande è: " + a);
//     }else{
//         System.out.println("il numero più grande è:" + b);
//     }
   

//     System.out.println();

//    }

// }

//! terzo esercizio

//Scrivi un programma Java che prende due numeri da tastiera e stampa 
//“I numeri inseriti sono uguali” se i due numeri sono uguali e viceversa stampa “I numeri inseriti sono diversi”.

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);

//         System.out.println("inserisci primo nuemro");
//        int a = scan.nextInt();

//        System.out.println("inserisci secondo numero");
//        int b = scan.nextInt();

//        if(a==b){
//         System.out.println("i due numeri sono uguali");
//        }else{
//         System.out.println("i due nuemri sono diversi");
//        }


//     }
// }

// !Esercizio 4

// Scrivi un programma Java che restituisce il numero di giorni di un mese dato in input dall'utente. 
//Il mese � dato sotto forma di intero, ad esempio 3 corrisponde a marzo. Ignorare gli anni bisestili.

// Esempio

// Dati di test

// Immettere un numero di mese: 2

// Uscita prevista:

// Febbraio ha 28 giorni

import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("inserisci numero del mese");
        int a = scan.nextInt();

     if(a==1){
        System.out.println("è Gennaio ed ha 31 giorni");
     }else if (a==2){
        System.out.println(" è Febbraio ed ha 29 giorni");
     }else if (a==3){
        System.out.println("è Marzo ed ha 31 giorni");
     }else{
        System.out.println("gli altri mesi");
     }
     



    }
}