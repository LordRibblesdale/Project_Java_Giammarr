//Domenico Verde

import java.util.Scanner;

public class Ese10_1 {
  public static int bruteMCD(int x, int y) {
    int mcd = 0;

    labelTest: {
      for (int x1 = x; x1 >= 1; x1--) {
        for (int y1 = y; y1 >= 1; y1--) {
          if (x%x1 == y%y1 && x1 == y1) {
            mcd = x1;
            break labelTest;
          }
        }
      }
    }
    return mcd;
  }

  public static int euclidean(int x, int y) {

  }

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    int input = keyboard.nextInt();
    int input2 = keyboard.nextInt();

    int res = bruteMCD(input, input2);
    System.out.println(res);


  }
}
