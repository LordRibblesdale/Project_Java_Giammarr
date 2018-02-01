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
      b = (int)Math.floor(a1*8);
      c = Math.random();
      d = (int)Math.floor(c*8);

      a[b][d] = 'B';

      switch (b1) {
        case 0: {
          indexB1[0] = b;
          indexB1[1] = d;
          break;
        }
        case 1: {
          indexB2[0] = b;
          indexB2[1] = d;
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
            indexN1[0] = b;
            indexN1[1] = d;
            break;
          }
          case 1: {
            indexN2[0] = b;
            indexN2[1] = d;
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
      System.out.println("");
    }
    System.out.println("\n");
  }

  public static boolean move(char[][] a, int[] index, char c) {
    boolean move = false;

    moving:
    switch (c) {
      case 'B': {
        for (int sx = index[1]; sx >= 0; sx--) {
          if (a[index[0]][sx] == 'N') {
            a[index[0]][sx] = c;
            a[index[0]][index[1]] = '-';
            move = true;
            break moving;
          }
        }
        for (int dx = index[1]; dx < 8; dx++) {
          if (a[index[0]][dx] == 'N') {
            a[index[0]][dx] = c;
            a[index[0]][index[1]] = '-';
            move = true;
            break moving;
          }
        }
        for (int up = index[0]; up >= 0; up--) {
          if (a[up][index[1]] == 'N') {
            a[up][index[1]] = c;
            a[index[0]][index[1]] = '-';
            move = true;
            break moving;
          }
        }
        for (int down = index[0]; down < 8; down++) {
          if (a[down][index[1]] == 'N') {
            a[down][index[1]] = c;
            a[index[0]][index[1]] = '-';
            move = true;
            break moving;
          }
        }
        break;
      }
      case 'N': {
        for (int sx = index[1]; sx >= 0; sx--) {
          if (a[index[0]][sx] == 'B') {
            a[index[0]][sx] = c;
            a[index[0]][index[1]] = '-';
            move = true;
            break moving;
          }
        }
        for (int dx = index[1]; dx < 8; dx++) {
          if (a[index[0]][dx] == 'B') {
            a[index[0]][dx] = c;
            a[index[0]][index[1]] = '-';
            move = true;
            break moving;
          }
        }
        for (int up = index[0]; up >= 0; up--) {
          if (a[up][index[1]] == 'B') {
            a[up][index[1]] = c;
            a[index[0]][index[1]] = '-';
            move = true;
            break moving;
          }
        }
        for (int down = index[0]; down < 8; down++) {
          if (a[down][index[1]] == 'B') {
            a[down][index[1]] = c;
            a[index[0]][index[1]] = '-';
            move = true;
            break moving;
          }
        }
        break;
      }
    }
    return move;
  }

  public static boolean endMove (char[][] a) {
    char c = 'B';
    int countB = 0, countN = 0;

    if (!move(a, indexB1, c)) {
      if (!move(a, indexB2, c)) {
      }
      else countB++;
    }
    else countB++;

    c = 'N';

    if (!move(a, indexN1, c)) {
      if (!move(a, indexN2, c)) {
      }
      else countN++;
    }
    else countN++;

    if (countN == 2 || countB == 2) {
      return true;
    }
    else return false;
  }

  public static void main(String[] args) {
    char[][] chess = new char[8][8];
    int maxMoves = 0;

    initialise(chess);
    placeB(chess);
    placeN(chess);
    print(chess);

    do {
      maxMoves++;
    } while (!endMove(chess) && maxMoves < 1);

    print(chess);
  }
}
