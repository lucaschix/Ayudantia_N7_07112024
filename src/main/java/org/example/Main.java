package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Automotora
        Automotora automotora = new Automotora("Automotora XYZ", 1998, "Juan Pérez");

        // Agregar vehículos al inventario
        automotora.agregarAuto("Rojo", 2020, "Toyota", 15000, "4 puertas", 180);
        automotora.agregarBicicleta("Azul", 2022, "Trek", 500, "Montaña");
        automotora.agregarCamion("Blanco", 2019, "Ford", 25000, 5000);

        // Mostrar el inventario de vehículos
        System.out.println("Inventario inicial:");
        automotora.mostrarInventario();

        // Guardar el inventario inicial en un archivo JSON
        String archivoGuardar = "vehiculos_inicial.json";
        automotora.guardarVehiculosEnJson(archivoGuardar);
        System.out.println("Inventario guardado en " + archivoGuardar);

        // Cargar vehículos desde un archivo JSON
        String archivoCargar = "vehiculos_nuevos.json"; // Asegúrate de tener este archivo JSON en tu proyecto
        automotora.cargarVehiculosDesdeJson(archivoCargar);

        // Mostrar el inventario después de cargar desde el archivo JSON
        System.out.println("\nInventario después de cargar desde JSON:");
        automotora.mostrarInventario();

        // Guardar el inventario actualizado en un nuevo archivo JSON
        String archivoActualizar = "vehiculos_actualizado.json";
        automotora.guardarVehiculosEnJson(archivoActualizar);
        System.out.println("Inventario actualizado guardado en " + archivoActualizar);
    }
}
