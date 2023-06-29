package Resources.Figures_3D;

import Resources.Interfaz3D;
import Resources.Figures_2D.Circulo;

public class Esfera extends Circulo implements Interfaz3D {

    public Esfera(String nombre) {
    super(nombre);
    }

    public double superficies3D() {
        double superficie;

        superficie = 4 * figuraPerimetro();

        return superficie;
    }

    public double volumen3D() {
        double volumen;

        radio = obtenerDistancias(0, 1);

        volumen = (4/3) * Math.PI * Math.pow(radio, 3);

        return volumen;
    }

    public String getNombre3D() {
        return getNombre();
    }
    
}
