public class Matrice {
  public static int[][] genera(int row, int column) {
    int[][] tmp = new int[row][column];

    for (int i = 0; i < row; i++) {
      for (int j = 1; j < column; j++) {
        tmp[i][j-1] = (int)Math.floor(Math.random()*26)+11;

        do {
          tmp[i][j] = (int)Math.floor(Math.random()*26)+11;
        } while (tmp[i][j-1] == tmp[i][j]);
      }
    }
    return tmp;
  }

  public static int minVett(int[] a) {
    int tmp = 38;

    for (int k = 0; k < a.length; k++) {
      if (a[k] < tmp) {
        tmp = a[k];
      }
    }
    return tmp;
  }

  public static int cercaSella(int[][] a) {
    int max = 0, min = 0;

    for (int i = 0; i < a.length; i++) {
      min = minVett(a[i]);
      for (int j = 0; j < a[i].length; j++) {
        if (max < a[i][j]) {
          max = a[i][j];
        }
      }
      if (max == min) {
        return 1;
      }
    }
    return 0;
  }
  

  public static void main(String[] args) {
    int[][] matrix = genera(15, 20);

    if (cercaSella(matrix) == 1) {
      System.out.println("Indici: [" + minVett(matrix))
    }
  }
}
