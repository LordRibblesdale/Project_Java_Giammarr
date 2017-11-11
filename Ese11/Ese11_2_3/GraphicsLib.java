public class GraphicsLib {
  public static void usrWin(char c) {
    char a = Play1123.play();

    String paper = "CARTA";
    String rock = "SASSO";
    String scissors = "FORBICE";

    String scissors1 = " \\\\ //";
    String scissors2 = "  \\\\// ";
    String scissors3 = "  _\\/_ ";
    String scissors4 = " ([][])";

    String rock1 = "  @@@@ ";
    String rock2 = " @@@@@@";

    String paper1 = " .----.";
    String paper2 = " |    |";
    String paper4 = " .____.";

    switch (c) {
      case 'c': {
        if (a == 's') {
          System.out.println(scissors1 + "   " + rock1);
          System.out.println(scissors2 + " v " + rock2);
          System.out.println(scissors3 + " s " + rock2);
          System.out.println(scissors4 + "   " + rock1);

          System.out.printf("\n%s batte %s!\n Hai vinto! Complimenti!", paper, rock);
        }
        else if (a == 'f') {
          System.out.println(scissors1 + "   " + paper1);
          System.out.println(scissors2 + " v " + paper2);
          System.out.println(scissors3 + " s " + paper2);
          System.out.println(scissors4 + "   " + paper4);

          System.out.printf("\n%s batte %s!\n Hai perso! Peccato!", scissors, paper);
        }
        else {
          System.out.println(paper1 + "   " + paper1);
          System.out.println(paper2 + " v " + paper2);
          System.out.println(paper2 + " s " + paper2);
          System.out.println(paper4 + "   " + paper4);

          System.out.printf("\n%s VS %s!\n Parita'", paper, paper);
        }
        break;
      }
      case 'f': {
        if (a == 'c') {
          System.out.println(scissors1 + "   " + paper1);
          System.out.println(scissors2 + " v " + paper2);
          System.out.println(scissors3 + " s " + paper2);
          System.out.println(scissors4 + "   " + paper4);

          System.out.printf("\n%s batte %s!\n Hai vinto! Complimenti!", scissors, paper);
        }
        else if (a == 's') {
          System.out.println(rock1 + "   " + scissors1);
          System.out.println(rock2 + " v " + scissors2);
          System.out.println(rock2 + " s " + scissors3);
          System.out.println(rock1 + "   " + scissors4);

          System.out.printf("\n%s batte %s!\n Hai perso! Peccato!", rock, scissors);
        }
        else {
          System.out.println(rock1 + "   " + rock1);
          System.out.println(rock2 + " v " + rock2);
          System.out.println(rock2 + " s " + rock2);
          System.out.println(rock1 + "   " + rock1);

          System.out.printf("\n%s VS %s!\n Parita'", rock, rock);
        }
        break;
      }
      case 's': {
        if (a == 'f') {
          System.out.println(rock1 + "   " + scissors1);
          System.out.println(rock2 + " v " + scissors2);
          System.out.println(rock2 + " s " + scissors3);
          System.out.println(rock1 + "   " + scissors4);

          System.out.printf("\n%s batte %s!\n Hai vinto! Complimenti!", rock, scissors);
        }
        else if (a == 'c') {
          System.out.println(paper1 + "   " + rock1);
          System.out.println(paper2 + " v " + rock2);
          System.out.println(paper2 + " s " + rock2);
          System.out.println(paper4 + "   " + rock1);

          System.out.printf("\n%s batte %s!\n Hai perso! Peccato!", paper, rock);
        }
        else {
          System.out.println(scissors1 + "   " + scissors1);
          System.out.println(scissors2 + " v " + scissors2);
          System.out.println(scissors3 + " s " + scissors3);
          System.out.println(scissors4 + "   " + scissors4);

          System.out.printf("\n%s VS %s!\n Parita'", scissors, scissors);
        }
        break;
      }
    }
  }
}
