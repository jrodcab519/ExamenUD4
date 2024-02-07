package Producto;

public abstract class ProductoIVA extends Producto{
    private double iva;

    public ProductoIVA(String descripcion, double precioBruto, double iva) throws IllegalArgumentException {
        super(descripcion, precioBruto);
        this.iva = iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public ProductoIVA(String descripcion, double precioBruto) throws IllegalArgumentException {
        super(descripcion, precioBruto);
    }

    @Override
    public  double getPrecioNeto() {

        return getPrecioBruto()*(1 + getIva()/100);
    }

    public double getIva() {
        return iva;
    }

    @Override
    public String toString() {
        return super.toString() + " + " + iva + "%" + " = " + getPrecioNeto() + " euros.";
    }
}
