public class UsrWin1123 {
  public static void usrWin(char c) {
    char a = Play1123.play();

    String paper = "CARTA";
    String rock = "SASSO";
    String scissors = "FORBICE";

    switch (c) {
      case 'c': {
        if (a == 's') {
          System.out.printf("\n%s batte %s!\n Hai vinto! Complimenti!", paper, rock);
        }
        else if (a == 'f') {
          System.out.printf("\n%s batte %s!\n Hai perso! Peccato!", scissors, paper);
        }
        else {
          System.out.printf("\n%s VS %s!\n Parita'", paper, paper);
        }
        break;
      }
      case 'f': {
        if (a == 'c') {
          System.out.printf("\n%s batte %s!\n Hai vinto! Complimenti!", scissors, paper);
        }
        else if (a == 's') {
          System.out.printf("\n%s batte %s!\n Hai perso! Peccato!", rock, scissors);
        }
        else {
          System.out.printf("\n%s VS %s!\n Parita'", rock, rock);
        }
        break;
      }
      case 's': {
        if (a == 'f') {
          System.out.printf("\n%s batte %s!\n Hai vinto! Complimenti!", rock, scissors);
        }
        else if (a == 'c') {
          System.out.printf("\n%s batte %s!\n Hai perso! Peccato!", paper, rock);
        }
        else {
          System.out.printf("\n%s VS %s!\n Parita'", scissors, scissors);
        }
        break;
      }
    }
  }
}
