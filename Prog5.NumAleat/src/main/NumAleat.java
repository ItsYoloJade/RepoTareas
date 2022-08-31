package main;

import java.util.Random;
import java.util.Scanner;

public class NumAleat {

	public static void lectura() {
		imprimirMenu();
	}
	private static void salir() {
		System.out.println("El programa ha finalizado");
		System.exit(0);
		
	}
	private  static void SumarNum() {
		int min_val = 1;
        int max_val = 100;
		Random rand = new Random();
		 int randomNum1 = min_val + rand.nextInt((max_val - min_val) + 1);
		 int randomNum2 = min_val + rand.nextInt((max_val - min_val) + 1);
		 int suma = randomNum1 + randomNum2;
		 System.out.println("La suma de "+randomNum1+" + "+randomNum2+" es igual a: "+suma+"");
	}
	
	private static void imprimirMenu() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("------------BIENVENIDO----------");
		System.out.println();
		System.out.println("1. Generar numero aleatorio");
		System.out.println("2. Sumar dos numeros");
		System.out.println("3. Salir");
		int opcion= entrada.nextInt();
		System.out.println();
		
	
		
	
	
	switch(opcion) {
	case 1: {
		int min_val = 1;
        int max_val = 100;
        Random rand = new Random();
        int randomNum = min_val + rand.nextInt((max_val - min_val) + 1);
        System.out.println("El numero aleatorio es: "+randomNum);
        System.out.println();
        
		imprimirMenu();
		break;
		
	}
	case 2:{
		SumarNum();
		System.out.println();
		imprimirMenu();
		
	}
	case 3: {
		salir();
		 break;
	}
	
	default: System.out.println("Ha ingresado una opcion invalida\n");
	imprimirMenu();
	break;
	}
	}
}
