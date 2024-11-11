package org.example;

public class Main {
    public static void main(String[] args) {
        Automotora automotora = new Automotora("Mi Automotora", 1990, "Juan Perez");

        // Cargar vehículos desde el archivo JSON
        automotora.cargarVehiculosDesdeJson("vehiculos.json");

        // Agregar nuevos vehículos
        automotora.agregarAuto("Rojo", 2020, "Toyota", 15000, "4", 120);
        automotora.agregarBicicleta("Azul", 2018, "Trek", 500, "Montaña");
        automotora.agregarCamion("Blanco", 2019, "Volvo", 30000, 2000);

        // Mostrar el inventario de vehículos
        automotora.mostrarInventario();

        // Guardar el inventario actualizado en un archivo JSON
        automotora.guardarVehiculosEnJson("vehiculos_actualizado.json");
    }
}
