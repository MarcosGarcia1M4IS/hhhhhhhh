package poo;

public class proce2 extends proce1 {
	int facto=1;
	

	public proce2(int a, int b, int c, int facto) {
		super(a, b, c);
		this.facto = facto;
	}

	public proce2(int a, int b, int c) {
		super(a, b, c);
		// TODO Auto-generated constructor stub
		
	}
	
	public void facto () {
		
		System.out.println("Ingrese el numero que desea sacar el factorial");
		a=tc.nextFloat();
		for (int i=1;i<=a;i++) {
			facto= facto*i;
		}
	}
	public float mostrarfacto () {
		return facto;
	
		
	}
}
