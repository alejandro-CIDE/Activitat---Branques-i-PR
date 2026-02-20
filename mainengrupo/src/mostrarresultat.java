public class mostrarresultat {
    public mostrarresultat(afegirnota alumno) {
        double media = calcularmitjana.calcularMedia(alumno);

        if (media >= 5) {
            System.out.println(alumno.getNombre() + " ha aprobado");
            System.out.println("Media: "+media);
        } else {
            System.out.println(alumno.getNombre() + " ha suspendido");
            System.out.println("Media: "+media);
        }
    }

}
