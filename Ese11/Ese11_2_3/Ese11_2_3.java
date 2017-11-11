//Domenico Verde

import java.util.Scanner;
import java.util.Random;

public class Ese11_2_3 {


  public static boolean choice() {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("\n\nVuoi rigiocare?(Y/n): ");

    char input = keyboard.nextLine().charAt(0);

    if (input == 'Y') {
      return true;
    }
    else if (input == 'n') {
      return false;
    }
    else {
      return choice();
    }
  }

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    char usrChoice = 0;

    System.out.println("Benvenuto in Carta-Forbice-Sasso!\n\nScegli tra carta, forbice o sasso e sfida l'IA.\nInserisci 'c' per inserire carta, 'f' per forbice, 's' per sasso");

    do {
      do {
        System.out.print("\nInserisci qui: ");
        usrChoice = keyboard.nextLine().charAt(0);
      } while (!(usrChoice == 's' || usrChoice == 'c' || usrChoice == 'f'));

      UsrWin1123.usrWin(usrChoice);
    } while (choice());
  }
}
