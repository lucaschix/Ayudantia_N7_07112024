package org.example;

public class Bicicleta extends Vehiculo {

	private String tipoDeTerreno;

	// Constructor
	public Bicicleta(String color, int añoCreacion, String marca, int precio, String tipoDeTerreno) {
		super(color, añoCreacion, marca, precio);
		this.tipoDeTerreno = tipoDeTerreno;
	}

	public String getTipoDeTerreno() {
		return this.tipoDeTerreno;
	}

	public void setTipoDeTerreno(String tipoDeTerreno) {
		this.tipoDeTerreno = tipoDeTerreno;
	}

	// Método toString
	@Override
	public String toString() {
		return "Bicicleta{" +
				"color='" + getColor() + '\'' +
				", añoCreacion=" + getAñoCreacion() +
				", marca='" + getMarca() + '\'' +
				", precio=" + getPrecio() +
				", tipoDeTerreno='" + tipoDeTerreno + '\'' +
				'}';
	}

}
