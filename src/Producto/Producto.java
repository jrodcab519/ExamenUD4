package Producto;

public abstract class Producto {
    private String descripcion;
    private double precioBruto;

    public Producto() {
    }

    public Producto(String descripcion, double precioBruto) throws IllegalArgumentException {
        if(descripcion.isEmpty()){
            throw new IllegalArgumentException("La descripción no puede estar vacía.");
        }
        this.descripcion = descripcion;
        if(precioBruto < 0){
            throw new IllegalArgumentException("El precio bruto debe ser igual o mayor que 0");
        }
        this.precioBruto = precioBruto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioBruto() {
        return precioBruto;
    }

    @Override
    public String toString() {
        return descripcion + ": " + precioBruto + " euros.";
    }

    public abstract double getPrecioNeto();


}
