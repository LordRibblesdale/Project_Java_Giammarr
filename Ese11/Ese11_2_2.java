//Domenico Verde

import java.util.Scanner;

public class Ese11_2_2 {
  public static void isPerfect(long num) {
    long num1, half, sum;

    for (num1 = 6; num1 <= num; num1++) {
      sum = 0;
      half = num1/2;
      for (long count = 1; count <= half; count++) {
        if (num1%count == 0) {
          sum += count; //dichiarare l'exception fuori range long
        }
      }
      if (sum == num1) {
        System.out.print(sum + " ");
      }
    }
  }

  public static boolean isPerfectBool(long num) {
    long half = num/2, sum = 0;

    for (long count = 1; count <= half; count++) {
      if (num%count == 0) {
        sum += count; //dichiarare l'exception fuori range long
      }
    }
    if (sum == num) {
      return true;
    }
    else {
      return false;
    }
  }

  public static void main(String[] args) {
    long input;
    Scanner keyboard = new Scanner(System.in);

    System.out.print("\nInserisci un numero (verra' controllato se e' perfetto).\nVerranno stampati tutti i numeri perfetti compresi tra 6 e l'input\nInserisci qui: ");
    do {
      input = keyboard.nextLong();
    } while (input < 6);

    //System.out.println(isPerfect(input));
    isPerfect(input);

    if (isPerfectBool(input)) {
      System.out.println("\nIl numero e' perfetto!");
    }
    else {
      System.out.println("\nIl numero non e' perfetto.");
    }
  }
}
