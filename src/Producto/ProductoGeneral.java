package Producto;

public final class ProductoGeneral extends ProductoIVA{

    private final double iva = 21;

    public ProductoGeneral(String descripcion, double precioBruto) throws IllegalArgumentException {
        super(descripcion, precioBruto);
        setIva(this.iva);

    }


}

