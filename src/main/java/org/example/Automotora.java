package org.example;

import java.util.ArrayList;
import java.util.List;

public class Automotora {
	private List<Vehiculo> vehiculos;
	private String nombre;
	private int fechaFundacion;
	private String dueño;

	// Constructor
	public Automotora(String nombre, int fechaFundacion, String dueño) {
		this.vehiculos = new ArrayList<>();
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

	public void cargarVehiculosDesdeJson(String archivoJson) {
		this.vehiculos = GestorDeDatos.leerVehiculosDesdeJson(archivoJson);
		System.out.println("Vehículos cargados desde " + archivoJson);
	}

	public void guardarVehiculosEnJson(String archivoJson) {
		GestorDeDatos.guardarVehiculosEnJson(archivoJson, this.vehiculos);
	}

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

	public void mostrarInventario() {
		System.out.println("\nInventario de vehículos:");
		for (Vehiculo vehiculo : vehiculos) {
			System.out.println(vehiculo.toString());
		}
	}
}
