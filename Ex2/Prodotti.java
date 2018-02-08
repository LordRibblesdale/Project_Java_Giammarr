public class Prodotti {
  private int code;
  private String name;
  private double price;

  Prodotti() {
    code = 0;
    name = "NaN";
    price = 0;
  }

  Prodotti(int codeIn, String nameIn, double priceIn) {
    code = codeIn;
    name = nameIn;
    price = priceIn;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int codeIn) {
    code = codeIn;
  }

  public String getName() {
    return name;
  }

  public void setCode(String nameIn) {
    name = nameIn;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double priceIn) {
    price = priceIn;
  }

  public void applyDiscount() {
    price *= 0.95;
  }

  public String toString() {
    return "Codice: " + getCode() + "\nNome: " + getName() + "\nPrezzo: " + getPrice();
  }

  public boolean equals(Object product) {
    boolean equal = false;
    if (product != null && product instanceof Prodotti) {
      Prodotti other = (Prodotti)product;
      equal = this.getCode() == other.getCode() && this.getName() == other.getName() && this.getPrice() == other.getPrice();
    }
    return equal;
  }
}
