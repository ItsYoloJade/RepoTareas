package main;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
	
	public static void lectura() {
		imprimirMenu();
	}

	public static long factorial(int n)
	{
		long fac = 1;

		if(n >= 2){
			for(int i = 1; i <= n; i++){
				fac *= i;
			}
		}

		return fac;
	}

	
	public static BigInteger bigFactorial(int n)
	{
		
		BigInteger fac = new BigInteger("1");

		if(n >= 2){
		
			for(int i = 1; i <= n; i++){
				fac = fac.multiply(new BigInteger(i + ""));
			}
		}

		return fac;
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
		System.out.println("¿Desea saber el factorial de un numero?");
		System.out.println();
		System.out.println("1. Si");
		System.out.println("2. Salir");
		int opcion= entrada.nextInt();
		System.out.println();
		
	
	
	switch(opcion) {
	case 1: {
		System.out.print("Ingrese un numero: ");
		int n = enterData();
		System.out.println("Factorial de "+n+": "+bigFactorial(n));
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
