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

// import java.util.Scanner;

// public class main{
//     public static void main(String[] args) {
//         Scanner scan = new Scanner (System.in);

//         System.out.println("inserisci numero del mese");
//         int a = scan.nextInt();

//      if(a==1){
//         System.out.println("è Gennaio ed ha 31 giorni");
//      }else if (a==2){
//         System.out.println(" è Febbraio ed ha 29 giorni");
//      }else if (a==3){
//         System.out.println("è Marzo ed ha 31 giorni");
//      }else{
//         System.out.println("gli altri mesi");
//      }
     



//     }
// }

//! esercizio 5

// Esercizio 5

// Scrivi un programma Java che,  dati in input da tastiera due numeri che rappresentano base e altezza, 
//stampi il valore dell'area di un triangolo (base*altezza/2)

// import java.util.Scanner;

// public class main{
//     public static void main(String[] args) {
//         Scanner scan=new Scanner(System.in);

//         System.out.println("inserisci base");
//         double base = scan.nextDouble();

//         System.out.println("inserisci altezza");
//         double altezza = scan.nextDouble();
     
//         double area = (base*altezza) / 2;

//         System.out.println("l'area è " + area);
        
//     }
// }

//! Esercizio 6

// Scrivi un programma Java che chieda all'utente  di scegliere tra due numeri 
// (0 per calcolare l'area di un triangolo e 1 per l'area di un quadrato) e, in base a quale figura geometrica ha scelto, 
// chiedere i dati mancanti e stampare l'area della figura geometrica richiesta.

// Esempio

// Se l'utente sceglie 0, chiedere di inserire base e altezza, calcolare l'area (base*altezza/2)  e stamparla.

// Se l'utente sceglie 1, chiedere inserire il valore del lato, calcolare  l'area (lato*lato)  e stamparla.

import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       
        System.out.println("inserisci 0 se vuoi calcolare l'area del triangolo altrimenti inserisci 1 per calcolare l'area del quadrato");
        int scelta = scan.nextInt();

       

        if(scelta == 0){
            System.out.println("inserisci base del triangolo (se con la virgola inserisci la virgola per i decimali)");
            double base = scan.nextDouble();

            System.out.println("inserisci altezza del triangolo (se con la virgola inserisci la virgola per i decimali)");
            double altezza = scan.nextDouble();

            double area = (base * altezza) / 2;

          System.out.println("l'area del triangolo è:" + area);


        }else{
            System.out.println("inserisci lato del quadrato (se con la virgola inserisci la virgola per i decimali)");
            double primoLato = scan.nextDouble();

            System.out.println("inserisci  secondo lato del quadrato (se con la virgola inserisci la virgola per i decimali)");
            double secondoLato = scan.nextDouble();

            double area = (primoLato * secondoLato);

          System.out.println("l'area del quadrato è:" + area);
        }
       
        
    }
}

