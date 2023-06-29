import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Resources.Figuras;
import Resources.Figures_2D.Circulo;
import Resources.Figures_2D.Cuadrado;
import Resources.Figures_2D.Triangulo;
import Resources.Figures_3D.Cubo;
import Resources.Figures_3D.Esfera;
import Resources.Figures_3D.Piramide;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Figuras> HistorialFigures = new ArrayList<Figuras>();
        
        int bucle = 0;
        
        Scanner scanner = new Scanner(System.in);
        String opcion;
        
        do {
            limpiarConsola();
            mostrarMenu();
            opcion = scanner.nextLine();
            
            switch (opcion) {
                case "a":
                    Cuadrado square = new Cuadrado("Cuadrado");
                    square.ingresarPuntos(4);
                    double perimetro = square.figuraPerimetro();
                    double area = square.figuraArea();
                    HistorialFigures.add(square);

                    System.out.println("El perimetro es: " + perimetro);
                    System.out.println("El area es: " + area);
                    bucle++;

                    System.out.println("Presione cualquier tecla para regresar al menú principal...");
                    scanner.nextLine(); 
                    
                    break;

                case "b":
                    Triangulo triangle = new Triangulo("Triangulo");
                    triangle.ingresarPuntos(3);
                    double perimetro2 = triangle.figuraPerimetro();
                    double area2 = triangle.figuraArea();

                    HistorialFigures.add(triangle);

                    System.out.println("El perimetro es: " + perimetro2);
                    System.out.println("El area es: " + area2);
                    bucle++;

                    System.out.println("Presione cualquier tecla para regresar al menú principal...");
                    scanner.nextLine(); 
                    
                    break;

                case "c":
                    Circulo circulo = new Circulo("Circulo");
                    circulo.ingresarPuntos(2);
                    double perimetro3 = circulo.figuraPerimetro();
                    double area3 = circulo.figuraArea();

                    HistorialFigures.add(circulo);
                    
                    System.out.println("El perimetro es: " + perimetro3);
                    System.out.println("El area es: " + area3);
                    bucle++;
                    
                    System.out.println("Presione cualquier tecla para regresar al menú principal...");
                    scanner.nextLine(); 
                    
                    break;
                
                case "d":
                    Cubo cube = new Cubo("Cubo");
                    cube.ingresarPuntos(4);
                    boolean iscube = cube.isCube();
                    if (iscube) {
                        System.out.println("El cubo es un cubo");
                        double volumencube = cube.cuboVolumen();
                        double superficie = cube.cuboArea();

                        System.out.println("El volumen del cubo es: " + volumencube);
                        System.out.println("La superficie del cubo es: " + superficie);
                        bucle++;

                        System.out.println("Presione cualquier tecla para regresar al menú principal...");
                        scanner.nextLine(); 

                    } else {
                        System.out.println("No es un cubo, intentelo nuevamente");
                    }
                    break;

                case "e":
                    Piramide piramid = new Piramide("Piramide");
                    piramid.ingresarPuntos(4);

                    double ladoA = piramid.obtenerDistancias(0,1);
                    double ladoB = piramid.obtenerDistancias(0,2);
                    double ladoC = piramid.obtenerDistancias(2,1);

                    double ladoD = piramid.obtenerDistancias(1, 3);
                    double ladoE = piramid.obtenerDistancias(0, 3);
                    double ladoF = piramid.obtenerDistancias(2, 3);

                    double areaLateralLeft = piramid.areaCaras(ladoB, ladoE, ladoF);
                    double areaLateralRight = piramid.areaCaras(ladoC, ladoD, ladoF);
                    double areaFront = piramid.areaCaras(ladoA, ladoE, ladoD);

                    piramid.baricentro();
                    double areaBase = piramid.figuraArea();
                    double altura = piramid.alturaPiramide();

                    double volumenPiramid = piramid.volumenPiramide(areaBase, altura);
                    double superPiramid = piramid.areaSuperficial(areaBase, areaLateralLeft, areaLateralRight, areaFront);

                    System.out.println("El volumen de la piramide es: " + volumenPiramid);
                    System.out.println("La superficie de la piramide es: " + superPiramid);
                    bucle = bucle + 1;

                    System.out.println("Presione cualquier tecla para regresar al menú principal...");
                    scanner.nextLine(); 
                    
                    break;

                case "f":
                    Esfera sphere = new Esfera("Esfera");
                    sphere.ingresarPuntos(2);
                    sphere.figuraPerimetro();
                    double superficie = sphere.superficiesfera();
                    double volumensphere = sphere.volumenEsfera();

                    System.out.println("La superficie de la esfera es: " + superficie);
                    System.out.println("El volumen de la esfera es: " + volumensphere);
                    bucle = bucle + 1;

                    System.out.println("Presione cualquier tecla para regresar al menú principal...");
                    scanner.nextLine(); 
                    
                    break;

                case "g":
                    for (int index = 0; index < bucle; index++) {

                        double areasFiguras = HistorialFigures.get(index).figuraArea();
                        double perimetrosFiguras = HistorialFigures.get(index).figuraPerimetro();
                        String nombreFigura = HistorialFigures.get(index).getNombre();

                        System.out.println("El área de la figura " + nombreFigura + " es: " + areasFiguras);
                        System.out.println("El perimetro de la figura " + nombreFigura + " es: " + perimetrosFiguras);                        
                    }
                    
                    System.out.println("Presione cualquier tecla para regresar al menú principal...");
                    scanner.nextLine(); 
                    
                    break;

                case "h":
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción invalida. Por favor, selecciona una opcion valida.");
                    break;
            }
        } while (!opcion.equals("h"));
        
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("----- Menu -----");
        System.out.println("(a) Cuadrado");
        System.out.println("(b) Triangulo");
        System.out.println("(c) Circulo");
        System.out.println("(d) Cubo");
        System.out.println("(e) Piramide");
        System.out.println("(f) Esfera");
        System.out.println("(g) Historial Figuras ingresadas");
        System.out.println("(h) Salir");
        System.out.print("Selecciona una opcion: ");
    }

    private static void limpiarConsola() {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (Exception e) {
            System.out.println("Error al limpiar la consola: " + e.getMessage());
        }
    }       
}