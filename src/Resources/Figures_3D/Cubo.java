package Resources.Figures_3D;

import Resources.Interfaz3D;
import Resources.Figures_2D.Cuadrado;

public class Cubo extends Cuadrado implements Interfaz3D {

    public Cubo(String nombre) {
    super(nombre);
    }

    public Boolean isCube() {

        if (l1 == l2 && l2 == l3 && l3 == l4) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double volumen3D() {
        
        double volumen;
        
        l1 = obtenerDistancias(0, 1);

        volumen = Math.pow(l1, 3);

        return volumen;
    }
    @Override
    public double superficies3D() {
        
        double area;

        double d1 = obtenerDistancias(0, 1);

        area = 6 * Math.pow(d1, 2);

        return area;
    }
    @Override
    public String getNombre3D() {
        return getNombre();
    }
}
