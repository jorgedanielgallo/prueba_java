import java.util.Scanner;

public class AreaCirculo {

    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el radio del círculo: ");
        double radio = sc.nextDouble();

        double areaCirculo = calcularAreaCirculo(radio);

        System.out.println("El área del círculo es: " + areaCirculo);
    }
}
