package cine;

public class Asiento {
	
	private boolean ocupado;
	private int filas;
	private int columnas;
	public Asiento(int filas, int columnas) {

		this.ocupado = false;
		this.filas = filas;
		this.columnas = columnas;
	}
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
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
	@Override
	public String toString() {
		return "Asiento [ocupado=" + ocupado + ", fila=" + filas + ", columna=" + columnas + "]";
	}
	
	
	
}
//Propósito: La clase Asiento representa individualmente cada asiento en el cine. Cada objeto
//Asiento mantiene información sobre su ubicación específica en la sala (fila y columna) y si está
//ocupado o no.
//Atributos:
//int fila : Indica la fila en la que se encuentra el asiento.
//int columna : Indica la columna en la que se encuentra el asiento.
//boolean ocupado : Es un indicador de si el asiento está ocupado. Por defecto, todos los asientos
//están disponibles (no ocupados) al inicio de la simulación.
//Métodos:
//Constructores, getters y setters: Proporcionan la funcionalidad básica para establecer y obtener
//información sobre el asiento.
//toString() : Ofrece una representación en forma de cadena del estado del asiento, útil para
//depuración y visualización.
//Inicialización y Estado:
//Al crear un asiento, se establece inicialmente como no ocupado ( false ). Esto significa que al
//comenzar la simulación, todos los asientos del cine están disponibles para ser reservados.
//Interacción con Otras Clases:
//La clase Cine utiliza esta clase para crear una matriz de asientos, representando la disposición
//de los asientos en la sala.
//El GestorReservas consulta y modifica el estado de los asientos ( ocupado ) mientras gestiona las
//solicitudes de reserva de los clientes.
