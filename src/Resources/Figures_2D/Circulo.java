package Resources.Figures_2D;

import Resources.Figuras;

public class Circulo extends Figuras {

    public double radio;

    public Circulo(String nombre) {
        this.name = nombre;
    }
    
    @Override
    public double figuraPerimetro() {
        double perimetro;

        radio = obtenerDistancias(0, 1);

        perimetro = 2 * Math.PI * radio;

        return perimetro;
    }

    @Override
    public double figuraArea() { 
        double area;

        area = 2 * Math.PI * radio;

        return area;

    }    
}
