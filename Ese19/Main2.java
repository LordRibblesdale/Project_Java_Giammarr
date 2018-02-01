import java.util.ArrayList;

public class Main2 {
  public static void main(String[] args) {
    ArrayList<Persona> list = new ArrayList<Persona>(5);
    list.add(new Studente("DeBroccolis", 2018, 1, 4));
    list.add(new Docente("ProfBroccolis", 2018, "Analisi", 1));
    list.add(new Studente("DueBroccolis", 2, 10));
    list.add(new Studente("AncoraBroccolis", 3, 6));
    list.add(new Docente("Ancora2Broccolis", 4, 22));

  }
}
