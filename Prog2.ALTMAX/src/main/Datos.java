package main;

import java.util.Scanner;

public class Datos {
 
	protected static int velocidadInicial;
	protected static int AltMax;
	protected static int angulo;

static Scanner entrada = new Scanner (System.in);
	
	public static void lectura() {
		
		imprimirMenu();
	}
	private static void ValidarDatos() {
		System.out.println("Ingresar la velocidad inicial");
		velocidadInicial= entrada.nextInt();
		
		System.out.println("Ingresar el angulo");
		angulo = entrada.nextInt();
		
		AltMax= (int) ((int) ((int) Math.pow(velocidadInicial, 2) * (Math.sin(angulo)))/2 * 9.8);
		
		System.out.println("La altura maxima es "+AltMax+"");
		
		System.out.println();
}
	
	private static void salir() {
		System.out.println("El programa ha finalizado");
		System.exit(0);
		
	}
	private static void imprimirMenu() {
		System.out.println("--------------Bienvenido----------------");
		System.out.println("1. Calcular el movimiento parabolico");
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