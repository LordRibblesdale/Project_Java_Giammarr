//Domenico Verde

public class Persona {
  private String name;
  int birth;

  public Persona(String nameIn, int year) {
    name = nameIn;
    birth = year;
  }

  public String getName() {
    return name;
  }

  public void setName(String nameIn) {
    name = nameIn;
  }

  public int getBirth() {
    return birth;
  }

  public void setBirth(int year) {
    birth = year;
  }

  public String toString() {
    return "Nome: " + getName() + "\nAnno di nascita: " + getBirth() + "\n";
  }

  public static void main(String[] args) {
    Persona unBroccolis = new Persona();
    unBroccolis.setName("Caio De Broccolis");
    unBroccolis.setBirth(2017);
    System.out.println(unBroccolis.toString());

    Persona dueBroccolis = new Persona("Caio De Broccolis");
    dueBroccolis.setBirth(2017);
    System.out.println(dueBroccolis.toString());

    Persona treBroccolis = new Persona(2017);
    treBroccolis.setName("Caio De Broccolis");
    System.out.println(treBroccolis.toString());

    Persona quattroBroccolis = new Persona("Caio De Broccolis", 2017);
    System.out.println(quattroBroccolis.toString());
  }
}
