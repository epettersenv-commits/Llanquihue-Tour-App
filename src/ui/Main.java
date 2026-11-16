package ui;

import data.GestorDatos;
import model.Tour;

import java.util.ArrayList;


/**
 * Clase principal. Carga los tours desde el archivo, los recorre y los filtra.
 *
 * @author Elizabeth Pettersen
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("::::: Llanquihue Tour - Catálogo de tours :::::\n");

        //1. Carga los datos del archivo
        GestorDatos gestor = new GestorDatos();
        ArrayList<Tour> tours = gestor.cargarTours("resources/tours.txt");

        //Comprueba si existen tours
        if (tours.isEmpty()){
            System.out.println("No hay tours registrados en el catálogo");
            return;
        }

        //2. Recorrido: muestra todos los elementos de la colección
        System.out.println("=== Todos los tours (" + tours.size() + ") ===");
        for (Tour tour : tours) {
            System.out.println(tour);
        }

        //3. Filtro 1: tours de tipo "Gastronómico"
        System.out.println("\n=== Tours gastronómicos ===");
        int gastronomicos = 0;
        for (Tour tour : tours) {
            if (tour.getTipo().equalsIgnoreCase("Gastronómico")) {
                System.out.println(tour);
                gastronomicos++;
            }
        }
        if (gastronomicos == 0) {
            System.out.println("No hay tours gastronómicos.");
        }

        //4. Filtro 2: tours con cupos disponibles (cupos > 0)
        System.out.println("\n=== Tours con cupos disponibles ===");
        int conCupos = 0;
        for (Tour tour : tours) {
            if (tour.getCupos() > 0) {
                System.out.println(tour);
                conCupos++;
            }
        }
        if (conCupos == 0) {
            System.out.println("No hay tours con cupos disponibles.");
        }
    }

}