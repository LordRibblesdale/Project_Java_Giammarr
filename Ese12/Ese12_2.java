//Domenico Verde

public class Ese12_2 {
  public static void initialise(boolean[] a) {
    for (int i = 2; i < a.length; i++) {
      a[i] = true;
    }
  }

  public static int countPr(boolean[] a) {
    int count = 0;

    for (int i = 2; i < a.length; i++) {
      if (a[i]) {
        for (int j = 2*i; j < a.length; j += i) {
          a[j] = false;
        }
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    boolean prNum[] = new boolean[3001];

    initialise(prNum);
    System.out.println("I numeri primi da 2 a 3000 sono: " + countPr(prNum));
  }
}
