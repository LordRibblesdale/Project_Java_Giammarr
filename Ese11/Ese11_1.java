//Domenico Verde

import java.util.Scanner;

public class Ese11_1 {
	public static int count = 1;
	public static long first = 0, second = 1, tmp;

	public static long fibonacciIter(int a) {
		for (count = 1; count < a; count++) {
			tmp = second;
			second += first;
			first = tmp;
		}
	 return second;
	}

	public static long fibonacciRec(int a) {
		long tmp2 = 0;

		if (count < a) {
			tmp = second;
			second += first;
			first = tmp;
			count++;
			return fibonacciRec(a); //every method call in itself has to be initialised with return (if the method isn't void)
		}
		else return second;
	}

	public static void main(String[] args) {
		int input1, input2;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("\nInserisci un numero intero positivo per calcolarne il numero di Fibonacci.\nInserisci il numero: ");
		input1 = keyboard.nextInt();

		System.out.println("\n\nIn che modo vuoi calcolare il numero di Fibonacci?\n 1: Metodo iterativo\n 2: Metodo ricorsivo\n");
		do {
			System.out.print("Inserisci qui la scelta: ");
			input2 = keyboard.nextInt();
		} while (input2 < 1 || input2 > 2);

		switch (input2) {
			case 1: {
				System.out.println(fibonacciIter(input1));
				break;
			}
			case 2: {
				System.out.println(fibonacciRec(input1));
				break;
			}
		}
	}
}
