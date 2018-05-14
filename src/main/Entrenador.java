package main;

public class Entrenador extends SeleccionFutbol {
    
    private int idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
    }

    public Entrenador(int idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion=idFederacion;
    }

    public void planificarEntrenamiento() {

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
