package CestaCompra;

public class Suscripcion implements Comprable{
    private String descripcion;
    private int existencias;
    private double precio;

    public Suscripcion(String descripcion, int existencias, double precio) throws IllegalArgumentException, NoHayExistenciasException{
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

    @Override
    public String toString() {
        return "Suscripcion{" +
                "descripcion='" + getDescripcion() + '\'' +
                ", existencias=" + getExistencias() +
                ", precio=" + getPrecio() +
                '}';
    }

    @Override
    public boolean hayUnidades(int cantidad) {
        if(cantidad < existencias){
            return true;
        }
            return false;
    }

    @Override
    public void cogerUnidad() throws NoHayExistenciasException{
        if(existencias == 0){
            throw new NoHayExistenciasException();
        }
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio();
    }
}
