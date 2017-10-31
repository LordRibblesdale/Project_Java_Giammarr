//Domenico Verde
/*
 Esercizio 2 Scrivere un programma che chiede all’utente di inserire una frase e
  stampa la stringa inserita divisa a metà su due righe (se la lunghezza della stringa
  è dispari una delle due parti sarà più lunga dell’altra di un carattere.
  */

import java.util.Scanner;

public class Ese09_2 {
  public static void main(String[] args) {
    String str;
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Inserisci un testo e questo verra' diviso su due righe.\n Inserisci qui: ");
    str = keyboard.nextLine();

    int num = str.length();
    if (num % 2 == 0) {
      System.out.println(str.substring(0, num/2));
      System.out.println(str.substring((num/2)));
    }
    else {
      System.out.println(str.substring(0, (num/2)+1));
      System.out.println(str.substring((num/2)+1));
    }
  }
}
