package main;

import java.util.Scanner;

public class NumPrimo {
	
	public static void lectura() {
		imprimirMenu();
	}
	
	public static boolean esPrimo (int n)
	{
		
		if(n % 2 == 0) return false;

		
		for(int i = 3; i*i <= n; i+=2){
			if(n % i == 0) return false;
		}

		return true;
	}

	
	public static int enterData()
	{
		Scanner scan = new Scanner(System.in);
		int n;

		try{
			n = scan.nextInt();

			return n;
		} catch(Exception e) {
			System.out.println("Ingrese un numero");
			return enterData();
		}
	}
	
	
	private static void salir() {
		System.out.println("El programa ha finalizado");
		System.exit(0);
		
	}
	
	private static void imprimirMenu() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Desea saber si un numero es primo?");
		System.out.println();
		System.out.println("1. Si");
		System.out.println("2. Salir");
		int opcion= entrada.nextInt();
		System.out.println();
		
	
	
	switch(opcion) {
	case 1: {
		

		System.out.println("Ingrese un numero: ");
		int n = enterData();

		
		if(esPrimo(n)){
			 System.out.println("Es primo");
		}else {
			System.out.println("No es primo");
		}
		System.out.println();
		imprimirMenu();
		break;
		
	}
	case 2:{
		 salir();
		 break;
	}
	
	default: System.out.println("Ha ingresado una opcion invalida\n");
	imprimirMenu();
	break;
	}
	}
}