//Domenico Verde

public class VerdeTest_Scacchiera {
  public static int[] indexB1 = {0, 0}, indexB2 = {0, 0}, indexN1 = {0, 0}, indexN2 = {0, 0};

  public static char[][] initialise (char[][] a) {
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        a[i][j] = '-';
      }
    }
    return a;
  }

  public static char[][] placeB (char[][] a) {
    double a1, c = 0;
    int b, d = 0;


    for (int b1 = 0; b1 < 2; b1++) {
      a1 = Math.random();
      b = (int)Math.floor(a1*7)+1;
      c = Math.random();
      d = (int)Math.floor(c*7)+1;

      a[b][d] = 'B';

      switch (b1) {
        case 0: {
          indexB1 = {b, d};

          break;
        }
        case 1: {
          indexB2 = {b, d};
          break;
        }
      }
    }
    return a;
  }

  public static char[][] placeN (char[][] a) {
    double a1 = 0, c = 0;
    int b = 0, d = 0, count = 0;
    boolean isFound = false;

    while(!isFound && count != 2) {
      a1 = Math.random();
      b = (int)Math.floor(a1*8);
      c = Math.random();
      d = (int)Math.floor(c*8);

      if (a[b][d] == 'B') {
        isFound = false;
      }
      else {
        a[b][d] = 'N';

        switch (count) {
          case 0: {
            indexN1 = {b, d};
            break;
          }
          case 1: {
            indexN2 = {b, d};
            break;
          }
        }
        count++;
      }
    }
    return a;
  }


  public static void print(char[][] a) {
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        System.out.print("  " + a[i][j] + "  ");
      }
      System.out.println();
    }
  }

  public static void move(char[][] a, char c) {
    int[] numsN = new int[2], numsB = new int[2];
    int count1 = 0, count2 = 0;
    switch (c) {
      case 'B': {
        for (int i = 0; i < 8; i++) {
          count1 = 0;
          count2 = 0;
            for (int j = 0; j < 8; j++) {
              if (a[i][j] == 'N') {
                numsN[count1] = j;
                count1++;
              }
              else if (a[i][j] == 'B') {
                numsB[count2] = j;
                count2++;
              }
            }
            if (numsN[0])
          }
        }
      }
    }
  }

  public static void main(String[] args) {
    char[][] chess = new char[8][8];
    initialise(chess);
    placeB(chess);
    placeN(chess);

    print(chess);

  }
}
