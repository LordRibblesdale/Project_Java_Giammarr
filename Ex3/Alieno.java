public class Alieno extends Persona {
  private int matr;
  private int[] ammo = new int[15];

  Alieno() {
    super();
    for (int i = 0; i < ammo.length; i++) {
      ammo[i] = 0;
    }
  }

  Alieno(String nIn, int matrIn) {
    super(nIn + Integer.toString(matrIn));
    vector1(ammo);
  }

  public void vector1(int[] a) {
    for (int i = 0, j = 0; i < a.length; i++, j++) {
      a[i] = j*j;
    }
  }

  public int getMatr() {
    return matr;
  }

  public void setMatr(int a) {
    matr = a;
  }

  public int[] getAmmo() {
    return ammo;
  }

  public void setAmmo(int[] a) {
    if (a.length == ammo.length) {
      for (int i = 0; i < ammo.length; i++) {
        ammo[i] = a[i];
      }
    }
  }

  public String toString() {
    String toString = "";
    for (int i = 0; i < getAmmo().length; i++) {
        toString += getAmmo()[i];
        toString += " ";
    }
    return super.toString() + "\nAmmo: " + toString;
  }
}
