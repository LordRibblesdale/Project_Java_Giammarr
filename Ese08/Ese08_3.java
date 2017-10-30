//Domenico Verde

import java.util.Scanner;

public class Ese08_3 {
	public static void main(String[] args) {
		int day, month, year;
		Scanner keyboard = new Scanner(System.in);
		boolean isNotCorrectDay = false;
		String monthStr = "";
		
		System.out.println("Inserisci una data. Questa verrà analizzata: se corretta, verrà visualizzata\n\taltrimenti verrà richiesto l'input.\n");
		
		do {
			if (isNotCorrectDay) {
				System.out.println("Data errata. Reinserisci i valori per favore.\n");
			}
			
			do {
				System.out.print("Inserisci il giorno (entro 1 e 31): ");
				day = keyboard.nextInt();
			}
			while (day < 1 || day > 31);
		
		
			do {
				System.out.print("\nInserisci il mese (entro 1 e 12): ");
				month = keyboard.nextInt();
			}
			while (month < 1 || month > 12);
		
			System.out.print("\nInserisci l'anno: ");
			year = keyboard.nextInt();
		
			isNotCorrectDay = (month == 2 && day == 31) || (month == 2 && day == 30) || 
								(month == 4 && day == 31) || (month == 6 && day == 31) || 
									(month == 9 && day == 31) || (month == 11 && day == 31);
			
			if (!isNotCorrectDay) {
				if (year % 4 == 0 && year % 100 != 0 && month == 2 && day == 29) {
					isNotCorrectDay = false;
				}
				else if (year % 400 == 0 && month == 2 && day == 29) {
					isNotCorrectDay = false;
				}
				else {
					isNotCorrectDay = (month == 2 && day == 30) || (month == 2 && day == 29);
				}
			}
			System.out.println("Checking...");
		}
		while (isNotCorrectDay);
		
		switch (month) {
			case 1: 
					monthStr = "Gennaio";
					break;
			case 2:
					monthStr = "Febbraio";
					break;
			case 3:
					monthStr = "Marzo";
					break;
			case 4:
					monthStr = "Aprile";
					break;
			case 5:
					monthStr = "Maggio";
					break;
			case 6:
					monthStr = "Giugno";
					break;
			case 7:
					monthStr = "Luglio";
					break;
			case 8:
					monthStr = "Agosto";
					break;
			case 9:
					monthStr = "Settembre";
					break;
			case 10:
					monthStr = "Ottobre";
					break;
			case 11:
					monthStr = "Novembre";
					break;
			case 12: 
					monthStr = "Dicembre";
					break;
			}
			
		System.out.println("\nLa data è: " + day + " " + monthStr + " " + year);
	}
}