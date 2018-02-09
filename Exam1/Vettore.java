public class Vettore {
	public static int maxBordo(int[] a) {
		int tmp = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == a[(a.length-1)-i]) {
				tmp++;
			}
			else return tmp;
		}
		return tmp;
	}
	
	public static int maxSegmento(int[] a) {
		int tmp1 = 0, tmp2 = 0;
		for (int i = 0; i < a.length; i++) {
			tmp1 = 0;
			for (int j = i+1; j < a.length; j++) {
				if (a[i] == a[j]) {
					tmp1++;
					if (tmp1 > tmp2) {
						tmp2 = tmp1;
					}
				}
				else {
					tmp1 = 0;
					break;
				}
			}
		}
		return tmp2+1;
	}
	
	public static void main(String[] args) {
		int[] array = new int[20];
		double tmpD = 0;

		System.out.println("Vettore: ");
		for (int i = 0; i < array.length; i++) {
			tmpD = Math.random();
			if (tmpD >= 0.5) {
				array[i] = 1;
			} 
			else array[i] = 0;
			System.out.print(array[i] + " ");
		}
		System.out.println("Il massimo bordo e' di lunghezza: " + maxBordo(array) + "\nIl massimo segmento e' di lunghezza: " + maxSegmento(array));
	}
}
