package Producto;

public class MainProducto {
    public static void main(String[] args) {
        Producto p1 = new ProductoGeneral("Teclado",8.99);
        System.out.println(p1);

        Producto p2 = new ProductoReducido("Ratón",8.99);
        System.out.println(p2);

    }
}
