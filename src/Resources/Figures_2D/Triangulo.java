package Resources.Figures_2D;

import Resources.Figuras;

public class Triangulo extends Figuras {

    public double ladoA;
    public double ladoB;
    public double ladoC;

    private String name;

    public Triangulo(String nombre) {
        this.name = nombre;
    }

    public String getNombre() {
    return name;
    }
    
    @Override
    public double figuraPerimetro() {
        double perimetro;

        ladoA = obtenerDistancias(0, 1);
        ladoB = obtenerDistancias(0, 2);
        ladoC = obtenerDistancias(1, 2);

        perimetro = ladoA + ladoB + ladoC;

        return perimetro;
    }

    @Override
    public double figuraArea() { 
        double s;
        double area;

        s = figuraPerimetro()/2;

        area = Math.sqrt(s*(s-ladoA) * (s-ladoB) * (s-ladoC));

        return area;

    }
}
