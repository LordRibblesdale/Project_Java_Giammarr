public class Persona {
	private String nome;
	private boolean[] vettoreX = new boolean[20];
	
	Persona() {
		nome = "NaN";
		for (int i = 0; i < vettoreX.length; i++) {
			vettoreX[i] = false;
		}
	}
	
	Persona(String nomeIn) {
		double tmpD = 0;
		
		nome = nomeIn;
		for (int i = 0; i < vettoreX.length; i++) {
			tmpD = Math.random();
			if (tmpD >= 0.5) {
				vettoreX[i] = true;
			} 
			else vettoreX[i] = false;
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nomeIn) {
		nome = nomeIn;
	}
	
	public boolean[] getVettore() {
		return vettoreX;
	}
	
	public void setVettore(boolean[] a) {
		if (a.length == vettoreX.length) {
			for (int i = 0; i < a.length; i++) {
				vettoreX[i] = a[i];
			}
		}
	}
	
	public String toString() {
		String toString = "";
		for (int i = 0; i < getVettore().length; i++) {
			toString += getVettore()[i] + " ";
		}
		return "Nome: " + getNome() + "\nVettore: " + toString;
	}
	
	public static void main(String[] args) {
		Persona a = new Persona("Test");
		System.out.println(a.toString());
	}
}
