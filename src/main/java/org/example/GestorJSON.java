import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class GestorJSON {

    private ObjectMapper objectMapper;

    // Constructor
    public GestorJSON() {
        objectMapper = new ObjectMapper();
    }

    // Método para guardar un objeto en un archivo JSON
    public void guardarEnArchivo(Object objeto, String rutaArchivo) throws IOException {
        objectMapper.writeValue(new File(rutaArchivo), objeto);
        System.out.println("Objeto guardado en el archivo JSON: " + rutaArchivo);
    }

    // Método para leer un archivo JSON y convertirlo a un objeto Java
    public <T> T leerDesdeArchivo(String rutaArchivo, Class<T> tipoObjeto) throws IOException {
        return objectMapper.readValue(new File(rutaArchivo), tipoObjeto);
    }

}
