package org.example;

public class Auto extends Vehiculo {

	private String numPuertas;
	private int caballosDeFuerza;

	// Constructor
	public Auto(String color, int añoCreacion, String marca, int precio, String numPuertas, int caballosDeFuerza) {
		super(color, añoCreacion, marca, precio);
		this.numPuertas = numPuertas;
		this.caballosDeFuerza = caballosDeFuerza;
	}

	public String getNumPuertas() {
		return this.numPuertas;
	}

	public void setNumPuertas(String numPuertas) {
		this.numPuertas = numPuertas;
	}

	public int getCaballosDeFuerza() {
		return this.caballosDeFuerza;
	}

	public void setCaballosDeFuerza(int caballosDeFuerza) {
		this.caballosDeFuerza = caballosDeFuerza;
	}

	// Método toString
	@Override
	public String toString() {
		return "Auto{" +
				"color='" + getColor() + '\'' +
				", añoCreacion=" + getAñoCreacion() +
				", marca='" + getMarca() + '\'' +
				", precio=" + getPrecio() +
				", numPuertas='" + numPuertas + '\'' +
				", caballosDeFuerza=" + caballosDeFuerza +
				'}';
	}

}
