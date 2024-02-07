package CestaCompra;

import java.util.ArrayList;
import java.util.List;

public class CestaCompra {
    private double presupuesto;
    List<Suscripcion> objetos;

    public CestaCompra(double presupuesto) {
        this.presupuesto = presupuesto;
        objetos = new ArrayList<>();
    }


    /* No recuerdo como agregar elementos
    void addElemento(String nombre){
        objetos.add(nombre);
    }
    */

   /*
    List<Producto> getCesta(){

        return List<>objetos;
    }
    */


    double getPrecioCesta(){

        return getPrecioCesta();
    }


    public void imprimir() {
        System.out.println("CESTA DE LA COMPRA " + " Pc Portátil:");
    }
}
