// Domenico Verde

import java.util.Scanner;

public class Ese08_1 {
	public static void main(String[] args) {
		//int x, y = 0, z = 0, count = 0;
		int count = 0;
		boolean pyth;
		System.out.println("Terne pitagoriche!");
		
		for (int x = 1; x <= 500; x++) {
			for (int y = x; y <= 500; y++) {
				for (int z = y; z <= 500; z++) {
					pyth = x*x + y*y == z*z;
					if (pyth) {
						System.out.println("(" + x + ")^2" + "+" + "(" + y + ")^2" + " = " + "(" + z + ")^2");
						
						count++;
					}
				}
			}
		}
		
		System.out.println("Le terne pitagoriche sono: " + count);
	}
}