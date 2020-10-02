package paquetemus;

public class CancionNoEncontradaException extends Exception {
	
	public CancionNoEncontradaException (String mensaje) {
		super(mensaje);
	}
	
	public CancionNoEncontradaException () {
		this(null);
	}

}
