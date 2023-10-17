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
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta12345=new Cuenta("12345", "Loli", 50);
		
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
	void testOperacionCuenta1() {
		cuenta12345.retirar(200);
		assertEquals(-150, cuenta12345.getSaldo());
		
		cuenta12345.ingresar(100);
		assertEquals(-50, cuenta12345.getSaldo());
		
		
		
		
	}
	
	

}
