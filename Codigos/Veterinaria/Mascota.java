class Mascota {
    String nombre;
    String especie;
    int edad;
    double peso;

    public Mascota(String nombre, String especie, int edad, double peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
    }

    public void mostrar() {
        String texto = String.format("%s : %s : %.1f", nombre, especie, peso);
        if (peso > 20) {
            texto += "  Revisar peso";
        }
        System.out.println(texto);
    }
}