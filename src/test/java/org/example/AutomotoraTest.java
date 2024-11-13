package org.example;

import org.junit.jupiter.api.*;

import static jdk.internal.org.objectweb.asm.util.CheckClassAdapter.verify;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class AutomotoraTest {

    private IGestorDeDatos gestorDeDatosMock; // Mock de la interfaz IGestorDeDatos

    @InjectMocks
    private Automotora automotora; // La clase que estamos probando

    @BeforeEach
    void setUp() {
        // Inicializa los mocks antes de cada prueba
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAgregarVehiculo() {
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
    void testCargarDesdeJSON() {
        // Crear una lista de vehículos de prueba
        List<Vehiculo> vehiculosCargados = List.of(
                new Auto("Azul", 2018, "Ford", 18000, "4", 120),
                new Bicicleta("Negra", 2021, "Giant", 500, "Montaña")
        );

        // Simulamos que el mock devuelve la lista de vehículos cargados
        when(gestorDeDatosMock.leerVehiculos("vehiculos.json")).thenReturn(vehiculosCargados);

        // Cargar los vehículos desde el JSON
        automotora.cargarDesdeJSON("vehiculos.json");

        // Verificar que los vehículos se hayan cargado correctamente
        List<Vehiculo> vehiculos = automotora.getVehiculos();
        assertEquals(2, vehiculos.size(), "La lista de vehículos debería tener dos vehículos.");
        assertEquals(vehiculosCargados, vehiculos, "Los vehículos cargados no son los esperados.");
    }

    @Test
    void testGuardarEnJSON() {
        // Crear un vehículo de prueba
        Vehiculo vehiculo = new Auto("Blanco", 2019, "Chevrolet", 22000, "4", 160);

        // Agregar el vehículo
        automotora.agregarVehiculo(vehiculo);

        // Llamar al método guardar en JSON
        automotora.guardarEnJSON("vehiculos_guardados.json");


    }
}
