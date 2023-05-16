package poo;

import java.util.Scanner;

public class proce1 {
	
	
	float a,b,c;
	Scanner tc = new Scanner(System.in);

	public proce1(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public float getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public float getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	
	public void potencia () {
		System.out.println("Ingrese el numero que dese elevar");
		a=tc.nextFloat();
		System.out.println("Ingrese la potencia");
		b=tc.nextFloat();
		c=(float) Math.pow(a, b);
		
		
	}
	public float mostrarpote () {
		return c;
	}

}
