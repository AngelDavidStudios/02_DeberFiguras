import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Resources.Figuras;
import Resources.Interfaz3D;
import Resources.Figures_2D.Circulo;
import Resources.Figures_2D.Cuadrado;
import Resources.Figures_2D.Triangulo;
import Resources.Figures_3D.Cubo;
import Resources.Figures_3D.Esfera;
import Resources.Figures_3D.Piramide;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Figuras> HistorialFigures = new ArrayList<Figuras>();
        
        Scanner scanner = new Scanner(System.in);
        String opcion;
        
        do {
            limpiarConsola();
            mostrarMenu();
            opcion = scanner.nextLine();
            
            switch (opcion) {
                case "a":
                    square(HistorialFigures);
                    enter(scanner);
                    break;

                case "b":
                    triangle(HistorialFigures);
                    enter(scanner);
                    break;

                case "c":
                    circle(HistorialFigures);
                    enter(scanner);
                    break;
                
                case "d":
                    cube3D(HistorialFigures);
                    enter(scanner);
                    break;

                case "e":
                    piramid3D(HistorialFigures);
                    enter(scanner);  
                    break;

                case "f":
                    sphere3D(HistorialFigures);
                    enter(scanner);
                    break;

                case "g":
                    historialFigures(HistorialFigures);
                    enter(scanner);
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
        System.out.println("-------------- Menu --------------");
        System.out.println("----------- Figuras 2D -----------");
        System.out.println("(a) Cuadrado");
        System.out.println("(b) Triangulo");
        System.out.println("(c) Circulo");
        System.out.println("----------- Figuras 3D -----------");
        System.out.println("(d) Cubo");
        System.out.println("(e) Piramide");
        System.out.println("(f) Esfera");
        System.out.println("----------- Opciones ------------");
        System.out.println("(g) Historial de figuras");
        System.out.println("(h) Salir");
        System.out.println(" ");
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
    
    private static void square(List<Figuras> HistorialFigures) {
        Cuadrado square = new Cuadrado("Cuadrado");
        square.ingresarPuntos(4);
        double perimetro = square.figuraPerimetro();
        double area = square.figuraArea();
        HistorialFigures.add(square);

        System.out.println("El perimetro es: " + perimetro);
        System.out.println("El area es: " + area);
    }

    private static void triangle(List<Figuras> HistorialFigures) {
        Triangulo triangle = new Triangulo("Triangulo");
        triangle.ingresarPuntos(3);
        double perimetro2 = triangle.figuraPerimetro();
        double area2 = triangle.figuraArea();

        HistorialFigures.add(triangle);

        System.out.println("El perimetro es: " + perimetro2);
        System.out.println("El area es: " + area2);
        
    }

    private static void circle(List<Figuras> HistorialFigures) {
        Circulo circulo = new Circulo("Circulo");
        circulo.ingresarPuntos(2);
        double perimetro3 = circulo.figuraPerimetro();
        double area3 = circulo.figuraArea();

        HistorialFigures.add(circulo);
        
        System.out.println("El perimetro es: " + perimetro3);
        System.out.println("El area es: " + area3);

    }

    private static void cube3D(List<Figuras> HistorialFigures) { 
        Cubo cube = new Cubo("Cubo");
        cube.ingresarPuntos(4);
        double volumencube = cube.volumen3D();
        double superficie = cube.superficies3D();
        HistorialFigures.add(cube);

        System.out.println("El volumen del cubo es: " + volumencube);
        System.out.println("La superficie del cubo es: " + superficie);

    }

    private static void piramid3D(List<Figuras> HistorialFigures) { 
        Piramide piramid = new Piramide("Piramide");
        piramid.ingresarPuntos(4);
        piramid.baricentro();

        double volumenPiramid3D = piramid.volumen3D();
        double superPiramid3D = piramid.superficies3D();
        HistorialFigures.add(piramid);

        System.out.println("El volumen de la piramide es: " + volumenPiramid3D);
        System.out.println("La superficie de la piramide es: " + superPiramid3D);
}

    private static void sphere3D(List<Figuras> HistorialFigures) { 
        Esfera sphere = new Esfera("Esfera");
        sphere.ingresarPuntos(2);
        sphere.figuraPerimetro();
        double superficie = sphere.superficies3D();
        double volumensphere = sphere.volumen3D();

        HistorialFigures.add(sphere);

        System.out.println("La superficie de la esfera es: " + superficie);
        System.out.println("El volumen de la esfera es: " + volumensphere);
    }

    private static void historialFigures( List<Figuras> HistorialFigures) {
        for (Figuras figura : HistorialFigures) {

            String nombreFigura = figura.getNombre();
            double areasFiguras = figura.figuraArea();
            double perimetrosFiguras = figura.figuraPerimetro();

            if (figura instanceof Interfaz3D) { 
                Interfaz3D figura3D = (Interfaz3D) figura;
                
                System.out.println("------------------------------------------- ");
                System.out.println("Tipo de Figura 3D: " + figura3D.getNombre3D());
                System.out.println("Superficie de la figura: " + figura3D.superficies3D());
                System.out.println("Volumen de la figura: " + figura3D.volumen3D());
            } else {
                System.out.println("------------------------------------------- ");
                System.out.println("El área de la figura " + nombreFigura + " es: " + areasFiguras);
                System.out.println("El perimetro de la figura " + nombreFigura + " es: " + perimetrosFiguras);                        

            }
        }
    }

    private static void enter(Scanner sc) {
        System.out.println("Presione cualquier tecla para regresar al menú principal...");
        sc.nextLine(); 

    }
}