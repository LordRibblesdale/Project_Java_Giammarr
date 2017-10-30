//Domenico Verde

import java.util.Scanner;

public class Ese08_2 {
	public static void main(String[] args) {
		int x1, num1, num2; //x1 = input / num1 = numero righe / num2 = numero di lettere da aggiungere nel secondo e quarto triangolo
		String ch, row;											// 			dopo gli spazi vuoti
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Verrà disegnato un triangolo, inserisci la lettera per disegnarlo\n\t e la lunghezza del lato.");
		
		System.out.print("Inserisci il carattere: ");	//Messo prima il carattere per evitare di inserire
		ch = keyboard.next();							// la variabile varChar = keyboard.nextLine(); per integrare \n
		
		do {
			System.out.print("\nInserisci la lunghezza: ");
			x1 = keyboard.nextInt();
		}
		while (x1 < 3 || x1 >30);
		
		num2 = x1;	//num2 sarà necessario per il calcolo di spazi del secondo, terzo e quarto triangolo
		
		//Primo Triangolo
		row = ch;
		
		for (num1 = 1; num1 <= x1; num1++) {		//Disegna il triangolo dalla riga piu piccola a quella piu grande
			System.out.println(row);
			row += ch;								//Aggiunge la lettera a row in sequenza fino a creare il primo triangolo
		}
		
		System.out.println();
		
		//Secondo Triangolo
		
		for (num1 = 1; num1 <= x1; num1++) {
			row = "";								//Inizializzo riga vuota
			for (num2 = num1; num2 < x1; num2++) {	//Chiamo num2 per mantenermi i valori di x1 senza cambiarla
				row += " ";							//Genero tanti spazi nel primo caso affinchè l'ultimo carattere sia la lettera
			}										//	; appena ricomincerà il ciclo, questo genererà spazi tranne 
													//		l'ultimo carattere+1 (quindi uno spazio in meno e un carattere in piu)
			
			while (num2-num1 < x1) {														//TODO: controllare con for (num2; ...
				row += ch;							//Qui aggiungerò il carattere, e a ogni nuovo ciclo aggiungerò num2++ caratteri
				num2++;								//	alla fine della riga
			}
			
			System.out.println(row);
		}
		
		System.out.println();
		
		//Terzo Triangolo
/*		row = ch;									//Versione con substring
		num2 = x1;
		
		for (num1 = 1; num1 <= x1; num1++) {
			row += ch;		
		}
		
		for (num1 = x1; num1 >= 0; num1--) {		//Disegna il triangolo dalla riga piu grande a quella piu piccola
			row = row.substring(0, num2);
			System.out.println(row);
			num2--;
		}
*/

		for (num1 = 1; num1 <= x1; num1++) {		
			row = ch;
			for (num2 = num1; num2 < x1; num2++) {	//Genero una riga che avrà il primo carattere piu num1 volte lo stesso carattere
				row += ch;							//	per arrivare alla riga completa di ch carattere
			}										// Ricominciato il ciclo, num2 = num1 nel ciclo for, e sarà num1+1 < x1, quindi
													// 	una riga piu piccola di caratteri
			/*
			while (num2-num1 < x1) {
				row += " ";
				num2++;
			}
			*/
			
			System.out.println(row);
		}
		
		System.out.println();
		
		//Quarto Triangolo
		
		for (num1 = 1; num1 <= x1; num1++) {				//Genero una riga con num2 = x1-num1 spazi cosicchè: [presupponendo x1 = 5
			row = "";										// 	[1] num2 = 5-1 = 4 (perchè alla fine ci dovranno essere 4 spazi e 1 carattere
			for (num2 = x1-(num1); num2 < x1-1; num2++) {	//	Quando x1-num1 = 0, num2 = 5 la generazione di spazi si ferma perchè  	
				row += " ";									// num2 < x1-1 (-1 per integrare lo spazio row = ""; (usato per rendere vuota la stringa
			}												// Da 1 a 5 sono stati generati da 0 a 4 spazi
			
			for (num2 = num1; num2 <= x1; num2++) {
				row += ch;									//Verrà aggiunto il carattere da 5 volte (se x1 = 5) a 1 volta perchè da 5 a 1 volta sono
			}												// 5 cicli (quindi 5 righe da 5 a 1 carattere)(quindi da 0 a 4 spazi)
						
			System.out.println(row);
			
		}				
	}
}