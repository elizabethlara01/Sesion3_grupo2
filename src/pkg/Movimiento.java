package pkg;

import pkg.Movimiento.signo;

public class Movimiento {
	double importe;
	public enum signo{D,H};
	signo s;
	String detalle;
	public Movimiento (double importe, signo s, String detalle){
		this.importe=importe;
		this.s=s;
		this.detalle=detalle;
	}
}
