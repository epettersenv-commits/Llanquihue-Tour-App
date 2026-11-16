package data;

import model.Tour;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Lee el archivo de tours y crea los objetos tours
 *
 * @author Elizabeth Pettersen
 */
public class GestorDatos {
    /**
     * Lee el archivo línea por línea, separa los datos con split(";")
     * y guarda cada Tour en un Arraylist
     *
     * @param rutaArchivo ruta del archivo, por ejemplo "resources/tours.txt"
     * @return lista con los tours leídos (vacía si el archivo no pudo leer)
     */
    public ArrayList<Tour> cargarTours(String rutaArchivo) {
        ArrayList<Tour> tours = new ArrayList<>();

        //try-with-resources: cierra el archivo automáticamente al terminar
        try (BufferedReader lector = Files.newBufferedReader(Paths.get(rutaArchivo), StandardCharsets.UTF_8)) {
            String linea;
            int numeroLinea = 0;

            //Lee el archivo línea por línea
            while ((linea = lector.readLine()) != null) {
                numeroLinea++;
                if (linea.isBlank()) {
                    continue; //Ignora líneas vacías
                }

                //Separa los datos de línea usando ";"
                String[] partes = linea.split(";");

                try {
                    if (partes.length != 4) {
                        throw new IllegalArgumentException("Se esperaban 4 campos y hay " + partes.length);
                    }
                        String nombre = partes[0];
                        String tipo = partes[1];
                        int precio = Integer.parseInt(partes[2].trim());
                        int cupos = Integer.parseInt(partes[3].trim());

                    //Crea el objeto y lo agrega a la lista
                    tours.add(new Tour(nombre, tipo, precio, cupos));
                } catch (IllegalArgumentException e) {
                    //También atrapa NumberFormatException (precio o cupos que no son números)
                    System.out.println("Línea " + numeroLinea + " ignorada: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo '" + rutaArchivo + "': " + e.getMessage());
        }
        return tours;
    }
}
