package main;

public class Velocidad {

 protected static int distancia;
 protected static int tiempo;
 protected static int velocidad;
 
public Velocidad() {
	super();
}

public Velocidad(int distancia, int tiempo, int velocidad) {
	super();
	this.distancia = distancia;
	this.tiempo = tiempo;
	this.velocidad = velocidad;
}


 public int getDistancia() {
	return distancia;
}

public void setDistancia(int distancia) {
	this.distancia = distancia;
}

public int getTiempo() {
	return tiempo;
}

public void setTiempo(int tiempo) {
	this.tiempo = tiempo;
}

public int getVelocidad() {
	return velocidad;
}

public void setVelocidad(int velocidad) {
	this.velocidad = velocidad;
}

 
 }

