package main;

import java.util.Scanner;


public class Datos extends Velocidad{
	
	
	
	static Scanner entrada = new Scanner (System.in);
	
	public static void lectura() {
		
		imprimirMenu();
	}
	
	
	private static void ValidarDatos() {
		System.out.println("Ingresar la distancia");
	     distancia= entrada.nextInt();
		
		System.out.println("Ingresar el tiempo");
		tiempo = entrada.nextInt();
		
		velocidad = distancia/tiempo;
		
		System.out.println("La velocidad es de "+velocidad+"");
		
		System.out.println();
	}
	
	
	private static void salir() {
		System.out.println("El programa ha finalizado");
		System.exit(0);
		
	}
	
	private static void imprimirMenu() {
		System.out.println("Bienvenido al Programa");
		System.out.println("1. Calcular la velocidad de un MRU");
		System.out.println("2. Salir");
		int opcion= entrada.nextInt();
		
	
	
	switch(opcion) {
	case 1: {
		ValidarDatos();
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

