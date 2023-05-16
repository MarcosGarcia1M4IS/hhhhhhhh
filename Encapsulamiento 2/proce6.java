package poo;

public class proce6 extends proce1 {

	public proce6(int a, int b, int c) {
		super(a, b, c);
		// TODO Auto-generated constructor stub
	}
	public void raizcuadra () {
		do {
		System.out.println("Ingrese el numero que desea sacar raiz cubica");
		a=tc.nextFloat();
		} while (a<0);
		b=(float) Math.sqrt(a);
	}
	public float mostarrraizcuadra () {
		return b;
	}
}
