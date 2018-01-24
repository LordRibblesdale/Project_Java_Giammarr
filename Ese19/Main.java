public class Main {
  public static void main(String[] args) {
    Docente deBroccolis = new Docente("De Broccolis", 2017, "Analisi 1", 1, "Analisi 2", 2);
    Studente studBroccolis = new Studente("Stuart Broccolis", 2018, deBroccolis.getM1Nome(), deBroccolis.getM1Year(), 4);
    int grade[] = new int[4];

    for (int i = 0; i < grade.length; i++) {
      grade[i] = (int)Math.floor(Math.random()*30)+1;
    }
    studBroccolis.setGrades(grade);
    debroccolis.toString();
    studBroccolis.toString();

    //if ()
  }
}
