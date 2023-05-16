package Ejemplo;

public class proce1 {
	
	
  private int kilos =0, llenadocomple=0, tiporopa=0, lavadocomple=0, secadocomple=0;

   public proce1(int kilos, int tiporopa) {
	this.kilos = kilos;
	this.tiporopa = tiporopa;
    }
   
   private void llenar () {
	   if (kilos <=12) {
		   llenadocomple =1;
		   System.out.println("Llenando ...");
		   System.out.println("Llenado completo");
		   
	   }else {
		   System.out.println("Lavadora muy llena, por favor saquele ropa");
	   }
   }
	
	private void lavado () {
		llenar ();
		if (llenadocomple ==1) {
			if (tiporopa ==1) {
				System.out.println("Ropa color blanca, será un lavado suave");
				System.out.println("Lavando...");
				lavadocomple=1;
			}else if (tiporopa ==2) {
				System.out.println("Ropa de color, será un lavado intenso");
				System.out.println("Lavando...");
				lavadocomple=1;
				
			}else {
				System.out.println("Color de ropa desconocido, por lo tanto será un lavado intenso");
				System.out.println("Lavando");
				lavadocomple=1;
			}
		}
	}
	
	private void secado () {
		lavado ();
		if (lavadocomple==1) {
			System.out.println("Secando...");
			secadocomple=1;
		}
	}
	public void ciclocomple () {
		secado();
		if (secadocomple==1) {
			System.out.println("La ropa ha sido lavada <3");
		}
	}

}
