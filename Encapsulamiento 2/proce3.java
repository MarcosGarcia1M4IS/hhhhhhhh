package poo;

public class proce3 extends proce1 {

	public proce3(int a, int b, int c) {
		super(a, b, c);
		// TODO Auto-generated constructor stub
	}
	
	public void raiz () {
		System.out.println("Ingrese el numero que desea sacar raiz cubica");
		a=tc.nextFloat();
		b=(float) Math.cbrt(a);
	}
	public float mostarrraiz () {
		return b;
	}

}
