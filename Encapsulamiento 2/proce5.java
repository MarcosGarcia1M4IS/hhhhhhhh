package poo;

public class proce5 extends proce1 {

	public proce5(int a, int b, int c) {
		super(a, b, c);
		// TODO Auto-generated constructor stub
	}
	
	public void divi () {
		System.out.println("Ingrese el dividendo");
		a=tc.nextFloat();
		do {
		System.out.println("Ingrese el divisor, (diferente a 0)");
		b=tc.nextFloat();
		} while (b==0);
		c= a/b;
	}
	public float mostrardivi () {
		return c;
	}

}
