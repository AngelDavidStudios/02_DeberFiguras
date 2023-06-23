import java.util.Scanner;

import Resources.Figures_2D.Circulo;
import Resources.Figures_2D.Cuadrado;
import Resources.Figures_2D.Triangulo;

public class App {
    public static void main(String[] args) throws Exception {

        Triangulo triangle = new Triangulo();
        Cuadrado square = new Cuadrado();
        Circulo circulo = new Circulo();        

        Scanner scanner = new Scanner(System.in);
        String opcion;
        
        do {
            limpiarConsola();
            mostrarMenu();
                opcion = scanner.nextLine();
            
            switch (opcion) {
                case "a":
                    square.ingresarPuntos(4);
                    double perimetro = square.figuraPerimetro();
                    double area = square.figuraArea();

                    System.out.println("El perimetro es: " + perimetro);
                    System.out.println("El area es: " + area);
                    
                    break;
                case "b":
                    triangle.ingresarPuntos(3);
                    double perimetro2 = triangle.figuraPerimetro();
                    double area2 = triangle.figuraArea();

                    System.out.println("El perimetro es: " + perimetro2);
                    System.out.println("El area es: " + area2);
                    
                    break;
                case "c":
                    circulo.ingresarPuntos(1);
                    double perimetro3 = circulo.figuraPerimetro();
                    double area3 = circulo.figuraArea();

                    System.out.println("El perimetro es: " + perimetro3);
                    System.out.println("El area es: " + area3);
                    
                    break;
                case "d":
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción invalida. Por favor, selecciona una opcion valida.");
                    break;
            }
        } while (!opcion.equals("d"));
        
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("----- Menu -----");
        System.out.println("(a) Cuadrado");
        System.out.println("(b) Triangulo");
        System.out.println("(c) Circulo");
        System.out.println("(d) Salir");
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