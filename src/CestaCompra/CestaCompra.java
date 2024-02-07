package CestaCompra;

import java.util.ArrayList;
import java.util.List;

public class CestaCompra {
    private double presupuesto;
    List<Producto> objetos;

    public CestaCompra(double presupuesto) {
        this.presupuesto = presupuesto;
        objetos = new ArrayList<>();
    }

    void addElemento(String nombre){
        objetos.add();
    }

    List<CestaCompra.Producto> getCesta(){

        return objetos;
    }

    double getPrecioCesta(){

        return 0;
    }
}
