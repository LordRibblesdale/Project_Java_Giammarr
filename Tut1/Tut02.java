// Domenico Verde

import java.util.Random;
import java.text.DecimalFormat;

public class Tut02 {
  public static final double win = 11.23;
  private static DecimalFormat df2 = new DecimalFormat(".##");

  public static void print(String s) {
    System.out.print(s);
  }

  public static void main(String[] args) {
    int numFatina, numWin1 = 0, numWin2 = 0, numWin3 = 0, numWin4 = 0, numWin5 = 0;
    double totalWin = 0;

    Random randomNum = new Random();


    print("\nHo fatto un sogno in cui una fatina dai capelli turchini mi dava un numero del lotto.\nQuesto e' il numero: ");

    numFatina = randomNum.nextInt(90) +1;


    print(numFatina + "\n Lo giochero' sperando di vincere qualcosa!\n");

    for (int i = 1; i <= 52; i++) {
      numWin1 = randomNum.nextInt(90) +1;
      numWin2 = randomNum.nextInt(90) +1;
      numWin3 = randomNum.nextInt(90) +1;
      numWin4 = randomNum.nextInt(90) +1;
      numWin5 = randomNum.nextInt(90) +1;

      if (numFatina == numWin1 || numFatina == numWin2 ||
            numFatina == numWin3 || numFatina == numWin4 || numFatina == numWin5) {
        totalWin += win-1;
      }
      else {
        totalWin -= 1;
      }
    }

    if (totalWin < 0) {
      print("\nHo perso " + df2.format(totalWin));
    }
    else if (totalWin == 0) {
      print("\nNon ho vinto nulla!");
    }
    else {
      print("Ho vinto " + df2.format(totalWin));
    }
  }
}
