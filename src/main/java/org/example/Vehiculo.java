package org.example;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;

// Especifica que Jackson debe incluir un campo de tipo en la serialización
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
// Declara los subtipos conocidos que Jackson debe manejar
@JsonSubTypes({
		@JsonSubTypes.Type(value = Auto.class, name = "Auto"),
		@JsonSubTypes.Type(value = Bicicleta.class, name = "Bicicleta")
})

public abstract class Vehiculo {

	private String color;
	private int añoCreacion;
	private String marca;
	private int precio;

	// Constructor vacío para Jackson
	public Vehiculo() {}

	// Constructor completo
	public Vehiculo(String color, int añoCreacion, String marca, int precio) {
		this.color = color;
		this.añoCreacion = añoCreacion;
		this.marca = marca;
		this.precio = precio;
	}

	// Getters y setters
	public String getColor() { return color; }
	public void setColor(String color) { this.color = color; }

	public int getAñoCreacion() { return añoCreacion; }
	public void setAñoCreacion(int añoCreacion) { this.añoCreacion = añoCreacion; }

	public String getMarca() { return marca; }
	public void setMarca(String marca) { this.marca = marca; }

	public int getPrecio() { return precio; }
	public void setPrecio(int precio) { this.precio = precio; }

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
