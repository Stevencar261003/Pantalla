import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las coordenadas del punto 1:");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double z1 = scanner.nextDouble();
        Punto punto1 = new Punto(x1, y1, z1);

        System.out.println("Ingrese las coordenadas del punto 2:");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double z2 = scanner.nextDouble();
        Punto punto2 = new Punto(x2, y2, z2);

        System.out.println("Ingrese las coordenadas del punto 3:");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        double z3 = scanner.nextDouble();
        Punto punto3 = new Punto(x3, y3, z3);

        System.out.println("Ingrese las coordenadas del punto 4:");
        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();
        double z4 = scanner.nextDouble();
        Punto punto4 = new Punto(x4, y4, z4);
    }
}