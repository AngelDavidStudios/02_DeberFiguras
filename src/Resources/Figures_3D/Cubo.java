package Resources.Figures_3D;

import Resources.Figures_2D.Cuadrado;

public class Cubo extends Cuadrado {

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

    public double cuboVolumen() {
        
        double volumen;
        
        l1 = obtenerDistancias(0, 1);

        volumen = Math.pow(l1, 3);

        return volumen;
    }

    public double cuboArea() {
        
        double area;

        double d1 = obtenerDistancias(0, 1);

        area = 6 * Math.pow(d1, 2);

        return area;

    }
}
