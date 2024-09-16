import java.util.Scanner;

public class AreaTriangulo {

    // Función para calcular el área de un triángulo
    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la base del triángulo: ");
        double base = sc.nextDouble();

        System.out.print("Ingresa la altura del triángulo: ");
        double altura = sc.nextDouble();

        double areaTriangulo = calcularAreaTriangulo(base, altura);

        System.out.println("El área del triángulo es: " + areaTriangulo);
    }
}
