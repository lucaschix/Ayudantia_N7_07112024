package org.example;

public class Auto extends Vehiculo {

	private String numPuertas;
	private int caballosDeFuerza;



	// Constructor completo
	public Auto(String color, int añoCreacion, String marca, int precio, String numPuertas, int caballosDeFuerza) {
		super(color, añoCreacion, marca, precio);
		this.numPuertas = numPuertas;
		this.caballosDeFuerza = caballosDeFuerza;
	}

	// Getters y setters
	public String getNumPuertas() { return numPuertas; }
	public void setNumPuertas(String numPuertas) { this.numPuertas = numPuertas; }

	public int getCaballosDeFuerza() { return caballosDeFuerza; }
	public void setCaballosDeFuerza(int caballosDeFuerza) { this.caballosDeFuerza = caballosDeFuerza; }

	@Override
	public String toString() {
		return "Auto{" +
				"numPuertas='" + numPuertas + '\'' +
				", caballosDeFuerza=" + caballosDeFuerza +
				", " + super.toString() +
				'}';
	}
}
