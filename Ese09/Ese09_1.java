//Domenico Verde
/*
 Esercizio 1 Scrivere un programma che chiede all'utente di inserire un numero x tra 9 e 99
  (mettere un controllo sull'input), poi genera in modo random 100 numeri tra 9 e 99 e dice all'utente quante volte è stato generato il numero x da lui scelto.
  */

  import java.util.Random;
  import java.util.Scanner;

  public class Ese09_1 {
    public static void main(String[] args) {
      int x, rnd, count = 0;
      String str = "Il numero e' stato generato ", str2 = " volte";

      Scanner keyboard = new Scanner(System.in);
      Random random = new Random();

      do {
        System.out.print("Inserisci un numero (tra 9 e 99): ");
        x = keyboard.nextInt();
      }
      while (x < 9 || x > 99);

      for (int count2 = 1; count2 <= 100; count2++) {
        rnd = random.nextInt(91) + 9;
        //System.out.println(rnd);
        if (x == rnd) {
          count++;
        }
      }

      if (count == 0) {
        System.out.println("Il numero non e' mai stato generato.");
      }
      else if (count == 1) {
        System.out.println(str + count + str2.substring(0, 5) + "a");
      }
      else System.out.println(str + count + str2.substring(0, 5) + "e");
    }
  }
