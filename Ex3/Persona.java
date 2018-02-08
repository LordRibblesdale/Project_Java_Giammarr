public class Persona {
  private String name;

  Persona() {
    name = "NaN";
  }

  Persona(String nIn) {
    name = nIn;
  }

  public String getName() {
    return name;
  }

  public void setName(String nIn) {
    name = nIn;
  }

  public String toString() {
    return "Nome: " + name;
  }
}
