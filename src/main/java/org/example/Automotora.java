package org.example;

import java.util.List;

public class Automotora {

	private List<Vehiculo> vehiculos;
	private String nombre;
	private int fechaFundacion;
	private String dueño;

	// Constructor
	public Automotora(List<Vehiculo> vehiculos, String nombre, int fechaFundacion, String dueño) {
		this.vehiculos = vehiculos;
		this.nombre = nombre;
		this.fechaFundacion = fechaFundacion;
		this.dueño = dueño;
	}

	public List<Vehiculo> getVehiculos() {
		return this.vehiculos;
	}

	public void setVehiculos(List<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFechaFundacion() {
		return this.fechaFundacion;
	}

	public void setFechaFundacion(int fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}

	public String getDueño() {
		return this.dueño;
	}

	public void setDueño(String dueño) {
		this.dueño = dueño;
	}

	// Método toString
	@Override
	public String toString() {
		return "Automotora{" +
				"vehiculos=" + vehiculos +
				", nombre='" + nombre + '\'' +
				", fechaFundacion=" + fechaFundacion +
				", dueño='" + dueño + '\'' +
				'}';
	}

	// Métodos especializados para agregar vehículos

	public void agregarAuto(String color, int añoCreacion, String marca, int precio, String numPuertas, int caballosDeFuerza) {
		Auto auto = new Auto(color, añoCreacion, marca, precio, numPuertas, caballosDeFuerza);
		vehiculos.add(auto);
		System.out.println("Auto agregado al inventario: " + auto);
	}

	public void agregarBicicleta(String color, int añoCreacion, String marca, int precio, String tipoDeTerreno) {
		Bicicleta bicicleta = new Bicicleta(color, añoCreacion, marca, precio, tipoDeTerreno);
		vehiculos.add(bicicleta);
		System.out.println("Bicicleta agregada al inventario: " + bicicleta);
	}

	public void agregarCamion(String color, int añoCreacion, String marca, int precio, int cargaMaxima) {
		Camion camion = new Camion(color, añoCreacion, marca, precio, cargaMaxima);
		vehiculos.add(camion);
		System.out.println("Camion agregado al inventario: " + camion);
	}

	// Método para mostrar el inventario de vehículos
	public void mostrarInventario() {
		System.out.println("\nInventario de vehículos:");
		for (Vehiculo vehiculo : vehiculos) {
			System.out.println(vehiculo.toString());
		}
	}
}
