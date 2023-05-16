package Ejemplo;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner tc = new Scanner (System.in);
		
		
		int tiporopa = 0,kg = 0;
		
		
	    System.out.println("Ingrese cuantos kg de ropa desea ingresar");
        kg=tc.nextInt();
	
		System.out.println("Ingrese el tipo de ropa: 1- Ropa blanca; 2- Ropa de color");
        tiporopa=tc.nextInt();
        
    
    	proce1 op = new proce1 (kg, tiporopa);
        op.ciclocomple();
        
	}

}
