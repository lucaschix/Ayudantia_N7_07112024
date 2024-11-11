package org.example;

public class Vehiculo {

	private String color;
	private int añoCreacion;
	private String marca;
	private int precio;

	// Constructor
	public Vehiculo(String color, int añoCreacion, String marca, int precio) {
		this.color = color;
		this.añoCreacion = añoCreacion;
		this.marca = marca;
		this.precio = precio;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAñoCreacion() {
		return this.añoCreacion;
	}

	public void setAñoCreacion(int añoCreacion) {
		this.añoCreacion = añoCreacion;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	// Método toString
	@Override
	public String toString() {
		return "Vehiculo{" +
				"color='" + color + '\'' +
				", añoCreacion=" + añoCreacion +
				", marca='" + marca + '\'' +
				", precio=" + precio +
				'}';
	}
}
