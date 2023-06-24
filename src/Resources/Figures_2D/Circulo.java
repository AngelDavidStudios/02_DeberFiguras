package Resources.Figures_2D;

import Resources.Figuras;

public class Circulo extends Figuras {

    public double radio;
    
    @Override
    public double figuraPerimetro() {
        double perimetro;

        radio = obtenerDistancias(0, 1);

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
