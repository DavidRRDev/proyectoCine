package cine;


//Es necesario nombrar que el código que tenga que ejecutar un hilo debe provenir de una clase que
//previamente haya implementado la interfaz Runnable

public class Cliente  implements Runnable{

	private String nombre;
	private String apellidos;
	private String correo;
	private String cuentaBancaria;
	private int fondos;
	private GestorReservas gestorReservas;
	private int filaDeseada;
	private int columnaDeseada;
	
	
	public Cliente(String nombre, String apellidos, String correo, String cuentaBancaria, int fondos,
			GestorReservas gestorReservas, int filaDeseada, int columnaDeseada) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
		this.cuentaBancaria = cuentaBancaria;
		this.fondos = fondos;
		this.gestorReservas = gestorReservas;
		this.filaDeseada = filaDeseada;
		this.columnaDeseada = columnaDeseada;
	}
	@Override
	public void run() {
		synchronized (gestorReservas.getCine()) {
			
		}
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getCuentaBancaria() {
		return cuentaBancaria;
	}
	public void setCuentaBancaria(String cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}
	public int getFondos() {
		return fondos;
	}
	public void setFondos(int fondos) {
		this.fondos = fondos;
	}
	public GestorReservas getGestorReservas() {
		return gestorReservas;
	}
	public void setGestorReservas(GestorReservas gestorReservas) {
		this.gestorReservas = gestorReservas;
	}
	public int getFilaDeseada() {
		return filaDeseada;
	}
	public void setFilaDeseada(int filaDeseada) {
		this.filaDeseada = filaDeseada;
	}
	public int getColumnaDeseada() {
		return columnaDeseada;
	}
	public void setColumnaDeseada(int columnaDeseada) {
		this.columnaDeseada = columnaDeseada;
	}
	
	
	
	

}
//	String nombre , apellidos , correo , cuentaBancaria : Información personal y bancaria del
//	cliente.
//	int fondos : Cantidad de dinero que el cliente tiene para gastar en la reserva.
//	GestorReservas gestorReservas : Referencia al gestor de reservas para realizar la reserva.
//	int filaDeseada , columnaDeseada : Ubicación deseada del asiento en el cine.
