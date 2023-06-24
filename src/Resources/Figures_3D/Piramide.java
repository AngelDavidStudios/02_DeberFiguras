package Resources.Figures_3D;

import Resources.Points;
import Resources.Figures_2D.Triangulo;

public class Piramide extends Triangulo {

    Points baricentroG;
    
    public void baricentro() {

        Points punto1 = listaPuntos.get(0);
        Points punto2 = listaPuntos.get(1);
        Points punto3 = listaPuntos.get(2);

        double baricentroX = (punto1.getX() + punto2.getX() + punto3.getX()) / 3;
        double baricentroY = (punto1.getY() + punto2.getY() + punto3.getY()) / 3;
        double baricentroZ = (punto1.getZ() + punto2.getZ() + punto3.getZ()) / 3;

        baricentroG = new Points(baricentroX, baricentroY, baricentroZ);
    }

    public double areaCaras( double a, double b, double c) {
        double s;
        double areaT;

        s = (a + b + c) / 2;

        areaT = Math.sqrt(s * (s-a) * (s-b) * (s-c));

        return areaT;

    }

    public double alturaPiramide() {

        Points punto4 = listaPuntos.get(3);

        double altura;

        altura = Math.sqrt(Math.pow((baricentroG.getX() - punto4.getX()),2) + 
                    Math.pow((baricentroG.getY() - punto4.getY()),2) +
                    Math.pow((baricentroG.getZ() - punto4.getZ()),2));

        return altura;
    }

    public double volumenPiramide(double areaBase, double altura) {

        double volumenPiramide = (areaBase * altura) / 3;

        return volumenPiramide;
    }

    public double areaSuperficial( double areaTriangulo, double areaCara2, double areaCara3, double areaCara4) {

        double areaS = (areaTriangulo + areaCara2 + areaCara3 + areaCara4);

        return areaS;

    }
}
