package Resources.Figures_2D;

import Resources.Figuras;
import Resources.Points;

public class Cuadrado extends Figuras{

    double l1;
    double l2;
    double l3;
    double l4;
    
    @Override
    public double figuraPerimetro() {
        Points punto1 = listaPuntos.get(0);
        Points punto2 = listaPuntos.get(1);
        Points punto3 = listaPuntos.get(2);
        Points punto4 = listaPuntos.get(3);
        double perimetro;

        l1 = obtenerDistancias(punto1, punto2);
        l2 = obtenerDistancias(punto2, punto4);
        l3 = obtenerDistancias(punto3, punto4);
        l4 = obtenerDistancias(punto1, punto3);

        perimetro = l1 + l2 + l3 + l4;

        return perimetro;

    }

    @Override
    public double figuraArea() { 
        double area;

        area = Math.pow(l1, 2);

        return area;

    }   
}
