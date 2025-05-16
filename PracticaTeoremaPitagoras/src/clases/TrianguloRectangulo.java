package clases;

public class TrianguloRectangulo {
	
	
	private int a; 
	private int b;
	private double c;
	
	/**
	 * Crea un triangulo rectangulo por defecto con el valor 1 en
	 * los catetos
	 */
	public TrianguloRectangulo() {
		this.a = 1;
		this.b = 1;
	}
	/**
	 * Constructor que crea un triangulo rectangulo con los catetos
	 * pasados como parametros
	 * @param a cateto 1
	 * @param b cateto 2
	 */
	public TrianguloRectangulo(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	/**
	 * Realiza la operacion area
	 * @return Area del rectangulo
	 */
	public int area() {
		return (a * b)/2;
	}
	
	/**
	 * Calcula el valor de la hipotenusa usando Pitagoras
	 * @return la hipotenusa "c"
	 */
	public double hipotenusa() {
		return (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
	}
	
	/**
	 * Calcula el perimetro de un triangulo rectangulo
	 * @return el perimetro
	 */
	public int perimetro() {
		return (int)(a + b + this.hipotenusa());
	}
	
	public String toString() {
		return "a: "+this.a+"\nb: "+this.b+"\nc: "+this.c;
		
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	
	
	
	
	

}
