package poo;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tc = new Scanner(System.in);
		
		proce1 op1 = new proce1 (0, 0, 0);
		proce2 op2 = new proce2 (0, 0, 0);
		proce3 op3 = new proce3 (0, 0, 0);
		proce4 op4 = new proce4 (0, 0, 0);
		proce5 op5 = new proce5 (0, 0, 0);
		proce6 op6 = new proce6 (0, 0, 0);
		int opc;
		try {
		do {
		System.out.println("Hola bienvenido \nIngrese 1 para sacar potencia \nIngrese 2 para sacar factorial "
				+ "\nIngrese 3 para sacar raiz cuadrada \nIngrese 4 para sacar raiz cubica \nIngrese 5 para multiplicar"
				+ "\nIngrese 6 para dividir \nIngrese 7 para salir del menu");
		opc = tc.nextInt();
		
		switch (opc) {
		
		case 1:
			op1.potencia();
			System.out.println("--------------------------------------");
		System.out.println("El numero elevado es "+op1.mostrarpote());
		System.out.println("--------------------------------------");
			break ;
		case 2:
			op2.facto();
			System.out.println("--------------------------------------");
		System.out.println("El factorial es "+op2.mostrarfacto());	
		System.out.println("--------------------------------------");
			break ;
		case 3:
			op6.raizcuadra();
			System.out.println("--------------------------------------");
			System.out.println( "La raiz cuadrada es "+op6.mostarrraizcuadra());
			System.out.println("--------------------------------------");
			break ;
		case 4:
			op3.raiz();
			System.out.println("--------------------------------------");
			System.out.println("La raiz cubica es "+op3.mostarrraiz()); 
			System.out.println("--------------------------------------");
			break ;
		case 5:
			op4.multi();
			System.out.println("--------------------------------------");
			System.out.println("La multiplicacion es "+op4.mostrarmulti()); 
			System.out.println("--------------------------------------");
			break ;
			
		case 6:
			op5.divi();
			System.out.println("--------------------------------------");
			System.out.println("La vidision es "+op5.mostrardivi());
			System.out.println("--------------------------------------");
			break ;
		case 7:
			System.out.println("--------------------------------------");
			System.out.println("Saliendo...");
			System.out.println("--------------------------------------");
			break ;
			default :
				System.out.println("Dato invalido");
				break ;
		}
		
		} while (opc!=7);
		
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error dato invalido");
		}
		
	}

}
