package app;

import clases.TrianguloRectangulo;
public class Principal {

	public static void main(String[] args) {
		
		int random = (int)(Math.random() * 10 + 1);
		int random2 = (int)(Math.random() * 10 + 1);
		
		TrianguloRectangulo tri = 
				new TrianguloRectangulo(random, random2);
		
		TrianguloRectangulo tri2 = 
				new TrianguloRectangulo();
		
		System.out.println(tri.area());
		System.out.println(tri2.area());
		
		System.out.println(tri.perimetro());
		System.out.println(tri.perimetro());

	}

}
