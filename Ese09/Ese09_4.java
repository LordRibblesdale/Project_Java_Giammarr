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

    boolean isCorrectInput = true, isCorrectDay = false, isLeapDay;
    Scanner keyboard = new Scanner(System.in);

      do {
        if (!isCorrectInput) {
	  if(!isCorrectDay) {
          System.out.println(strErr);
       	  }
	 }

        do {
          System.out.print("Scrivi la tua data di nascita (col formato dd/mm/yyyy): ");
          date = keyboard.nextLine();
          isCorrectInput = date.length() == 10 && date.charAt(2) == '/' && date.charAt(5) == '/';
        } while (!isCorrectInput);

        day = Integer.parseInt(date.substring(0,2));
        month = Integer.parseInt(date.substring(3,5));
        year = Integer.parseInt(date.substring(6,date.length()));

        if ((day >= 1 || day <= 31) && (month >= 1 || month <= 12) && (year >= 1900 || year <= 2015)) {
		isCorrectInput = true;
		
		
	    if (month == 2) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			isLeapDay = true;		
		}
		else isLeapDay = false;
		
		if (day < 30 && isLeapDay) {
			isCorrectDay = true;		
		}
		else if (day < 29 && !isLeapDay) {
			isCorrectDay = true;
		}
		else {
			isCorrectDay = false;
	   		strErr = strErr2;
		}
	   }

	   if (month == 4 || month == 6 || month == 9 || month == 11) {
		if (day != 31) {
			isCorrectDay = true;
		}
       	   }
	} 
	else isCorrectInput = false;
      } while (!isCorrectInput || !isCorrectDay);

      switch (month) {                              //TODO: reset switch if input is wrong
        case 1: {
          monthStr = "Gennaio";
          break;
        }
        case 2: {
          monthStr = "Febbraio";
          break;
        }
        case 3: {
          monthStr = "Marzo";
          break;
        }
        case 4: {
          monthStr = "Aprile";
          break;
        }
        case 5: {
          monthStr = "Maggio";
          break;
        }
        case 6: {
          monthStr = "Giugno";
          break;
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
          monthStr = "Settembre";
          break;
        }
        case 10: {
          monthStr = "Ottobre";
          break;
        }
        case 11: {
            monthStr = "Febbraio";
            break;
        }
        case 12: {
          monthStr = "Dicembre";
          break;
        }
    }

    System.out.println("La data di nascita e': " + day + " " + monthStr + " " + year);
  }
}
