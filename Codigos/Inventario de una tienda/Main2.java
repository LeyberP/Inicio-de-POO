public class Main2 {
    public static void main(String[] args) {
        Producto[] productos = {
            new Producto("Arroz", 2.50, 10),
            new Producto("Aceite", 4.00, 3),
            new Producto("Azucar", 1.80, 8),
            new Producto("Leche", 1.20, 2)
        };

        System.out.println("--- Productos iniciales ---");
        for (Producto p : productos) {
            p.mostrar();
        }

        productos[0].vender(3);
        productos[1].vender(3);

        System.out.println();
        System.out.println("--- Despues de la venta ---");
        for (Producto p : productos) {
            p.mostrar();
        }

        double total = 0;
        for (Producto p : productos) {
            total += p.precio * p.stock;
        }
        System.out.printf("%nValor total del inventario: $%.2f%n", total);
    }
}