package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestorDeDatos {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    // Método para leer vehículos desde un archivo JSON
    public static List<Vehiculo> leerVehiculosDesdeJson(String archivoJson) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        try {
            Vehiculo[] vehiculoArray = objectMapper.readValue(new File(archivoJson), Vehiculo[].class);
            for (Vehiculo vehiculo : vehiculoArray) {
                vehiculos.add(vehiculo);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo JSON: " + e.getMessage());
        }
        return vehiculos;
    }

    // Método para guardar vehículos en un archivo JSON
    public static void guardarVehiculosEnJson(String archivoJson, List<Vehiculo> vehiculos) {
        try {
            objectMapper.writeValue(new File(archivoJson), vehiculos);
            System.out.println("Vehículos guardados en " + archivoJson);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo JSON: " + e.getMessage());
        }
    }
}
