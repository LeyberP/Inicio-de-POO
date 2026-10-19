public class Main3 {
    public static void main(String[] args) {
        Mascota m1 = new Mascota("Firulais", "Perro", 3, 25.0);
        Mascota m2 = new Mascota("Michi", "Gato", 2, 4.5);
        Mascota m3 = new Mascota("Rex", "Perro", 5, 18.0);

        System.out.println("--- Mascotas ---");
        m1.mostrar();
        m2.mostrar();
        m3.mostrar();

        System.out.println();
        Mascota m4 = m1;   // m4 NO es una copia: apunta al MISMO objeto que m1
        m4.edad = m4.edad + 1;

        /* Explicacion: en Java, los objetos se guardan por referencia.
        Al hacer Mascota m4 = m1, ambas variables apuntan al mismo
        objeto en memoria, por lo que al sumar 1 a m4.edad tambien
        cambia m1.edad (m1.edad pasa de 3 a 4).*/
        System.out.println("Edad de m1: " + m1.edad);
    }
}