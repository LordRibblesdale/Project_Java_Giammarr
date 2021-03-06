//Domenico Verde

public class Persona {
  private String name;
  int birth;

  public Persona() {
    name = "NaN";
    birth = 0;
  }

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

  public boolean equals(Object obj) {
    boolean isEqual = false;
    if (obj != null && obj instanceof Studente) {
      Persona other = (Persona)obj;
      isEqual = (this.name == other.name) && (this.birth == other.birth);
    }
    return isEqual;
  }

  public static void main(String[] args) {
    Persona deBroccolis = new Persona("Caio De Broccolis", 2017);
    System.out.println(deBroccolis.toString());
  }
}
