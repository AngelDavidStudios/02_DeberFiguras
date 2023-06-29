package Resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Figuras {

    public String name;

    public List<Points> listaPuntos = new ArrayList<>();

    public abstract double figuraPerimetro();
    
    public abstract double figuraArea();

    public String getNombre() {
        return name;
    }
    
    public double obtenerDistancias(int indice1, int indice2) {
        Points punto1 = listaPuntos.get(indice1);
        Points punto2 = listaPuntos.get(indice2);
        double d;
        
        d = Math.sqrt(Math.pow((punto1.getX() - punto2.getX()),2) + 
                    Math.pow((punto1.getY() - punto2.getY()),2) +
                    Math.pow((punto1.getZ() - punto2.getZ()),2));
        return d;
        
    }

    public void ingresarPuntos( int numPuntos ) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= numPuntos; i++) {
            System.out.println("Ingrese la componente X del punto " + i + ": ");
            double x = sc.nextDouble();
            System.out.println("Ingrese la componente Y del punto " + i + ": ");
            double y = sc.nextDouble();
            System.out.println("Ingrese la componente Z del punto " + i + ": ");
            double z = sc.nextDouble();
            listaPuntos.add(new Points(x, y, z));
        }
    }
}
