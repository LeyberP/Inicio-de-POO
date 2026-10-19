class Producto {
    String nombre;
    double precio;
    int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void vender(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
        }
    }

    public void mostrar() {
        String texto = String.format("%s : $%.2f", nombre, precio);
        if (stock < 5) {
            texto += "  Reponer";
        }
        System.out.println(texto);
    }
}