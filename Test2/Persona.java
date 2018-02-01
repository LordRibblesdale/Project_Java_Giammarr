public class Persona {
	private String nome;
	private int[] vettoreX = new int[20];
	
	Persona() {
		nome = "NaN";
		for (int i = 0; i < vettoreX.length; i++) {
			vettoreX[i] = 0;
		}
	}
	
	Persona(String sIn) {
		nome = sIn;
		for (int i = 0; i < vettoreX.length; i++) {
			vettoreX[i] = (int)Math.floor(Math.random()*20)+1;
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String s) {
		nome = s;
	}
	
	public int[] getVettore() {
		return vettoreX;
	}
	
	public void setVettore(int[] a) {
		if (a.length == vettoreX.length) {
			for (int i = 0; i < a.length; i++) {
				vettoreX[i] = a[i];
			}
		}
	}
	
	public String toString() {
		String toString = "Vettore: ";
		for (int i = 0; i < getVettore().length; i++) {
			toString += Integer.toString(getVettore()[i]);
			toString += " ";
		}
		return "Nome: " + getNome() + "\n" + toString;
	}
	
	public static void main(String[] args) {
		Persona testS = new Persona("Test");
		System.out.println(testS.toString());
	}
}
