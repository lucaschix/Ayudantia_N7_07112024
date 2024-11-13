package org.example;

public class Bicicleta extends Vehiculo {

	private String tipoDeTerreno;


	// Constructor completo
	public Bicicleta(String color, int añoCreacion, String marca, int precio, String tipoDeTerreno) {
		super(color, añoCreacion, marca, precio);
		this.tipoDeTerreno = tipoDeTerreno;
	}

	// Getters y setters
	public String getTipoDeTerreno() { return tipoDeTerreno; }
	public void setTipoDeTerreno(String tipoDeTerreno) { this.tipoDeTerreno = tipoDeTerreno; }

	@Override
	public String toString() {
		return "Bicicleta{" +
				"tipoDeTerreno='" + tipoDeTerreno + '\'' +
				", " + super.toString() +
				'}';
	}
}
