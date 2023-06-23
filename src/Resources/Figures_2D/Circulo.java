package Resources.Figures_2D;

import Resources.Figuras;
import Resources.Points;

public class Circulo extends Figuras {

    double radio;
    
    @Override
    public double figuraPerimetro() {
        Points punto1 = listaPuntos.get(0);
        Points punto2 = listaPuntos.get(1);
        double perimetro;

        radio = obtenerDistancias(punto1, punto2);

        perimetro = Math.PI * Math.pow(radio, 2);

        return perimetro;

    }

    @Override
    public double figuraArea() { 
        double area;

        area = 2 * Math.PI * radio;

        return area;

    }    
}
