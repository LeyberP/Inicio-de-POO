public class Main5 {
    public static void main(String[] args) {
        Libro[] libros = {
            new Libro("Cien anios de soledad", "Gabriel Garcia Marquez"),
            new Libro("El principito", "Antoine de Saint-Exupery"),
            new Libro("Don Quijote", "Miguel de Cervantes"),
            new Libro("La odisea", "Homero")
        };

        Socio s1 = new Socio("Ana");
        Socio s2 = new Socio("Luis");

        // El primer socio presta 2 libros y el segundo 1
        s1.prestar(libros[0]);
        s1.prestar(libros[1]);
        s2.prestar(libros[2]);

        System.out.println("--- Libros ---");
        for (Libro l : libros) {
            String estado = l.disponible ? "Disponible" : "Prestado";
            System.out.println(l.titulo + " : " + estado);
        }

        System.out.println();
        System.out.println("--- Socios ---");
        System.out.println(s1.nombre + " : " + s1.librosPrestados);
        System.out.println(s2.nombre + " : " + s2.librosPrestados);

        int disponibles = 0;
        for (Libro l : libros) {
            if (l.disponible) {
                disponibles++;
            }
        }
        System.out.println();
        System.out.println("Libros disponibles: " + disponibles);
    }
}
