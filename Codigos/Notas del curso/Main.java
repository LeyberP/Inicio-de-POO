public class Main {
    public static void main(String[] args) {
        Estudiante[] estudiantes = {
            new Estudiante("Ana", 8, 9, 7.5),
            new Estudiante("Luis", 6, 5.5, 6),
            new Estudiante("Maria", 4, 3.5, 5),
            new Estudiante("Carlos", 7, 7, 8),
            new Estudiante("Sofia", 5, 4, 6)
        };

        int aprobados = 0;

        for (Estudiante e : estudiantes) {
            e.calcularPromedio();
            System.out.printf("%s : %.2f %s%n", e.nombre, e.promedio, e.estado());
            if (e.estado().equals("Aprobado")) {
                aprobados++;
            }
        }

        System.out.println();
        System.out.println("Estudiantes aprobados: " + aprobados);
    }
}