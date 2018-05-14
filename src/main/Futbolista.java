package main;

public class Futbolista extends SeleccionFutbol {
    
    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
    }

    public Futbolista(int dorsal, String demarcacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal=dorsal;
        this.demarcacion=demarcacion;
    }

    public void entrevista() {

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
