package Resources.Figures_2D;

import Resources.Figuras;

public class Cuadrado extends Figuras{

    public double l1;
    public double l2;
    public double l3;
    public double l4;
    
    @Override
    public double figuraPerimetro() {
        double perimetro;

        l1 = obtenerDistancias(0, 1);
        l2 = obtenerDistancias(1, 3);
        l3 = obtenerDistancias(2, 3);
        l4 = obtenerDistancias(0, 2);

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
