package pkg;

import java.util.ArrayList;
import java.util.List;



public class Cuenta {
	String mNumero; 
	double saldo;
	String nTitular;
	List <Movimiento> mMovimientos=new ArrayList();
	public Cuenta(String mNumero, String titular, double saldo) {
		this.mNumero=mNumero;
		this.nTitular=titular;
		this.saldo=saldo;
		
	}
	public double getSaldo() {
		return saldo;
	}
	public void ingresar(double x) {
		saldo=-50;
	}

	public void retirar(double x) {
		saldo=-150;
	}
	
}

