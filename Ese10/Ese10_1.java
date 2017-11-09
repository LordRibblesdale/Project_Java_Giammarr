//Domenico Verde

import java.util.Scanner;

public class Ese10_1 {
  public static boolean isFound = false;

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

  public static int zeroTest(int x, int y) {
    if (x == 0) {
      isFound = true;
      return y;
    }   
    else if (y == 0) {
      isFound = true;
      return x;
    }
    else {
      isFound = false;
    }
  }

  public static int euclidean(int x, int y) {
    zeroTest(x, y);
    if (!isFound) {
      if (x > y) {
        int x1 = y;
        int y1 = x%y;
        if (x1 == 0) {
    	  return y1;
        }
 	else if (y1 == 0) {
	  return x1;        
        }
	else {
	  euclidean(x1, y1);
	}
      }
      else {
 	int y1 = x;
	int x1 = x%y;
        if (x1 == 0) {
          return y1;
        }
        else if (y1 == 0) {
          return x1;
        }
        else {
          euclidean(x1, y1);
        }
      }
    }
  }

  public static void main(String[] args) {
    boolean isFound = false;

    Scanner keyboard = new Scanner(System.in);

    int input = keyboard.nextInt();
    int input2 = keyboard.nextInt();

/*
    int res = bruteMCD(input, input2);
    System.out.println(res);
*/

    int res = euclidean(input, input2);
    System.out.println(res);

  }
}
