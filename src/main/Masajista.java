package main;

public class Masajista extends SeleccionFutbol{
 
    private String titulacion;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
    }

    public Masajista(String titulacion, int aniosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion=titulacion;
        this.aniosExperiencia=aniosExperiencia;
    }

    public void darMasaje() {

    }
    
    @Override public void concentrarse() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override public void entrenar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override public void viajar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override public void jugarPartido() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
