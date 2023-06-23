package Resources.Figures_2D;

import Resources.Figuras;
import Resources.Points;

public class Triangulo extends Figuras {

    double l1;
    double l2;
    double l3;
    
    @Override
    public double figuraPerimetro() {
        Points punto1 = listaPuntos.get(0);
        Points punto2 = listaPuntos.get(1);
        Points punto3 = listaPuntos.get(2);
        double perimetro;

        l1 = obtenerDistancias(punto1, punto2);
        l2 = obtenerDistancias(punto1, punto3);
        l3 = obtenerDistancias(punto2, punto3);

        perimetro = l1 + l2 + l3;

        return perimetro;

    }

    @Override
    public double figuraArea() { 
        double s;
        double area;

        s = figuraPerimetro()/2;

        area = Math.sqrt(s*(s-l1) * (s-l2) * (s-l3));

        return area;

    }
}
