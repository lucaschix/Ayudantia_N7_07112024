package org.example;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "tipo")
@JsonSubTypes({
		@JsonSubTypes.Type(value = Auto.class, name = "Auto"),
		@JsonSubTypes.Type(value = Bicicleta.class, name = "Bicicleta"),
		@JsonSubTypes.Type(value = Camion.class, name = "Camion")
})
public abstract class Vehiculo {

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
