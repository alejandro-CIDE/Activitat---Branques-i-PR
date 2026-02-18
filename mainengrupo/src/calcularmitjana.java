public class calcularmitjana {
    public static double calcularMedia(afegirnota alumno) {
        int[] notas = alumno.getNumNotas();
        int total = 0;

        for (int i = 0; i < notas.length; i++) {
            total += notas[i];
        }

        return (double)total/notas.length;
    }

}
