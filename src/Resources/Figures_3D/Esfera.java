package Resources.Figures_3D;

import Resources.Figures_2D.Circulo;

public class Esfera extends Circulo {

    public Esfera(String nombre) {
    super(nombre);
    }

    public double superficiesfera() {
        double superficie;

        superficie = 4 * figuraPerimetro();

        return superficie;
    }

    public double volumenEsfera() {
        double volumen;

        radio = obtenerDistancias(0, 1);

        volumen = (4/3) * Math.PI * Math.pow(radio, 3);

        return volumen;
    }
    
}
