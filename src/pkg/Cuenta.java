package pkg;

import java.util.ArrayList;
import java.util.List;

import pkg.Movimiento.signo;



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
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	public void obtenerDatos() {
		System.out.println("Número de cuenta: "+mNumero);
		System.out.println("Titular: "+nTitular);
		System.out.println("Saldo inicial: "+saldo+" euros");
		
	}
	public void ingresar(double x) {
		obtenerDatos();
		saldo=saldo+x;
		Movimiento m=new Movimiento(x, signo.H, "Ingreso de "+x+" euros");
		mMovimientos.add(m);
		System.out.println("Ingreso de "+x+" euros");
		System.out.println("Saldo actual: "+saldo+" euros\n");
	}

	public void retirar(double x) {
		obtenerDatos();
		if(saldo-x>=-500) {
			saldo=saldo-x;
			Movimiento m=new Movimiento(x, signo.D, "Retirada de "+x+" euros");
			mMovimientos.add(m);
			System.out.println("Retirada de "+x+" euros");
			
		}else
			System.out.println("Fallo retirada de "+x+" euros");
		System.out.println("Saldo actual: "+saldo+" euros\n");
	}
	
}

