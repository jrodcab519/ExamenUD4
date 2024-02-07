package Producto;

public abstract class ProductoIVA extends Producto{
    private double iva;

    public ProductoIVA(String descripcion, double precioBruto, double iva) throws IllegalArgumentException {
        super(descripcion, precioBruto);
        this.iva = iva;
    }


    @Override
    public  double getPrecioNeto() {
        double precioNeto = getPrecioBruto()*(1 + iva/100);
        return precioNeto;
    }

    @Override
    public String toString() {
        return super.toString() + " + " + iva + "%" + " = " + getPrecioNeto() + " euros.";
    }
}
