package cine;

import java.util.Arrays;

public class Cine {
	
	private Asiento[][] asientos;
	private int recaudacionTotal;
	private String cuentaCine;
	private int filas=10;
	private int columnas=10;
	public Cine(String cuentaCine) {
		this.asientos = inicializarAsientos(filas,columnas);
		this.recaudacionTotal = 0;
		this.cuentaCine = cuentaCine;
	}

	public Asiento[][] getAsientos() {
		return asientos;
	}
	public void setAsientos(Asiento[][] asientos) {
		this.asientos = asientos;
	}
	public int getRecaudacionTotal() {
		return recaudacionTotal;
	}
	public void setRecaudacionTotal(int recaudacionTotal) {
		this.recaudacionTotal = recaudacionTotal;
	}
	public String getCuentaCine() {
		return cuentaCine;
	}
	public void setCuentaCine(String cuentaCine) {
		this.cuentaCine = cuentaCine;
	}
	
	
	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}

	public Asiento[][] inicializarAsientos(int filas,int columnas) {
		if(filas<=0 || columnas<=0) {
			System.out.println("ni la fila ni las columnas pueden ser menor a 0");
		}
		asientos=new Asiento [filas][columnas];

		for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
            	asientos[i][j] =new Asiento(i,j);
            }
        }
		return asientos;
	}public boolean verificarDisponibilidad(int filas,int columnas) {
		return !this.asientos[filas][columnas].isOcupado();
	}
	public void reservarAsiento(int filas,int columnas) {
		this.asientos[filas][columnas].setOcupado(true);
		
	}
	public boolean estaLleno(int filas,int columnas) {
		for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
            	if(this.asientos[i][j].isOcupado()) {
            		return true;
            	}
            		
            	
            }
           }
		return false;
		
	}
	public void agregarRecaudacion(int precio) {
		this.recaudacionTotal+=precio;
		
	}
	public void reiniciarAsientos(int filas, int columnas) {
		for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
            	
            	this.asientos[i][j].setOcupado(false);
            }
            }
			
		}
	
	
	@Override
	public String toString() {
		return "Cine [asientos=" + Arrays.toString(asientos) + ", recaudacionTotal=" + recaudacionTotal
				+ ", cuentaCine=" + cuentaCine + "]";
	}
	
}
//Asiento[][] asientos : Una matriz de objetos Asiento , representando la disposición de los
//asientos en el cine.
//int recaudacionTotal : Lleva la cuenta del total de dinero recaudado por la venta de entradas.
//String cuentaCine : La cuenta bancaria del cine para procesar los pagos.





