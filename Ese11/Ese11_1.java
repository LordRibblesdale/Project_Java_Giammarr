//Domenico Verde

import java.util.Scanner;

public class Ese11_1 {	
	public static long fibonacciIter(int a) {
		long first = 1, second = 1, tmp;
		for (int count = 1; count <= a; count++) {
			tmp = second;
			second += first;
			first = tmp;
		}
		
		return second;
	}

	public static long fibonacciRec(int a) {
                
		if (count < a) {
			tmp = second;
                	second += first;
                	first = tmp;
		}
	}

	
	}
}
