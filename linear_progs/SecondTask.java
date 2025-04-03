package linear_progs;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите координату x1: ");
        double x1 = scanner.nextDouble();

        System.out.print("Введите координату y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Введите координату x2: ");
        double x2 = scanner.nextDouble();

        System.out.print("Введите координату y2: ");
        double y2 = scanner.nextDouble();

        // Вычисление расстояния
        double D = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Расстояние между точками: " + D);

        scanner.close();
    }
}
