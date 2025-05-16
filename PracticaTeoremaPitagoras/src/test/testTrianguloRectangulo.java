package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

import clases.TrianguloRectangulo;

import org.junit.jupiter.api.Test;

class testTrianguloRectangulo {

	
static TrianguloRectangulo tri;
static TrianguloRectangulo tri2;
	
	@BeforeAll
	static void setup() {
		tri = new TrianguloRectangulo() {};
		tri2 = new TrianguloRectangulo(2,2) {};
	}
	
	@Test
	void testAreaPorDefecto() {
		double valorEsperado = 0;
		assertEquals(valorEsperado, tri.area());
	}

	@Test
	void testHipotenusaPorDefecto() {
		double valorEsperado = 1.41;
		assertEquals(valorEsperado, tri.hipotenusa());
	}

	@Test
	void testPerimetroPorDefecto() {
		int valorEsperado = 3;
		assertEquals(valorEsperado, tri.perimetro());
	}
	
	
	
	@Test
	void testTrianguloRectanguloIntInt() {
		assertThrows(IllegalArgumentException.class,
				() -> {
					tri = new TrianguloRectangulo(-2, 5);
				});	
	}
	
	@Test
	void testArea() {
		double valorEsperado = 2;
		assertEquals(valorEsperado, tri2.area());
	}
	
	@Test
	void testPerimetro() {
		int valorEsperado = 6;
		assertEquals(valorEsperado, tri2.perimetro());
	}
	
	@Test
	void testHipotenusa() {
		double valorEsperado = 2.83;
		assertEquals(valorEsperado, tri2.hipotenusa());
	}

}
