public class calcularmitjana {
    
    public static double calcularMedia(afegirnota alumno) {

        double[] notas = alumno.getNumNotas();
        double total = 0;

        for (int i = 0; i < notas.length; i++) {
            total += notas[i];
        }

        return total/(double)notas.length;
    }

}
