package Producto;

public final class ProductoReducido extends ProductoIVA{
    private final double iva = 5;
    public ProductoReducido(String descripcion, double precioBruto) throws IllegalArgumentException {
        super(descripcion, precioBruto);
        setIva(this.iva);
    }
}
