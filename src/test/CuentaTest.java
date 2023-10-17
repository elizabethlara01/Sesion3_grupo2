package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {
	static Cuenta cuenta12345;
	static Cuenta cuenta67890;
	static Cuenta cuenta1112;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta12345=new Cuenta("12345", "Loli", 50);
		cuenta67890=new Cuenta("67890", "Manuel", 0);
		cuenta1112=new Cuenta("1112", "Marina", 50);
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testRetirarPorDebajoDeMenos500() {
		cuenta1112.retirar(350);
		assertEquals(-300, cuenta1112.getSaldo());
		
		
	}
	
	@Test
	void testRetirarPorEncimaDeMenos500() {
		cuenta1112.retirar(250);
		assertEquals(-300, cuenta1112.getSaldo());
		
		
	}

	@Test
	void testOperacionCuenta1() {
		cuenta12345.retirar(200);
		assertEquals(-150, cuenta12345.getSaldo());
		
		cuenta12345.ingresar(100);
		assertEquals(-50, cuenta12345.getSaldo());
		
		cuenta12345.retirar(200);
		assertEquals(-250, cuenta12345.getSaldo());
		
		
	}
	
	@Test
	void testOperacionCuenta2() {
		
		cuenta67890.retirar(350);
		assertEquals(-350, cuenta67890.getSaldo());
		
		cuenta67890.retirar(200);
		assertEquals(-350, cuenta67890.getSaldo());
		
		cuenta67890.retirar(150);
		assertEquals(-500, cuenta67890.getSaldo());
		
		cuenta67890.ingresar(50);
		assertEquals(-450, cuenta67890.getSaldo());
		
		cuenta67890.retirar(100);
		assertEquals(-450, cuenta67890.getSaldo());
	}
	
	

}
