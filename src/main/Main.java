package main;

import java.util.ArrayList;

public class Main {

    private static ArrayList<SeleccionFutbol> seleccion = new ArrayList();
    
    public static void main(String[] args) {
        
        //int dorsal, String demarcacion, int id, String nombre, String apellidos, int edad
        SeleccionFutbol futbolista = new Futbolista(1, "Portero", 873493, "Pepe", "Portas",24);
        seleccion.add(futbolista);
        
        //String titulacion, int añosExperiencia, int id, String nombre, String apellidos, int edad
        SeleccionFutbol masajista = new Masajista("Masajista", 20, 693123, "Antonio", "López",34);
        seleccion.add(masajista);
        
        //int idFederacion, int id, String nombre, String apellidos, int edad
        SeleccionFutbol entrenador = new Entrenador(1234, 432123, "Vicente", "Del Bosque",55);
        seleccion.add(entrenador);
        
        // Recorro el Array mostrando los datos de la Selección
        
        for (SeleccionFutbol persona : seleccion) {
            
            System.out.println(persona.toString());
        }
    }
    
}
