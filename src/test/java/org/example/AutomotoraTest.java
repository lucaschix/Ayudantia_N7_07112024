package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AutomotoraTest {
    private GestorDeDatos GestorDeDatos = new GestorDeDatos();
    private Automotora automotora= new Automotora(GestorDeDatos); // La clase que estamos probando

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void agregarVehiculo() {
        // Crear un vehículo de prueba
        Vehiculo vehiculo = new Auto("Rojo", 2020, "Toyota", 25000, "2", 150);

        // Agregar el vehículo
        automotora.agregarVehiculo(vehiculo);

        // Verificar que el vehículo se haya agregado
        List<Vehiculo> vehiculos = automotora.getVehiculos();
        assertEquals(1, vehiculos.size(), "La lista de vehículos debería tener un solo vehículo.");
        assertEquals(vehiculo, vehiculos.get(0), "El vehículo agregado no es el esperado.");
    }

    @Test
    void cargarDesdeJSON() {
        // Crear una lista de vehículos de prueba
        List<Vehiculo> vehiculosCargados = List.of(
                new Auto("Azul", 2018, "Ford", 18000, "4", 120),
                new Bicicleta("Negra", 2021, "Giant", 500, "Montaña")
        );

        //Primero los guardo
        automotora.agregarVehiculo(new Auto("Azul", 2018, "Ford", 18000, "4", 120));
        automotora.agregarVehiculo(new Bicicleta("Negra", 2021, "Giant", 500, "Montaña"));
        automotora.guardarEnJSON("vehiculos_guardados.json");

        // Cargar los vehículos desde el JSON
        automotora.cargarDesdeJSON("vehiculos_guardados.json");

        // Verificar que los vehículos se hayan cargado correctamente
        List<Vehiculo> vehiculos = automotora.getVehiculos();
        assertEquals(2, vehiculos.size(), "La lista de vehículos debería tener dos vehículos.");
        assertEquals(vehiculosCargados, vehiculos, "Los vehículos cargados no son los esperados.");
    }

    @Test
    void guardarEnJSON() {
        // Crear un vehículo de prueba
        Vehiculo vehiculo = new Auto("Blanco", 2019, "Chevrolet", 22000, "4", 160);

        // Agregar el vehículo
        automotora.agregarVehiculo(vehiculo);

        // Llamar al método guardar en JSON
        automotora.guardarEnJSON("vehiculos_guardados.json");


    }
}