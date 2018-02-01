public class Vettore {
	  public static int barVett(int[] a) {
	  	  int tmp1, tmp2;
	  	  for (int i = 1; i < a.length; i++) {
	  	  	  tmp1 = 0;
	  	  	  tmp2 = 0;
	  	  	  for (int j = i-1; j >= 0; j--) {
	  	  	  	  tmp1 += a[j];
	  	  	  }
	  	  	  //System.out.println("\ntmp1 " + tmp1);
	  	  	  for (int h = i; h < a.length; h++) {
	  	  	  	  tmp2 += a[h];
	  	  	  }	  
	  	  	  //System.out.println("tmp2 " + tmp2);
	  	  	  if (tmp1 > tmp2) {
	  	  	  	  return i-1;
		   	  }
    	  	  }
    	  	  return -1;
    	  }
	
	public static int maxVett(int[] a) {
		int tmp1 = 0, tmpIndex = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > tmp1) {
				tmp1 = a[i];
				tmpIndex = i;
			}
		}
		return tmpIndex;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[20];
		
		System.out.print("\nVettore: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)Math.floor(Math.random()*20)+1;
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n" + "L'indice del valore piu' alto nel vettore e': " + maxVett(arr) + "\n" + "L'indice per il quale vale la disequazione (vd.Ese1 per bar(v)) e': " + barVett(arr));
	}
}
