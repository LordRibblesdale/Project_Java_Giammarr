//Domenico Verde
public class Tut01_a {
  public static void main(String[] args) {
    String sameNum = "";
    boolean isFoundNum = false, isPrimeNum = true;
    int primeNum, num, primeDiv = 2;

    for (num = 10000000; num < 100000000; num++) {
      primeNum = 3;

      sameNum = sameNum.valueOf(num*primeNum);

      if (sameNum.equals("111111111")) {
        System.out.println(num + "*" + primeNum + " = " + sameNum);
      }
    }

    while (!isFoundNum) {
        for (num = 10000000; num < 100000000; num++) {
          for (primeNum = 5; primeDiv < primeNum/2 && isPrimeNum; primeDiv++) {
            if (primeNum % primeDiv != 0) {
              isPrimeNum = true;
            }
            else {
              isPrimeNum = false;
            }
            if (isPrimeNum) {
              sameNum = sameNum.valueOf(num*primeNum);

              if (sameNum.equals("111111111")) {
                isFoundNum = true;
           }
          }
          if (!isFoundNum) {
            primeNum++;
          }
          else {
            System.out.println(num + "*" + primeNum + " = " + sameNum);
            System.exit(0);
          }
        }
      }
    }
  }
}
