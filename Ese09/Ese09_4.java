//Domenico Verde
/*
 Esercizio 4 (più complesso variante di Ese08-3): Scrivere un programma che chiede
 all’utente di inserire la sua data di nascita nel formato gg/mm/aaaa e poi controlla
 se si tratta di una data valida. Se non è valida, dice anche il perchè.
 In particolare mm deve avere valori tra 01 e 12; gg deve avere valore tra 01 e
 valore valido per il mese mm; assumiamo inoltre che aaaa abbia un valore valido
 se è tra 1900 e 2015).
 */

import java.util.Scanner;

public class Ese09_4 {
  public static void main(String[] args) {
    int day, month, year;
    String date, monthStr = "", strErr = "", strErr1, strErr2;

    strErr1 = "La data non e' corretta: quel mese non ha il giorno 31.\n";
    strErr2 = "La data non e' corretta: quell'anno non e' bisestile.\n";

    boolean isLeapDay, isCorrectInput = true, isCorrectDay = true;
    Scanner keyboard = new Scanner(System.in);

    do {
      System.out.println(strErr);
      do {
        if (!isCorrectInput) {
          System.out.println("Data non corretta, reinserirla.");
        }

        do {
          System.out.print("Scrivi la tua data di nascita (col formato dd/mm/yyyy): ");
          date = keyboard.nextLine();
        } while (date.length() > 10 && date.charAt(2) != '/' && date.charAt(5) != '/');

        day = date.codePointCount(0,1);       //TODO FIX this bad input (day prende la data, month e year solo una cifra)
        month = date.codePointCount(3,4);
        year = date.codePointCount(6,10);

        System.out.println(date + " " + month + " " + year);

        isCorrectInput = (day >= 1 || day <= 31) && (month >= 1 || month <= 12) && (year >= 1900 || year <= 2015);
      } while (!isCorrectInput);

      switch (month) {
        case 1: {
          monthStr = "Gennaio";
          break;
        }
        case 2: {
          if (day < 30) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
              monthStr = "Febbraio";
              break;
            }
            else if (day != 29) {
              monthStr = "Febbeaio";
              break;
            }
            else {
              isCorrectDay = false;
              strErr = strErr2;
              break;
            }
          }
        }
        case 3: {
          monthStr = "Marzo";
          break;
        }
        case 4: {
          if (day != 31) {
            monthStr = "Aprile";
            break;
          }
          else {
            isCorrectDay = false;
            strErr = strErr1;
            break;
          }
        }
        case 5: {
          monthStr = "Maggio";
          break;
        }
        case 6: {
          if (day != 31) {
            monthStr = "Giugno";
            break;
          }
          else {
            isCorrectDay = false;
            strErr = strErr1;
            break;
          }
        }
        case 7: {
          monthStr = "Luglio";
          break;
        }
        case 8: {
          monthStr = "Agosto";
          break;
        }
        case 9: {
          if (day != 31) {
            monthStr = "Settembre";
            break;
          }
          else {
            isCorrectDay = false;
            strErr = strErr1;
            break;
          }
        }
        case 10: {
          monthStr = "Ottobre";
          break;
        }
        case 11: {
          if (day != 31) {
            monthStr = "Febbraio";
            break;
          }
          else {
            isCorrectDay = false;
            strErr = strErr1;
            break;
          }
        }
        case 12: {
          monthStr = "Dicembre";
          break;
        }
      }
    } while (isCorrectDay == false);

    System.out.println("La data di nascita e': " + day + " " + monthStr + " " + year);
  }
}
