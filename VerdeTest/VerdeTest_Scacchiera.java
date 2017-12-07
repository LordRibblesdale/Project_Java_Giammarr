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
      b = (int)Math.floor(a1*7)+1;
      c = Math.random();
      d = (int)Math.floor(c*7)+1;

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
      System.out.println();
    }
  }

  public static void move(char[][] a, char c) {
    char c;

    switch(c) {
      //L'idea e' quella di analizzare se una torre dello stesso colore e'
      // tra la torre nera e la torre bianca analizzata, per calcolare
      // se la prima torre può mangiare quella avversaria o meno.
      //Andrebbe fatto sia per riga sia per colonna, sia per B sia per N
      case 'B': {
        if (indexB1[0] == indexN1[0]) { //B1 nella stessa riga di N1
          if (indexB2[0] == indexB1[0]) { //Se B2 e' nella stessa riga
            if (indexB2[1] > indexB1[1]) { //Se B2 e' a destra di B1
              if (indexB2[1] < indexN1[1]) {
                System.out.println("B1 (" + indexB1[0] + " " + indexB1[1] + ") non puo' mangiare N1 (" + indexN1[0] + " " + indexN1[1] + ", poiche B2 e' tra le due torri.");
              } //Se B2 è tra N1 e B1
              else {
                System.out.println("B1 (" + indexB1[0] + " " + indexB1[1] + ") puo' mangiare N1 (" + indexN1[0] + " " + indexN1[1] + ").");
            }
            else {
                System.out.println("B1 (" + indexB1[0] + " " + indexB1[1] + ") non puo' mangiare N1 (" + indexN1[0] + " " + indexN1[1] + ", poiche B2 e' tra le due torri.");
              }
              else {
                System.out.println("B1 (" + indexB1[0] + " " + indexB1[1] + ") puo' mangiare N1 (" + indexN1[0] + " " + indexN1[1] + ").");
              }
            }
          }
          else {
            System.out.println("B1 (" + indexB1[0] + " " + indexB1[1] + ") puo' mangiare N1 (" + indexN1[0] + " " + indexN1[1] + ").");
          }
        }
        else if (indexB1[0] == indexN2[0]) { //B1 stessa riga di N2
          if (indexB2[0] == indexB1[0]) { //B1 nella stessa riga di B1
            if (indexB2[1] > indexB1[1]) { //B2 a destra di B1
              if (indexB2[1] < indexN2[1]) {
                System.out.println("B1 (" + indexB1[0] + " " + indexB1[1] + ") non puo' mangiare N1 (" + indexN2[0] + " " + indexN2[1] + ", poiche B2 e' tra le due torri.");
              } //B2 tra N2 e B1
              else {
                System.out.println("B1 (" + indexB1[0] + " " + indexB1[1] + ") puo' mangiare N1 (" + indexN2[0] + " " + indexN2[1] + ").");
            }
            else {
                System.out.println("B1 (" + indexB1[0] + " " + indexB1[1] + ") non puo' mangiare N1 (" + indexN2[0] + " " + indexN2[1] + ", poiche B2 e' tra le due torri.");
              }
              else {
                System.out.println("B1 (" + indexB1[0] + " " + indexB1[1] + ") puo' mangiare N1 (" + indexN2[0] + " " + indexN2[1] + ").");
              }
            }
          }
          else {
            System.out.println("B1 (" + indexB1[0] + " " + indexB1[1] + ") puo' mangiare N1 (" + indexN2[0] + " " + indexN2[1] + ").");
          }
        }
        else if (indexB2[0] == indexN1[0]) {
          if (indexB1[0] == indexB2[0]) { //Se B2 e' nella stessa riga
            if (indexB1[1] > indexB2[1]) { //Se B2 e' a destra di B1
              if (indexB1[1] < indexN1[1]) {
                System.out.println("B2 (" + indexB2[0] + " " + indexB2[1] + ") non puo' mangiare N1 (" + indexN1[0] + " " + indexN1[1] + ", poiche B2 e' tra le due torri.");
              } //Se B2 è tra N1 e B1
              else {
                System.out.println("B2 (" + indexB2[0] + " " + indexB2[1] + ") puo' mangiare N1 (" + indexN1[0] + " " + indexN1[1] + ").");
            }
            else {
                System.out.println("B2 (" + indexB2[0] + " " + indexB2[1] + ") non puo' mangiare N1 (" + indexN1[0] + " " + indexN1[1] + ", poiche B2 e' tra le due torri.");
              }
              else {
                System.out.println("B1 (" + indexB2[0] + " " + indexB2[1] + ") puo' mangiare N1 (" + indexN1[0] + " " + indexN1[1] + ").");
              }
            }
          }
          else {
            System.out.println("B2 (" + indexB2[0] + " " + indexB2[1] + ") puo' mangiare N1 (" + indexN1[0] + " " + indexN1[1] + ").");
          }
        }
        else if (indexB2[0] == indexN2[0]) {
          if (indexB1[0] == indexB2[0]) { //Se B1 e' nella stessa riga
            if (indexB1[1] > indexB2[1]) { //Se B1 e' a destra di B2
              if (indexB1[1] < indexN2[1]) {
                System.out.println("B2 (" + indexB2[0] + " " + indexB2[1] + ") non puo' mangiare N1 (" + indexN2[0] + " " + indexN2[1] + ", poiche B2 e' tra le due torri.");
              } //Se B1 è tra N1 e B2
              else {
                System.out.println("B2 (" + indexB2[0] + " " + indexB2[1] + ") puo' mangiare N1 (" + indexN1[0] + " " + indexN1[1] + ").");
            }
            else {
                System.out.println("B2 (" + indexB2[0] + " " + indexB2[1] + ") non puo' mangiare N1 (" + indexN1[0] + " " + indexN1[1] + ", poiche B2 e' tra le due torri.");
              }
              else {
                System.out.println("B1 (" + indexB2[0] + " " + indexB2[1] + ") puo' mangiare N1 (" + indexN1[0] + " " + indexN1[1] + ").");
              }
            }
          }
          else {
            System.out.println("B2 (" + indexB2[0] + " " + indexB2[1] + ") puo' mangiare N1 (" + indexN1[0] + " " + indexN1[1] + ").");
          }
        }
      }

      case 'N': {
        if (indexB1[0] == indexN1[0]) {
          if (indexB2[0] == indexB1[0]) {
            if (indexB2[1] > indexB1[1]) {
              if (indexB2[1] < indexN1[1]) {
                System.out.println("B1 (" + indexB1[0] + " " + indexB1[1] + ") non puo' mangiare N1 (" + indexN1[0] + " " + indexN1[1] + ", poiche B2 e' tra le due torri.");
              }
              else {
                System.out.println("B1 (" + indexB1[0] + " " + indexB1[1] + ") puo' mangiare N1 (" + indexN1[0] + " " + indexN1[1] + ").");
            }
            else {
                System.out.println("B1 (" + indexB1[0] + " " + indexB1[1] + ") non puo' mangiare N1 (" + indexN1[0] + " " + indexN1[1] + ", poiche B2 e' tra le due torri.");
              }
              else {
                System.out.println("B1 (" + indexB1[0] + " " + indexB1[1] + ") puo' mangiare N1 (" + indexN1[0] + " " + indexN1[1] + ").");
              }
            }
          }
          else {
            System.out.println("B1 (" + indexB1[0] + " " + indexB1[1] + ") puo' mangiare N1 (" + indexN1[0] + " " + indexN1[1] + ").");
          }
        }
        else if (indexB1[0] == indexN2[0]) {
          if (indexB2[0] == indexB1[0]) {
            if (indexB2[1] > indexB1[1]) {
              if (indexB2[1] < indexN2[1]) {
                System.out.println("B1 (" + indexB1[0] + " " + indexB1[1] + ") non puo' mangiare N1 (" + indexN2[0] + " " + indexN2[1] + ", poiche B2 e' tra le due torri.");
              }
              else {
                System.out.println("B1 (" + indexB1[0] + " " + indexB1[1] + ") puo' mangiare N1 (" + indexN2[0] + " " + indexN2[1] + ").");
            }
            else {
                System.out.println("B1 (" + indexB1[0] + " " + indexB1[1] + ") non puo' mangiare N1 (" + indexN2[0] + " " + indexN2[1] + ", poiche B2 e' tra le due torri.");
              }
              else {
                System.out.println("B1 (" + indexB1[0] + " " + indexB1[1] + ") puo' mangiare N1 (" + indexN2[0] + " " + indexN2[1] + ").");
              }
            }
          }
          else {
            System.out.println("B1 (" + indexB1[0] + " " + indexB1[1] + ") puo' mangiare N1 (" + indexN2[0] + " " + indexN2[1] + ").");
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

    move(chess, 'B');
    print(chess);
    move(chess, 'N');
    print(chess);
  }
}
