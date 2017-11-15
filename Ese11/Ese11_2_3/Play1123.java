import java.util.Random;
import java.util.Scanner;

public class Play1123 {
  public static char play() {
    boolean ai_win, usr_win;

    Random rnd = new Random();
    int ai = rnd.nextInt(3); //0 = carta, 1 = forbice, 2 = sasso
    char ai_c = 0;

    switch (ai) {
      case 0: {
        ai_c = 'c';
        break;
      }
      case 1: {
        ai_c = 'f';
        break;

      }
      case 2: {
        ai_c = 's';
        break;
      }
    }
    return ai_c;
  }
}
