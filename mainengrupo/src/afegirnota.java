import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class afegirnota {

    Scanner sc = new Scanner(System.in);
    private String nombre;
    int[] numNotas;

    // Constructor
    public afegirnota(String nombre) {
        numNotas = new int[3];
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int[] getNumNotas() {
        return numNotas.clone();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumNotas(int posicion, int newNota) {
        this.numNotas[posicion] = newNota;
    }

}
