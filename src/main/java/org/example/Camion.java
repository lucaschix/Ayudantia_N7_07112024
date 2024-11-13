package org.example;

public class Camion extends Vehiculo {

	private int cargaMaxima;



	// Constructor completo
	public Camion(String color, int añoCreacion, String marca, int precio, int cargaMaxima) {
		super(color, añoCreacion, marca, precio);
		this.cargaMaxima = cargaMaxima;
	}

	// Getters y setters
	public int getCargaMaxima() { return cargaMaxima; }
	public void setCargaMaxima(int cargaMaxima) { this.cargaMaxima = cargaMaxima; }

	@Override
	public String toString() {
		return "Camion{" +
				"cargaMaxima=" + cargaMaxima +
				", " + super.toString() +
				'}';
	}
}
