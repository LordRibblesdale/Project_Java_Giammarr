//Domenico Verde
/*
 Esercizio 3 (più complesso): Scrivere un programma che chiede all’utente di inserire
  una frase e una parola e poi riscrive "censurando" la parola sostituendola con degli * .
 */

import java.util.Scanner;

public class Ese09_3 {
  public static void main(String[] args) {
    String str1, word, strReplace = "";
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Inserisci una frase con una parola da censurare.\nInserisci qui: ");
    str1 = keyboard.nextLine();
    System.out.print("\nInserisci la parola da censurare: ");
    word = keyboard.nextLine();

    int num = word.length() +1;

    for (int count = 1; count < num; count++) {
      strReplace += "*";
    }

    System.out.println("Frase censurata:\n\t" + str1.replace(word, strReplace));
  }
}
