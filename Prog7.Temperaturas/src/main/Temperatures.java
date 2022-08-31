package main;

import java.util.Scanner;

public class Temperatures {
	
	
	static Scanner entrada = new Scanner (System.in);

public static void lectura() {
		
		imprimirMenu();
		
	}

private static void salir() {
	System.out.println("El programa ha finalizado");
	System.exit(0);
	
}



private static void celciusAfarenheit() {
	Scanner op1 = new Scanner (System.in);
	System.out.println("Ingrese la temperatura en Celcius que desea convertir");
   int temp1= op1.nextInt();
    int conversion= (temp1 * 9/5) + 32;

    System.out.println("La temperatura "+temp1+" en grados  celsius equivale a "+conversion+" en grados farenheit");
}


private static void farenheitAcelsius() {
	Scanner op2 = new Scanner (System.in);
	System.out.println("Ingrese la temperatura en farenheit que desea convertir");
   int temp2= op2.nextInt();
    int conversion1=( temp2 - 32) * 5/9;
    System.out.println("La temperatura "+temp2+" en grados farenheit equivale a "+conversion1+" en grados celsius");
}


private static void celsiusAkelvin() {
	Scanner op3 = new Scanner (System.in);
	System.out.println("Ingrese la temperatura en Celcius que desea convertir");
   int temp3= op3.nextInt();
    int conversion2= (int) (temp3 + 273.15);
    System.out.println("La temperatura "+temp3+" en grados celsius equivale a "+conversion2+" en grados kelvin");

}
private static void kelvinAcelsius() {
	Scanner op4 = new Scanner (System.in);
	System.out.println("Ingrese la temperatura en kelvin que desea convertir");
   int temp4= op4.nextInt();
    int conversion3= (int) (temp4 - 273.15);
    System.out.println("La temperatura "+temp4+" en grados kelvin equivale a "+conversion3+" en grados celsius");
}
private static void farenheitAkelvin() {
	Scanner op5 = new Scanner (System.in);
	System.out.println("Ingrese la temperatura en farenheit que desea convertir");
   int temp5= op5.nextInt();
    int conversion4= (int) (( temp5 - 32)  * 5/9 + 273.15);
    System.out.println("La temperatura "+temp5+" en grados farenheit equivale a "+conversion4+" en grados kelvin");
}
private static void kelvinAfareheit() {
	Scanner op6 = new Scanner (System.in);
	System.out.println("Ingrese la temperatura en kelvin que desea convertir");
   int temp6= op6.nextInt();
    int conversion5= (int) (( temp6 - 273.15)  *  9/5 + 32);
    System.out.println("La temperatura "+temp6+" en grados kelvin equivale a "+conversion5+" en grados farenheit");
}


private static void imprimirMenu() {
	System.out.println("-------------Conversor de Temperaturas---------------");
	System.out.println();
	System.out.println("1. De celcius a farenheit");
	System.out.println("2. De farenheit a celsius");
	System.out.println("3. De celsius a kelvin");
	System.out.println("4. De kelvin a celsius");
	System.out.println("5. De farenheit a kelvin");
	System.out.println("6. De kelvin a fareheit");
	System.out.println("7. Salir");
	int opcion= entrada.nextInt();
	


switch(opcion) {
case 1: {
	celciusAfarenheit();
	System.out.println();
	imprimirMenu();
	break;
	
}
case 2:{
	farenheitAcelsius();
	System.out.println();
	imprimirMenu();
	break;
}
case 3:{
	celsiusAkelvin();
	System.out.println();
	imprimirMenu();
	break;
}
case 4:{
	kelvinAcelsius();
	System.out.println();
	imprimirMenu();
	break;
}
case 5:{
	farenheitAkelvin();
	System.out.println();
	imprimirMenu();
	break;
}
case 6:{
	kelvinAfareheit();
	System.out.println();
	imprimirMenu();
	break;
}

case 7:{
	 salir();
	 break;
}

default: System.out.println("Ha ingresado una opcion invalida\n");
imprimirMenu();
break;
}
}
}
