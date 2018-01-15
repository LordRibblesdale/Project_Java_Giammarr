public class Ex1 {
  public static int[] initialise(int[] a) {
    for (int i = 0; i < a.length; i++) {
      a[i] = (int)Math.floor(Math.random()*10)+1;
    }
    return a;
  }

  public static void print(int[] a) {
    for (int i = 0; i < a.length; i++) {
      System.out.print("(" + a[i] + ") ");
    }
  }

  public static int baricentro(int[] a) {
    int tmp1, tmp2;
    for (int i = 1; i < a.length; i++) {
      tmp1 = 0;
      tmp2 = 0;
      for (int j = i-1; j >= 0; j--) {
        tmp1 += a[j];
      }
      System.out.println("\n" + tmp1);
      for (int h = i; h < a.length; h++) {
        tmp2 += a[h];
      }
      System.out.println(tmp2);
      if (tmp1 == tmp2) {
        return i;
      }
      System.out.println();
    }
    return -1;
  }

  public static void main(String[] args) {
    int index = 0;
    int[] a = new int[25];
    initialise(a);
    print(a);
    index = baricentro(a);
    if (index != -1) {
      System.out.println("L'indice del baricentro e': "+ index);
    }
    else {
      System.out.println("Non c'e' baricentro.");
    }
    System.out.println("Du iu no de wae?");
  }
}
