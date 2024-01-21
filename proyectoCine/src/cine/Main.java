package cine;

public class Main {

	public static void main(String[] args) {
		Cine c1=new Cine(5,"sdasadas");
		Asiento[][] asientos = c1.getAsientos();
		for (int i = 1; i < asientos.length; i++) {
		    for (int j = 1; j < asientos[i].length; j++) {
		        System.out.println("Fila: " + i + ", Columna: " + j + ", Detalles " + asientos[i][j]);
		    }
		}
	}

}
