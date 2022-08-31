package main;


import java.util.Scanner;

public class decimalTObinary {

	public static void lectura() {
		imprimirMenu();
	}
	private static void salir() {
		System.out.println("El programa ha finalizado");
		System.exit(0);
		
	}
	
  private  static void convertir() {
	
	
	
          Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el numero decimal que desea convertir");
		
		int decimalInicial = entrada.nextInt()  ;

	    String binario = Integer.toBinaryString( decimalInicial);
	    System.out.println("El numero "+decimalInicial+" equivale a "+binario+"");
        
    
}
	
	private static void imprimirMenu() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("------------BIENVENIDO----------");
		System.out.println();
		System.out.println("1. Convertir un decimal a binario");
		System.out.println("2. Salir");
		int opcion= entrada.nextInt();
		System.out.println();

	switch(opcion) {
	case 1: {
		convertir();
        System.out.println();
        
		imprimirMenu();
		break;
		
	}
	
	case 2: {
		salir();
		 break;
	}
	
	default: System.out.println("Ha ingresado una opcion invalida\n");
	imprimirMenu();
	break;
	}
	}
}
