package org.example;

public class Camion extends Vehiculo {

	private int cargaMaxima;

	// Constructor
	public Camion(String color, int añoCreacion, String marca, int precio, int cargaMaxima) {
		super(color, añoCreacion, marca, precio);
		this.cargaMaxima = cargaMaxima;
	}

	public int getCargaMaxima() {
		return this.cargaMaxima;
	}

	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	// Método toString
	@Override
	public String toString() {
		return "Camion{" +
				"color='" + getColor() + '\'' +
				", añoCreacion=" + getAñoCreacion() +
				", marca='" + getMarca() + '\'' +
				", precio=" + getPrecio() +
				", cargaMaxima=" + cargaMaxima +
				'}';
	}

}
