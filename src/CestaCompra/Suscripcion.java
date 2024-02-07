package CestaCompra;

public class Suscripcion {
    private String descripcion;
    private int existencias;
    private double precio;

    public Suscripcion(String descripcion, int existencias, double precio) {
        if(descripcion.isEmpty()){
            throw new IllegalArgumentException("La descripción no puede estar vacía.");
        }
        this.descripcion = descripcion;
        if(existencias < 0){
            throw new IllegalArgumentException("Las existencias no pueden ser negativas");
        }
        this.existencias = existencias;
        if(precio < 0){
            throw new IllegalArgumentException("El precio debe ser igual o mayor que 0");
        }
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public int getExistencias() {
        return existencias;
    }
    public double getPrecio() {
        return precio;
    }


}
