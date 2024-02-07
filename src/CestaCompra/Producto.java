package CestaCompra;

public abstract class Producto implements Comprable{
    @Override
    public boolean hayUnidades(int cantidad) {
        return true;
    }

    @Override
    public void cogerUnidad() {

    }


}
