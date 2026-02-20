import java.lang.reflect.Array;
import java.util.Arrays;

public class afegirnota {
//Variables
    private String nombre;
    double[] numNotas;

// Constructor
    public afegirnota(String nombre) {
        numNotas = new double[3];
        this.nombre = nombre;
    }

//Getters y Setters
    public String getNombre() {
        return this.nombre;
    }

    public double[] getNumNotas() {
        return numNotas.clone();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumNotas(int posicion, double newNota) {
        this.numNotas[posicion] = newNota;
    }

}
