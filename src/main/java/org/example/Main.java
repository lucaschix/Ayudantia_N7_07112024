package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear una lista vacía de vehículos para la automotora
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

        // Crear una instancia de Automotora
        Automotora automotora = new Automotora(listaVehiculos, "AutoExpress", 1995, "Juan Pérez");

        // Imprimir los detalles iniciales de la automotora
        System.out.println("Detalles de la automotora:");
        System.out.println(automotora.toString());

        // Agregar vehículos directamente usando los métodos especializados
        automotora.agregarAuto("Rojo", 2020, "Toyota", 15000, "4", 120);
        automotora.agregarBicicleta("Azul", 2018, "Trek", 500, "Montaña");
        automotora.agregarCamion("Blanco", 2019, "Volvo", 30000, 2000);

        // Mostrar el inventario de vehículos
        automotora.mostrarInventario();
    }
}
