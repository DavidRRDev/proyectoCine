package cine;

public class GestorReservas {
	private Cine cine;
	private ProcesadorPagos procesadorPagos;
	public GestorReservas(Cine cine, ProcesadorPagos procesadorPagos) {
		this.cine = cine;
		this.procesadorPagos = procesadorPagos;
	}
	public Cine getCine() {
		return cine;
	}
	public void setCine(Cine cine) {
		this.cine = cine;
	}
	public ProcesadorPagos getProcesadorPagos() {
		return procesadorPagos;
	}
	public void setProcesadorPagos(ProcesadorPagos procesadorPagos) {
		this.procesadorPagos = procesadorPagos;
	}
	public void intetarReservar(Cliente cliente,int filaDeseada,int columnaDeseasda) {
		if(cine.verificarDisponibilidad(filaDeseada, columnaDeseasda)) {

		}
		
	}
	public void buscarAsientoAlternativo(int filaDeseada,int columnaDeseasda) {
	
	}
	public void procesarReserva(Cliente cliente,int fila,int columna) {
		
	}
}
