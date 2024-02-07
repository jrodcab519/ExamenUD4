package CestaCompra;

public class CestaCompraMain {
    public static void main(String[] args) throws NoHayExistenciasException {

    Suscripcion s = new Suscripcion("Mesas",5, 4.99);
    System.out.println(s);
    System.out.println(s.hayUnidades(4));
    System.out.println(s.getPrecioVenta());

    CestaCompra c = new CestaCompra(4.95);
    c.imprimir();

    }
}
