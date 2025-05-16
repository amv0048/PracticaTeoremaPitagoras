package app;

import clases.TrianguloRectangulo;
public class Principal {

	public static void main(String[] args) {
		
		int random = (int)(Math.random() * 10 + 1);
		int random2 = (int)(Math.random() * 10 + 1);
		
		TrianguloRectangulo tri = null;
		
		try {
			 tri = new TrianguloRectangulo(random, random2);
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
				
		
		TrianguloRectangulo tri2 = 
				new TrianguloRectangulo();
		
		int areaPorDefecto = tri.area();
		int area = tri2.area();
		
		int perimetroPorDefecto = tri.perimetro();
		int perimetro = tri2.perimetro();
	}
}
