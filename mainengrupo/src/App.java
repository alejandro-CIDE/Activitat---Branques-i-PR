import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre del alumno: ");
        String nombreAl = sc.next();

        afegirnota alumno = new afegirnota(nombreAl);

        for (int i=0;i<3;i++) {
            System.out.println("Nota "+(i+1)+": ");
            double nota = sc.nextDouble();
            alumno.setNumNotas(i, nota);
        }

       mostrarresultat resultado = new mostrarresultat(alumno);

    }
}
