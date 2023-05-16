package poo;

public class proce4 extends proce1 {

	public proce4(int a, int b, int c) {
		super(a, b, c);
		// TODO Auto-generated constructor stub
	}
	
public void multi () {
	System.out.println("Ingrese el numero 1");
	a=tc.nextFloat();
	System.out.println("Ingrese el numero 2");
	b=tc.nextFloat();
	c= a*b;
}
public float mostrarmulti () {
	return c;
}



}
